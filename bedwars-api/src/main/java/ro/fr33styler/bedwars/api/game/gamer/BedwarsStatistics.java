package ro.fr33styler.bedwars.api.game.gamer;

import ro.fr33styler.gameengine.api.game.gamer.GameStatistics;

public interface BedwarsStatistics extends GameStatistics {

    int getKills();

    int getFinalKills();

    int getDeaths();

    int getFinalDeaths();

    int getLevels();

    int getExperience();

    int getRequiredExperience();

    int getBedsDestroyed();

}
