package ro.fr33styler.gameengine.api;

import org.apache.commons.lang.Validate;
import org.bukkit.plugin.Plugin;
import ro.fr33styler.gameengine.api.addon.AddonManager;
import ro.fr33styler.gameengine.api.config.ConfigManager;
import ro.fr33styler.gameengine.api.game.GameManagerRegistry;
import ro.fr33styler.gameengine.api.party.PartyManager;
import ro.fr33styler.gameengine.api.player.UserSet;

public class EngineApi {

    private static Engine engine;

    private EngineApi() {}

    public static Engine getEngine() {
        return engine;
    }

    public static Plugin getPlugin() {
        return engine.getPlugin();
    }

    public static UserSet getUsers() {
        return engine.getUsers();
    }

    public static PartyManager getPartyManager() {
        return engine.getPartyManager();
    }

    public static AddonManager getAddonManager() {
        return engine.getAddonManager();
    }

    public static ConfigManager getConfigManager() {
        return engine.getConfigManager();
    }

    public static GameManagerRegistry getGameManagerRegistry() {
        return engine.getGameManagerRegistry();
    }

    public static void setEngine(Engine engine) {
        Validate.isTrue(EngineApi.engine == null, "Engine can't be set twice!");

        EngineApi.engine = engine;
    }

}
