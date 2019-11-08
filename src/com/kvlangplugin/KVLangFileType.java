package com.kvlangplugin;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class KVLangFileType extends LanguageFileType {
    public static final KVLangFileType INSTANCE = new KVLangFileType(KVLang.INSTANCE);

    protected KVLangFileType(@NotNull Language language) {
        super(language);
    }

    @NotNull
    @Override
    public String getName() {
        return "KVLang File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "KVLang file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "kv";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return KVLangIcons.FILE;
    }
}
