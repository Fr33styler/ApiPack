package ro.fr33styler.gameengine.api.util;

import org.apache.commons.lang.Validate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Path {

    private final String node;
    private final Path child;

    private Path(String node, Path child) {
        Validate.notNull(node, "The node cannot be null!");
        Validate.isTrue(!node.isBlank(), "The node cannot be blank!");
        this.node = node;
        this.child = child;
    }

    public static Path of(@NotNull String node) {
        return new Path(node, null);
    }

    public static Path of(@NotNull String node1, @NotNull String node2) {
        return new Path(node1, of(node2));
    }

    public static Path of(@NotNull String node1, @NotNull String node2, @NotNull String node3) {
        return new Path(node1, of(node2, node3));
    }

    public static Path of(@NotNull String... nodes) {
        Path child = null;
        for (int i = nodes.length - 1; i >= 0; i--) {
            child = new Path(nodes[i], child);
        }
        return child;
    }

    public String getNode() {
        return node;
    }

    public @Nullable Path getChild() {
        return child;
    }

    public String toString() {
        return child == null ? node : node + " " + child;
    }

}
