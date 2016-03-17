package com.fbp.psi;

import com.fbp.lang.FBPFileType;
import com.fbp.lang.FBPLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by ferron on 3/16/16.
 */
public class FBPFile extends PsiFileBase {

    public FBPFile(@NotNull FileViewProvider fileViewProvider) {
        super(fileViewProvider, FBPLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return FBPFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "FBP File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
