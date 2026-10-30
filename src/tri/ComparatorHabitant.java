package tri;

import java.util.Comparator;

/**
 * Comparateur alternatif permettant de trier des objets de type Casa
 * en fonction de leur nombre d'habitants.
 *
 * @author xavier2734
 * @version 1.0
 */
public class ComparatorHabitant implements Comparator<Casa> {

    /**
     * Constructeur par défaut de la classe ComparatorHabitant.
     */
    public ComparatorHabitant() {
        // Constructeur vide explicite
    }

    /**
     * Compare deux instances de Casa pour déterminer leur ordre relatif.
     *
     * @param v1 La première ville à comparer.
     * @param v2 La seconde ville à comparer.
     * @return Un entier négatif, zéro ou un entier positif si la première ville
     *         est respectivement moins peuplée, égale ou plus peuplée que la seconde.
     */
    @Override
    public int compare(Casa v1, Casa v2) {
        // Utilisation de getNbHabitants() pour cibler la vraie population.
        return Integer.compare(v1.getNbHabitants(), v2.getNbHabitants());
    }
}
