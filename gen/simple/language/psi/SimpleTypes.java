// This is a generated file. Not intended for manual editing.
package simple.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import simple.language.psi.impl.*;

public interface SimpleTypes {

  IElementType DEFINITION = new SimpleElementType("DEFINITION");
  IElementType EXPRESSION = new SimpleElementType("EXPRESSION");
  IElementType NAMED_ID = new SimpleElementType("NAMED_ID");
  IElementType OPERAND = new SimpleElementType("OPERAND");

  IElementType COMMENT = new SimpleTokenType("COMMENT");
  IElementType EQ = new SimpleTokenType("EQ");
  IElementType FRESH_LINE = new SimpleTokenType("FRESH_LINE");
  IElementType IDENTIFIER = new SimpleTokenType("IDENTIFIER");
  IElementType NUMBER_LITERAL = new SimpleTokenType("NUMBER_LITERAL");
  IElementType OPERATOR = new SimpleTokenType("OPERATOR");
  IElementType WHITE_SPACE = new SimpleTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == DEFINITION) {
        return new SimpleDefinitionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SimpleExpressionImpl(node);
      }
      else if (type == NAMED_ID) {
        return new SimpleNamedIdImpl(node);
      }
      else if (type == OPERAND) {
        return new SimpleOperandImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
