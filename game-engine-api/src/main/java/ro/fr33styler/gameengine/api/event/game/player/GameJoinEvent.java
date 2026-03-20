package ro.fr33styler.gameengine.api.event.game.player;

import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import ro.fr33styler.gameengine.api.game.gamer.Gamer;

public class GameJoinEvent extends PlayerGameEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public GameJoinEvent(Gamer gamer) {
        super(gamer);
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
