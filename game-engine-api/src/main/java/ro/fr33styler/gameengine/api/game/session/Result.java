package ro.fr33styler.gameengine.api.game.session;

import org.bukkit.ChatColor;

public record Result(boolean successful, String errorMessage) {

    public static final Result SUCCESSFUL = new Result(true, "");
    public static final Result NOT_IMPLEMENTED = new Result(false, ChatColor.RED + "This feature is not implemented!");

}
