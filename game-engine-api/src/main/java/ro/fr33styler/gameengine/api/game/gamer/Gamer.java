package ro.fr33styler.gameengine.api.game.gamer;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import ro.fr33styler.gameengine.api.game.Game;
import ro.fr33styler.gameengine.api.player.User;
import ro.fr33styler.gameengine.api.text.Context;

import java.util.UUID;

public interface Gamer extends Context {

    int getWins();

    int getLoses();

    Game getGame();

    void sendMessage(String message);

    void sendActionBar(String message);

    void sendHeaderAndFooter(@Nullable String header, @Nullable String footer);

    void sendTitle(@Nullable String title, @Nullable String subtitle, int fadeIn, int showFor, int fadeOut);

    UUID getUUID();

    User toUser();

    Player toPlayer();

    void leave();

}
