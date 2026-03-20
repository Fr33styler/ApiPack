package ro.fr33styler.gameengine.api.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.jetbrains.annotations.Nullable;

public final class BasicLogger {

    private static final ConsoleCommandSender CONSOLE_SENDER = Bukkit.getConsoleSender();

    private final String name;
    private final BasicLogger parent;

    public BasicLogger(String name) {
        this(name, null);
    }

    public BasicLogger(String name, @Nullable BasicLogger parent) {
        this.name = "[" + name + "] ";
        this.parent = parent;
    }

    public void sendWarn(String message) {
        message = name.concat(message);
        if (parent == null) {
            CONSOLE_SENDER.sendMessage(ChatColor.YELLOW + message);
        } else {
            parent.sendWarn(message);
        }
    }

    public void sendError(String message) {
        message = name.concat(message);
        if (parent == null) {
            CONSOLE_SENDER.sendMessage(ChatColor.RED + message);
        } else {
            parent.sendError(message);
        }
    }

    public void sendInfo(String message) {
        message = name.concat(message);
        if (parent == null) {
            CONSOLE_SENDER.sendMessage(ChatColor.GREEN + message);
        } else {
            parent.sendInfo(message);
        }
    }

}
