package ro.fr33styler.gameengine.api.addon;

import org.bukkit.event.Listener;
import ro.fr33styler.gameengine.api.addon.repository.AddonRepository;

import java.io.File;
import java.util.List;

public interface AddonManager {

    void start();

    void stop();

    File getAddonsDirectory();

    AddonRepository getAddonRepository();

    List<Addon> getAddons();

    Addon getAddon(String addonName);

    void loadAddon(File file);

    void loadAddon(Addon addon);

    void registerListener(Listener listener);

    void unregisterListener(Listener listener);
}