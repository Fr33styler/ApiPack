package ro.fr33styler.gameengine.api.event;

import org.bukkit.event.Event;
import ro.fr33styler.gameengine.api.game.Game;

public abstract class GameEvent extends Event {

    private final Game game;

    public GameEvent(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

}
