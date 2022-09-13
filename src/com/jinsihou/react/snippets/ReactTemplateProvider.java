package com.jinsihou.react.snippets;


import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

/**
 * @author jinsihou
 * @date 2017/10/18
 */
public class ReactTemplateProvider extends TemplateContextType {
    protected ReactTemplateProvider() {
        super("REACT", "React");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        String name = templateActionContext.getFile().getName();
        return name.endsWith(".js") || name.endsWith(".jsx") || name.endsWith(".html") || name.endsWith(".ts");
    }
}
