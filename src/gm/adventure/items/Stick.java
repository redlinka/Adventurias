package gm.adventure.items;
import gm.adventure.hierarchy.GameRandom;
import gm.adventure.hierarchy.Weapon;
import gm.adventure.entitystates.DamageType;
import gm.adventure.entitystates.Rarity;

import java.util.Objects;

public class Stick implements Weapon {

    private static final int ID = 1;
    private static final String NAME = "Stick";
    private static final double WEIGHT = 0.5;
    private static final DamageType DAMAGE_TYPE = DamageType.BLUNT;
    private static final String DESCRIPTION = "It looks like a stick. Maybe fell from a tree?";
    private static final Rarity RARITY = Rarity.COMMON;
    private static final int VALUE = 1;
    private static final int MIN_DAMAGE = 2;
    private static final int DAMAGE_RANGE = 1;
    private static final int MAX_DURABILITY = 20;

    private int durability;

    public Stick() {
        this.durability = GameRandom.roll(10,MAX_DURABILITY);
    }
    
    @Override
    public int id() {
        return ID;
    }
    @Override
    public String name() {
        return NAME;
    }
    @Override
    public Rarity rarity() {
        return RARITY;
    }
    @Override
    public String description() {
        return DESCRIPTION;
    }
    @Override
    public boolean isStackable() {
        return false;
    }
    @Override
    public double weight() {
        return WEIGHT;
    }
    @Override
    public DamageType damageType() {
        return DAMAGE_TYPE;
    }
    @Override
    public int value() {
        return VALUE;
    }
    @Override
    public int minDamage() {
        return MIN_DAMAGE;
    }
    @Override
    public int damageRange() {
        return DAMAGE_RANGE;
    }
    @Override
    public String durabilityStatus() {
        if (durability>=(MAX_DURABILITY*3/4)) {
            return "Sturdy";
        }
        else if (durability>=(MAX_DURABILITY/3)) {
            return "Worn";
        }
        else if (durability>0) {
            return "Damaged";
        }
        else {
            return "Broken";
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Stick other)) return false;
        return this.id() == other.id();
    }
    
    @Override
    public void removeDurability(int amount) {
        this.durability = Math.max(0, durability - amount);
    }
    @Override
    public void addDurability(int amount) {
        this.durability = Math.min(MAX_DURABILITY, durability + amount);
    }

    @Override
    public String toString() {
        return describe();
    }
}