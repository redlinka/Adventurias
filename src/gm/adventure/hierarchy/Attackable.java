package gm.adventure.hierarchy;

public interface Attackable {

    public int health();
    default boolean isDead() {
        return health() <= 0;
    }
    public void ouch(int amount);
    public void heal(int amount);
}
