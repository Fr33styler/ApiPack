package ro.fr33styler.gameengine.api.game;

import org.jetbrains.annotations.Nullable;
import ro.fr33styler.gameengine.api.game.gamer.GameStatistics;
import ro.fr33styler.gameengine.api.game.session.Sessions;

import java.util.UUID;

public interface GameManager {

    String getId();

    String getName();

    void start();

    void stop();

    Sessions getSessions();

    @Nullable
    GameStatistics getData(UUID uuid);

}
