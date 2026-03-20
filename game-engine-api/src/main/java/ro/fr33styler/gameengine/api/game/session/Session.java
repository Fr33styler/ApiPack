package ro.fr33styler.gameengine.api.game.session;

import ro.fr33styler.gameengine.api.player.User;
import ro.fr33styler.gameengine.api.text.Context;

import java.util.Collection;
import java.util.UUID;

public interface Session extends Context {

    String getId();

    Status getStatus();

    Result canPlay(UUID user, Collection<UUID> members);

    Result canPlay(User user);

    Result canPlayStarted(UUID user, Collection<UUID> members);

    Result canPlayStarted(User user);

    void addPlayerStarted(User user);

    void addPlayer(User user);

    Result canSpectate(UUID user);

    Result canSpectate(User user);

    void addSpectator(User user);

    Result canRejoin(UUID user);

    Result canRejoin(User user);

    void addRejoin(User user);

}