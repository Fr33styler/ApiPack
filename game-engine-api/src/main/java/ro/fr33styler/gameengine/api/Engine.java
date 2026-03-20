package ro.fr33styler.gameengine.api;

import org.bukkit.plugin.Plugin;
import ro.fr33styler.gameengine.api.addon.AddonManager;
import ro.fr33styler.gameengine.api.config.ConfigManager;
import ro.fr33styler.gameengine.api.game.GameManagerRegistry;
import ro.fr33styler.gameengine.api.party.PartyManager;
import ro.fr33styler.gameengine.api.player.UserSet;
import ro.fr33styler.gameengine.api.util.BasicLogger;

import java.io.File;

public interface Engine {

    void start();

    void stop();

    Plugin getPlugin();

    BasicLogger getLogger();

    File getDataFolder();

    UserSet getUsers();

    PartyManager getPartyManager();

    AddonManager getAddonManager();

    ConfigManager getConfigManager();

    GameManagerRegistry getGameManagerRegistry();

}