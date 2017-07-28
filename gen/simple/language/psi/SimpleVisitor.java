// This is a generated file. Not intended for manual editing.
package simple.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class SimpleVisitor extends PsiElementVisitor {

  public void visitDefinition(@NotNull SimpleDefinition o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull SimpleExpression o) {
    visitPsiElement(o);
  }

  public void visitNamedId(@NotNull SimpleNamedId o) {
    visitPsiElement(o);
  }

  public void visitOperand(@NotNull SimpleOperand o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
