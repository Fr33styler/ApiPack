package ro.fr33styler.gameengine.api.command;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import ro.fr33styler.gameengine.api.command.argument.ArgumentSet;

public interface CommandExecutor extends Comparable<CommandExecutor> {

    ArgumentSet getArguments();

    default boolean isPlayerOnly() {
        return false;
    }

    default boolean hasPermission(CommandSender sender) {
        return true;
    }

    void execute(CommandSender sender, String label, String[] arguments, int index);

    default int compareTo(@NotNull CommandExecutor executor) {
        return Integer.compare(getArguments().size(), executor.getArguments().size());
    }
}
