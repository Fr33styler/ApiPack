package ro.fr33styler.gameengine.api.party;

import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface PartyManager {

    void load();

    void unload();

    @Nullable
    Party getParty(UUID member);

    default boolean hasDependency() {
        return true;
    }

}
