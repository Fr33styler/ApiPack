package ro.fr33styler.gameengine.api.game.session;

import org.jetbrains.annotations.Nullable;

public interface Sessions extends Iterable<Session> {

    @Nullable
    Session getSession(String id);

    Searcher getGameSearcher();

}
