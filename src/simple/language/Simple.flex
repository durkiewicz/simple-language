package simple.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static simple.language.psi.SimpleTypes.*;

%%

%class SimpleLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF= (\n|\r|\r\n)
WHITE_SPACE=[\ \t\f]
IDENTIFIER_CHAR=[[:letter:][:digit:]_']
IDENTIFIER={IDENTIFIER_CHAR}+
NUMBER_LITERAL=("-")?[:digit:]+(\.[:digit:]+)?
LINE_COMMENT=("--")[^\r\n]*

%%

<YYINITIAL> {
    "=" {
        return EQ;
    }
    "+" {
        return OPERATOR;
    }
    {IDENTIFIER} {
        return IDENTIFIER;
    }
    {NUMBER_LITERAL} {
        return NUMBER_LITERAL;
    }
    {WHITE_SPACE}+ {
        return TokenType.WHITE_SPACE;
    }
    {CRLF}*{LINE_COMMENT} {
        return COMMENT;
    }
    {CRLF}+ {
        return FRESH_LINE;
    }
}

. {
    return TokenType.BAD_CHARACTER;
}
