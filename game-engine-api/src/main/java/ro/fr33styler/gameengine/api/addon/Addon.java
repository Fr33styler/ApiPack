package ro.fr33styler.gameengine.api.addon;

import org.apache.commons.lang.Validate;
import org.bukkit.Server;
import ro.fr33styler.gameengine.api.Engine;
import ro.fr33styler.gameengine.api.util.BasicLogger;

import java.io.File;

public abstract class Addon {

    private File file;
    private Engine engine;
    private File dataFolder;
    private BasicLogger logger;
    private AddonDescription description;

    public final void initialize(Engine engine, AddonDescription description, File dataFolder, File file) {
        Validate.isTrue(this.engine == null, "You cannot modify this once it's been set!");
        this.file = file;
        this.engine = engine;
        this.dataFolder = dataFolder;
        this.description = description;

        this.logger = new BasicLogger(description.getId());
    }

    public Engine getEngine() {
        return engine;
    }

    public BasicLogger getLogger() {
        return logger;
    }

    public File getFile() {
        return file;
    }

    public File getDataFolder() {
        return dataFolder;
    }

    public Server getServer() {
        return engine.getPlugin().getServer();
    }

    public AddonManager getAddonManager() {
        return engine.getAddonManager();
    }

    public AddonDescription getDescription() {
        return description;
    }

    public abstract void onLoad();

    public abstract void onUnload();

}