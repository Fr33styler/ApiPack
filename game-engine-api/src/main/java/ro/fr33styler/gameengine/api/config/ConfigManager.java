package ro.fr33styler.gameengine.api.config;

import org.bukkit.configuration.ConfigurationSection;
import ro.fr33styler.gameengine.api.config.serialize.Configuration;
import ro.fr33styler.gameengine.api.config.serialize.type.TypeRegistry;
import ro.fr33styler.gameengine.api.util.BasicLogger;

import java.io.File;

public interface ConfigManager {

    BasicLogger getLogger();

    TypeRegistry getTypeRegistry();

    void tryLoad(Configuration configuration, File file);

    void load(Configuration configuration, File file) throws InvalidConfigException;

    void tryLoad(Configuration configuration, ConfigurationSection section);

    void load(Configuration configuration, ConfigurationSection section) throws InvalidConfigException;

    void trySave(Configuration configuration, File file);

    void save(Configuration configuration, File file) throws InvalidConfigException;

    void trySave(Configuration configuration, ConfigurationSection section);

    void save(Configuration configuration, ConfigurationSection section) throws InvalidConfigException;

}