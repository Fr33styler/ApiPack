package ro.fr33styler.gameengine.api.command;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.Nullable;
import ro.fr33styler.gameengine.api.util.Path;

import java.util.List;

public interface Command {

    String getCommand();

    String getDisplayName();

    List<String> getAliases();

    default void putExecutor(CommandExecutor executor) {
        putExecutor(null, executor);
    }

    void putExecutor(@Nullable Path path, CommandExecutor executor);

    List<String> onSuggestion(CommandSender commandSender, String[] arguments);

    void onExecute(CommandSender commandSender, String label, String[] arguments);

}