package ro.fr33styler.gameengine.api.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.Consumer;

public interface UserSet {

    boolean contains(UUID uuid);

    boolean contains(Player player);

    @Nullable
    User get(@Nullable UUID uuid);

    @Nullable
    User get(@Nullable Player player);

    int size();

    void forEachUser(Consumer<User> consumer);

}
