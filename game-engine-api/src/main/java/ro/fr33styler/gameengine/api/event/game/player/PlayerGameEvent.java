package ro.fr33styler.gameengine.api.event.game.player;

import org.bukkit.entity.Player;
import ro.fr33styler.gameengine.api.event.GameEvent;
import ro.fr33styler.gameengine.api.game.gamer.Gamer;

public abstract class PlayerGameEvent extends GameEvent {

    private final Gamer gamer;

    public PlayerGameEvent(Gamer gamer) {
        super(gamer.getGame());
        this.gamer = gamer;
    }

    public Player getPlayer() {
        return gamer.toPlayer();
    }

    public Gamer getGamer() {
        return gamer;
    }

}
