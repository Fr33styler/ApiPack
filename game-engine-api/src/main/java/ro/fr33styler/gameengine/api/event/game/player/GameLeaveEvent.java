package ro.fr33styler.gameengine.api.event.game.player;

import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import ro.fr33styler.gameengine.api.game.gamer.Gamer;

public class GameLeaveEvent extends PlayerGameEvent {

    private final Outcome outcome;
    private static final HandlerList HANDLERS = new HandlerList();

    public GameLeaveEvent(Gamer gamer) {
        super(gamer);
        if (gamer.getWins() > 0) {
            outcome = Outcome.WON;
        } else if (gamer.getLoses() > 0) {
            outcome = Outcome.LOST;
        } else {
            outcome = Outcome.NONE;
        }
    }

    public Outcome getOutcome() {
        return outcome;
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public enum Outcome {

        WON,
        LOST,
        NONE

    }

}
