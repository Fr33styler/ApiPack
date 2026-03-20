package ro.fr33styler.gameengine.api.game.gamer;

import org.bukkit.entity.Player;
import ro.fr33styler.gameengine.api.game.Game;
import ro.fr33styler.gameengine.api.player.User;
import ro.fr33styler.gameengine.api.text.Context;

import java.util.UUID;

public interface Gamer extends Context {

    int getWins();

    int getLoses();

    Game getGame();

    UUID getUUID();

    User toUser();

    Player toPlayer();

    void leave();

}
