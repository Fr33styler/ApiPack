package ro.fr33styler.gameengine.api.game.session;

import org.jetbrains.annotations.Nullable;
import ro.fr33styler.gameengine.api.game.phase.PhaseType;
import ro.fr33styler.gameengine.api.text.Context;

import java.util.List;

public interface Status extends Context {

    int players();

    int maximumPlayers();

    String name();

    List<String> playersNames();

    String phaseName();

    PhaseType phaseType();

    String mode();

    @Nullable
    default String getVariable(String placeholder) {
        return switch (placeholder) {
            case "name" -> name();
            case "mode" -> mode();
            case "phase" -> phaseName();
            case "players" -> String.valueOf(players());
            case "maximum" -> String.valueOf(maximumPlayers());
            default -> null;
        };
    }

}
