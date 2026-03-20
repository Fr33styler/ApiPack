package ro.fr33styler.gameengine.api.game;

import ro.fr33styler.gameengine.api.game.gamer.Gamer;
import ro.fr33styler.gameengine.api.game.gamer.GamerSet;
import ro.fr33styler.gameengine.api.game.phase.Lifecycle;
import ro.fr33styler.gameengine.api.game.phase.Phase;

public interface Game {

    Map getMap();

    Phase getPhase();

    Lifecycle getPhaseLifecycle();

    GameManager getManager();

    GamerSet<? extends Gamer> getGamers();

}