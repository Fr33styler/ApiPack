package ro.fr33styler.gameengine.api.text;

import org.jetbrains.annotations.Nullable;

public interface Context {

    @Nullable
    default String getVariable(String placeholder) {
        return null;
    }

    @Nullable
    default Boolean getCondition(String placeholder) {
        return null;
    }

}