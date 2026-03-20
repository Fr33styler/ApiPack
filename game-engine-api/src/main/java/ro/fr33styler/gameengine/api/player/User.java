package ro.fr33styler.gameengine.api.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import ro.fr33styler.gameengine.api.Engine;
import ro.fr33styler.gameengine.api.game.Game;
import ro.fr33styler.gameengine.api.game.gamer.Gamer;
import ro.fr33styler.gameengine.api.party.Party;

import java.util.UUID;

public interface User {

    boolean isInGame();

    @Nullable
    Game getGame();

    @Nullable
    Gamer getGamer();

    @Nullable
    Party getParty();

    Engine getEngine();

    Player toPlayer();

    UUID getUUID();

}
