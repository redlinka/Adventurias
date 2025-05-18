import gm.adventure.items.Stick;

public class Main {
    public static void main(String[] args) {

        Stick stick = new Stick();

        System.out.println("Min Damage: " + stick.minDamage());
        System.out.println("Damage Range: " + stick.damageRange());
        System.out.println("Damage Type: " + stick.damageType());
        System.out.println("Damage Roll: " + stick.damage());
        System.out.println("Range: " + stick.range());
        System.out.println("Initial Durability: " + stick.durabilityStatus());

        stick.removeDurability(10);
        System.out.println("After removing durability: " + stick.durabilityStatus());

        stick.addDurability(10);
        System.out.println("After adding durability: " + stick.durabilityStatus());

        System.out.println("\nFull description:");
        System.out.println(stick.describe());
    }
}