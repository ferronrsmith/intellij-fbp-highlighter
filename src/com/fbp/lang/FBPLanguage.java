package com.fbp.lang;

import com.intellij.lang.Language;

/**
 * Created by ferron on 3/16/16.
 */
public class FBPLanguage extends Language {
    public static final FBPLanguage INSTANCE =  new FBPLanguage();

    private FBPLanguage () {
        super("FBP");
    }

}
