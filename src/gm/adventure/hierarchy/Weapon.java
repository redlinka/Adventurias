package gm.adventure.hierarchy;

import gm.adventure.entitystates.DamageType;

// Interface Weapon améliorée
public interface Weapon extends Item {

    public int minDamage();
    public int damageRange();
    public DamageType damageType();
    default int damage() {
        return minDamage() + GameRandom.roll(0,damageRange());
    }
    default int range() {
        return 1;
    }

    public String durabilityStatus();
    public void removeDurability(int amount);
    public void addDurability(int amount);

    default String describe() {
        return  durabilityStatus() + " " + name() + "\n" +
                rarity() + "\n" +
                "Type : " + getType() + "\n" +
                description() + "\n" +
                "Damage : " + minDamage() + "-" + (minDamage() + damageRange()) + " " + damageType() + "\n" +
                "Weight : " + weight() + "\n" +
                "Value : " + value() + "\n";
    }
}