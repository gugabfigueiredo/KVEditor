package com.kvlangplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.kvlangplugin.KVLang;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class KVLangTokenType extends IElementType {
    public KVLangTokenType(@NotNull @NonNls String debugName) {
        super(debugName, KVLang.INSTANCE);
    }

    @Override
    public String toString() {
        return "KVLangTokenType." + super.toString();
    }
}
