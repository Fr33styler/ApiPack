package ro.fr33styler.gameengine.api.command.argument;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface Argument {

    String getName();

    boolean isMatching(String typedArgument);

    boolean isConflicting(Argument argument);

    default List<String> getSuggestions() {
        List<String> list = new ArrayList<>();
        getSuggestions(StringUtils.EMPTY, list);
        return list;
    }

    void getSuggestions(String typedArgument, Collection<String> suggestionCollector);

}