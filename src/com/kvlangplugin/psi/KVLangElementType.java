package com.kvlangplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.kvlangplugin.KVLang;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class KVLangElementType extends IElementType {
    public KVLangElementType(@NotNull @NonNls String debugName) {
        super(debugName, KVLang.INSTANCE);
    }
}
