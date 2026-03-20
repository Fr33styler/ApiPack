package ro.fr33styler.gameengine.api.config;

public class InvalidConfigException extends Exception {

    public InvalidConfigException(String message) {
        super(message);
    }

    public InvalidConfigException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
