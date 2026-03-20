package ro.fr33styler.gameengine.api.party;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.UUID;
import java.util.function.Consumer;

public interface Party {

    UUID getLeader();

    Collection<UUID> getMembers();

    default int size() {
        return getMembers().size() + 1;
    }

    default void forEach(Consumer<UUID> consumer) {
        consumer.accept(getLeader());
        getMembers().forEach(consumer);
    }

    default void forEachOnline(Consumer<Player> consumer) {
        Player leader = Bukkit.getPlayer(getLeader());
        if (leader != null) consumer.accept(leader);
        for (UUID uuid : getMembers()) {
            Player player = Bukkit.getPlayer(uuid);
            if (player == null) continue;

            consumer.accept(player);
        }
    }

}
