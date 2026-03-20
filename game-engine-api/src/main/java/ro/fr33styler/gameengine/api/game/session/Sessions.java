package ro.fr33styler.gameengine.api.game.session;

import org.jetbrains.annotations.Nullable;

public interface Sessions {

    @Nullable
    Session getSession(String id);

    Searcher getGameSearcher();

}
