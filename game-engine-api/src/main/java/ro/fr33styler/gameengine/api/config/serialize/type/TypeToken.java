package ro.fr33styler.gameengine.api.config.serialize.type;

import ro.fr33styler.gameengine.api.config.InvalidConfigException;
import ro.fr33styler.gameengine.api.config.SettingField;

public interface TypeToken {

    Object serialize(TypeContext context, Object deserialized) throws InvalidConfigException;

    Object deserialize(TypeContext context, Object serialized) throws InvalidConfigException;

    default boolean canModify(SettingField field, Object value) {
        return true;
    }

}