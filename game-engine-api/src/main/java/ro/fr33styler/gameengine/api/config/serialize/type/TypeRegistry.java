package ro.fr33styler.gameengine.api.config.serialize.type;

import ro.fr33styler.gameengine.api.config.InvalidConfigException;

public interface TypeRegistry {

    void register(Class<?> type, TypeToken typeToken);

    default void register(Class<?> typeA, Class<?> typeB, TypeToken typeToken) {
        register(typeA, typeToken);
        register(typeB, typeToken);
    }

    TypeToken get(Class<?> type, String id) throws InvalidConfigException;

}