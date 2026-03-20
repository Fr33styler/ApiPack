package ro.fr33styler.gameengine.api.game.gamer;

import java.util.UUID;

public interface GameStatistics {

    UUID getUUID();

    String getName();

    int getWins();

    int getWinStreak();

    int getCurrentWinStreak();

    int getLoses();

}
