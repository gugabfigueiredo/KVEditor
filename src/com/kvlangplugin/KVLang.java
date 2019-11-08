package com.kvlangplugin;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class KVLang extends Language {

    public static final KVLang INSTANCE = new KVLang("KV");

    protected KVLang(@NotNull String ID) {
        super(ID);
    }
}
