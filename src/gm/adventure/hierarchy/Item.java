package gm.adventure.hierarchy;
import gm.adventure.entitystates.Rarity;
import java.util.Arrays;
import java.util.stream.Collectors;

public interface Item {

    public int id();

    public String name();

    default Rarity rarity() {
        return Rarity.COMMON;
    }

    default String getType() {
        return Arrays.stream(getClass().getInterfaces())
                .map(Class::getSimpleName)
                .collect(Collectors.joining(", "));
    }

    default String description() {
        return "Unknown";
    }

    default double weight() {
        return 0.0;
    }

    default int value() {
        return 0;
    }

    public boolean isStackable();
    default int maxStackSize() {
        return 1;
    }
}