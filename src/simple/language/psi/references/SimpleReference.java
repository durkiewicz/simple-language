package simple.language.psi.references;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import simple.language.psi.SimpleDefinition;

import java.util.Arrays;

public class SimpleReference extends PsiReferenceBase<PsiElement> implements PsiReference {

    public SimpleReference(PsiElement element) {
//        // This enables named element features (e.g. rename refactoring)
//        super(element, element.getTextRange());

        // This makes navigation work fine (Ctrl + Click)
        super(element, TextRange.allOf(element.getText()));
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return Arrays.stream(this.myElement.getContainingFile().getChildren())
                .filter(e -> e instanceof SimpleDefinition)
                .map(PsiElement::getFirstChild)
                .filter(e -> e.getText().equals(this.myElement.getText()))
                .findFirst()
                .orElse(null);
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }
}
