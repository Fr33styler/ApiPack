package ro.fr33styler.gameengine.api.game.session;

import java.util.Collection;
import java.util.UUID;
import java.util.function.Predicate;

public interface Searcher {

    Session get(UUID user, Collection<UUID> members);

    Session get(Predicate<Session> customFilter);

}
