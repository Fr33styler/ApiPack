package ro.fr33styler.gameengine.api.event.game;

import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import ro.fr33styler.gameengine.api.event.GameEvent;
import ro.fr33styler.gameengine.api.game.Game;

public class GameStartEvent extends GameEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public GameStartEvent(Game game) {
        super(game);
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