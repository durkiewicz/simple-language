package simple.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import simple.language.psi.SimpleNamedId;
import simple.language.psi.SimpleTypes;
import simple.language.psi.references.SimpleReference;

import java.util.Optional;

public class NamedIdMixin extends ASTWrapperPsiElement implements SimpleNamedId, PsiNamedElement {
    public NamedIdMixin(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    public String getName() {
        return this.getText();
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String s) throws IncorrectOperationException {
        ASTNode node = this.getNode().findChildByType(SimpleTypes.IDENTIFIER);
        if (node != null) {
            Optional.ofNullable(SimpleElementFactory.createIdentifier(this.getProject(), s))
                    .ifPresent(id -> this.getNode().replaceChild(node, id.getNode()));
        }
        return this;
    }

    @Override
    public PsiReference getReference() {
        return new SimpleReference(this);
    }
}
