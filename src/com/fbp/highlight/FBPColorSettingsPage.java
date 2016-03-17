package com.fbp.highlight;

import com.fbp.lang.FBPIcon;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Created by ferron on 3/16/16.
 */
public class FBPColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", FBPSyntaxHighlighter.KEY),
            new AttributesDescriptor("Operator", FBPSyntaxHighlighter.OP),
            new AttributesDescriptor("Comment", FBPSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Brackets", FBPSyntaxHighlighter.BRACKETS),
            new AttributesDescriptor("Parens", FBPSyntaxHighlighter.PARENTHESES),
            new AttributesDescriptor("Number", FBPSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("String", FBPSyntaxHighlighter.STRING),
            new AttributesDescriptor("Bad Char", FBPSyntaxHighlighter.BAD_CHARACTER)
            };

    @Nullable
    @Override
    public Icon getIcon() {
        return FBPIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new FBPSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "# This is a FBP comment block\n" +
               "SplitInput(core/Split) OUT -> OBJECT GetSourceParentProperty(LodashGet:path=param,default_value=param)\n" +
               "SplitInput(core/Split) OUT -> IN2 LodashMerge(LodashMerge)\n" +
               "\n" +
               "GetSourceParentProperty OUT -> IN1 LodashMerge(LodashMerge)\n" +
               "\n" +
               "GetContentRecord OUT -> IN2 LodashMerge\n" +
               "'referenceKey' -> PATH GetLookupIdValues";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "FBP";
    }
}