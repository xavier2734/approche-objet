package tri;

import java.util.Comparator;

/**
 * Comparateur alternatif permettant de trier des objets de type Casa
 * par ordre alphabétique basé sur leur nom.
 *
 * @author xavier2734
 * @version 1.0
 */
public class ComparatorNom implements Comparator<Casa> {

    /**
     * Constructeur par défaut de la classe ComparatorNom.
     */
    public ComparatorNom() {
        // Constructeur vide explicite
    }

    /**
     * Compare les noms de deux instances de Casa pour déterminer leur ordre alphabétique.
     *
     * @param v1 La première ville à comparer.
     * @param v2 La seconde ville à comparer.
     * @return Un entier négatif si le nom de v1 précède lexicographiquement le nom de v2,
     *         zéro si les noms sont identiques, ou un entier positif sinon.
     */
    @Override
    public int compare(Casa v1, Casa v2) {
        return v1.getNom().compareTo(v2.getNom());
    }
}
