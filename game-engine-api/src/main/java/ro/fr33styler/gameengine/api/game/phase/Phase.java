package ro.fr33styler.gameengine.api.game.phase;

import ro.fr33styler.gameengine.api.text.Context;

public interface Phase extends Context {

    void start();

    void stop();

    String getName();

    PhaseType getType();

    void onTick(long ticks);

}