package com.fbp.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by ferron on 3/16/16.
 */
public class FBPFileType extends LanguageFileType {

    public static final FBPFileType INSTANCE = new FBPFileType();
    public static final String DEFAULT_EXTENSION = "fbp";

    private FBPFileType() {
        super(FBPLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "FBP";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "FBP Files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return FBPIcon.FILE;
    }
}
