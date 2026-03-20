package ro.fr33styler.gameengine.api.event.packet;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncPacketEntityInteractEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final int id;
    private final boolean attack;
    private final Player player;

    public AsyncPacketEntityInteractEvent(Player player, int id, boolean attack) {
        super(true);
        this.id = id;
        this.attack = attack;
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public boolean isAttack() {
        return attack;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}