package ro.fr33styler.gameengine.api.game.session;

import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.UUID;
import java.util.function.Predicate;

public interface Searcher {

    @Nullable
    Session get(UUID user, Collection<UUID> members);

    @Nullable
    Session get(Predicate<Session> customFilter);

}
