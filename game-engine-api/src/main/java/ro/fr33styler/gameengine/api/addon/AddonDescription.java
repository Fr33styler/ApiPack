package ro.fr33styler.gameengine.api.addon;

import org.apache.commons.lang.Validate;
import ro.fr33styler.gameengine.api.addon.annotation.Description;

public class AddonDescription {

    private final String id;
    private final String author;
    private final String version;

    public AddonDescription(Addon addon) {
        Description description = addon.getClass().getAnnotation(Description.class);

        Validate.notNull(description, "The addon must have a description annotation!");

        id = description.id();
        author = description.author();
        version = description.version();
    }


    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getVersion() {
        return version;
    }

}