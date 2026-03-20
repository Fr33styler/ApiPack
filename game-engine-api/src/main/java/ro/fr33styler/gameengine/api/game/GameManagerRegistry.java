package ro.fr33styler.gameengine.api.game;

import org.jetbrains.annotations.Nullable;
import ro.fr33styler.gameengine.api.game.session.Searcher;

public interface GameManagerRegistry {

    Searcher newGameSearcher();

    @Nullable
    GameManager get(String id);

}
