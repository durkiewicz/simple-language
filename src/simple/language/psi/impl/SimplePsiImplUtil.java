package simple.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import simple.language.psi.SimpleDefinition;
import simple.language.psi.SimpleTypes;
import simple.language.psi.SimpleVariable;
import simple.language.psi.references.SimpleReference;

import java.util.Optional;

public class SimplePsiImplUtil {

    public static String getName(SimpleDefinition element) {
        ASTNode node = getDefinitionNameNode(element);
        if (node != null) {
            return node.getText();
        } else {
            return null;
        }
    }

    public static PsiElement setName(SimpleDefinition element, String newName) {
        ASTNode node = getDefinitionNameNode(element);
        if (node != null) {
            Optional.ofNullable(SimpleElementFactory.createIdentifier(element.getProject(), newName))
                    .ifPresent(id -> element.getNode().replaceChild(node, id.getNode()));
        }
        return element;
    }

    public static PsiElement getNameIdentifier(SimpleDefinition element) {
        ASTNode node = getDefinitionNameNode(element);
        if (node != null) {
            return node.getPsi();
        } else {
            return null;
        }
    }

    private static ASTNode getDefinitionNameNode(SimpleDefinition element) {
        return element.getNode().findChildByType(SimpleTypes.IDENTIFIER);
    }

    public static PsiReference getReference(SimpleVariable element) {
        return new SimpleReference(element);
    }
}
