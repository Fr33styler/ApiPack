package ro.fr33styler.gameengine.api.command.argument;

public interface ArgumentSet {

    int size();

    boolean has(int currentPosition);

    Argument get(int currentPosition);

    boolean isConflicting(ArgumentSet argumentSet);

    boolean isMatching(String[] arguments, int currentPosition);

    boolean isPartialMatching(String[] arguments, int currentPosition);

}
