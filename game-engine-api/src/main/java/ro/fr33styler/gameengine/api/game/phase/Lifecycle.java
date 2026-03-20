package ro.fr33styler.gameengine.api.game.phase;

public interface Lifecycle {

    Phase getWaiting();

    Phase getPlaying();

    Phase getEnding();

    Phase getResetting();

}