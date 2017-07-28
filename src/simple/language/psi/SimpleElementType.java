package simple.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;
import simple.language.SimpleLanguage;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}
