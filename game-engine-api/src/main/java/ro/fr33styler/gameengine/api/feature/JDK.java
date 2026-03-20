package ro.fr33styler.gameengine.api.feature;

import java.util.concurrent.ExecutorService;

public interface JDK {

    Thread newThread(Runnable task);

    ExecutorService startSingleThreadExecutor();

}
