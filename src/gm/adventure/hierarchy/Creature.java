package gm.adventure.hierarchy;

import gm.adventure.entitystates.Rank;

public interface Creature extends Attackable {
    public String name();
    public Rank rank();
    public int maxHealth();
}
