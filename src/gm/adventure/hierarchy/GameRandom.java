package gm.adventure.hierarchy;

import java.util.Random;

// Classe utilitaire pour les nombres aléatoires
public class GameRandom {
    // Instance partagée du générateur de nombres aléatoires
    private static final Random RANDOM = new Random();

    // Méthode pour obtenir un nombre entre min (inclus) et max (inclus)
    public static int roll(int min, int max) {
        return min + RANDOM.nextInt(max - min + 1);
    }

    // Méthode pour obtenir un nombre entre 0 et max-1
    public static int nextInt(int max) {
        return RANDOM.nextInt(max);
    }

    // Définir une seed si nécessaire (pour tests ou reproductibilité)
    public static void setSeed(long seed) {
        RANDOM.setSeed(seed);
    }
}
