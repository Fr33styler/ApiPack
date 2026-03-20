package ro.fr33styler.gameengine.api.config.serialize.type;

import org.bukkit.configuration.ConfigurationSection;
import ro.fr33styler.gameengine.api.config.SettingField;

public class TypeContext {

    private ConfigurationSection section;
    private final TypeRegistry registry;
    private SettingField field;

    public TypeContext(TypeContext context) {
        this.section = context.getSection();
        this.registry = context.getRegistry();
        this.field = context.getField();
    }

    public TypeContext(ConfigurationSection section, TypeRegistry registry, SettingField field) {
        this.section = section;
        this.registry = registry;
        this.field = field;
    }

    public ConfigurationSection getSection() {
        return section;
    }

    public void setSection(ConfigurationSection section) {
        this.section = section;
    }

    public TypeRegistry getRegistry() {
        return registry;
    }

    public SettingField getField() {
        return field;
    }

    public void setField(SettingField field) {
        this.field = field;
    }

}
