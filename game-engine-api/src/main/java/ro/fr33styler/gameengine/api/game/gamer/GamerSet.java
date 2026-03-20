package ro.fr33styler.gameengine.api.game.gamer;

import org.bukkit.entity.Entity;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface GamerSet<G extends Gamer> extends Iterable<G> {

    boolean contains(UUID uuid);

    boolean contains(Entity player);

    @Nullable
    G get(@Nullable UUID uuid);

    @Nullable
    G get(@Nullable Entity player);

    int size();

    void leaveAll();

}
