package com.fbp.psi;

import com.fbp.lang.FBPLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by ferron on 3/16/16.
 */
public class FBPElementType extends IElementType {
    public FBPElementType(@NotNull @NonNls String debugName) {
        super(debugName, FBPLanguage.INSTANCE);
    }
}
