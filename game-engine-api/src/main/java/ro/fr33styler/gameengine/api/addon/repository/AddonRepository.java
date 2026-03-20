package ro.fr33styler.gameengine.api.addon.repository;

import org.bukkit.command.CommandSender;

public interface AddonRepository {

    void refresh(CommandSender sender);

    void download(CommandSender sender, String name);

}
