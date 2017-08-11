package simple.language.psi.references;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import simple.language.psi.SimpleDefinition;
import simple.language.psi.SimpleTypes;
import simple.language.psi.impl.SimpleElementFactory;

import java.util.Arrays;
import java.util.Optional;

public class SimpleReference extends PsiReferenceBase<PsiElement> implements PsiReference {

    public SimpleReference(PsiElement element) {
        super(element, TextRange.allOf(element.getText()));
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return Arrays.stream(this.myElement.getContainingFile().getChildren())
                .filter(e -> e instanceof SimpleDefinition)
                .filter(e -> e.getFirstChild().getText().equals(this.myElement.getText()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean isReferenceTo(PsiElement element) {
        return super.isReferenceTo(element);
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        ASTNode idNode = myElement.getNode().findChildByType(SimpleTypes.IDENTIFIER);
        if (idNode == null)
            return null;

        Optional.ofNullable(SimpleElementFactory.createIdentifier(myElement.getProject(), newElementName))
                .ifPresent(newId -> myElement.getNode().replaceChild(idNode, newId.getNode()));
        return myElement;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }
}
