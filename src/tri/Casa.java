package tri;

import java.util.Objects;

/**
 * Représente une ville (Casa) dotée d'un nom et d'un nombre d'habitants.
 * Cette classe implémente l'interface Comparable pour définir l'ordre
 * naturel de tri des villes basé sur leur population.
 *
 * @author xavier2734
 * @version 1.0
 */
public class Casa implements Comparable<Casa> {

    /** Le nom de la ville. */
    private String nom;

    /** Le nombre d'habitants de la ville. */
    private int nbHabitants;

    /**
     * Constructeur complet permettant d'initialiser une ville.
     *
     * @param nom         Le nom de la ville.
     * @param nbHabitants Le nombre d'habitants.
     */
    public Casa(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    /**
     * Retourne le nom de la ville.
     *
     * @return Le nom de la ville.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le nombre d'habitants de la ville.
     *
     * @return Le nombre d'habitants.
     */
    public int getNbHabitants() {
        return nbHabitants;
    }

    /**
     * Compare cette ville à un autre objet pour vérifier leur égalité
     * en se basant sur le nom et le nombre d'habitants.
     *
     * @param o L'objet à comparer.
     * @return true si l'objet est une instance de Casa avec les mêmes attributs, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Casa casa)) return false;
        return nbHabitants == casa.nbHabitants && Objects.equals(nom, casa.nom);
    }

    /**
     * Génère le code de hachage de l'objet basé sur son nom et son nombre d'habitants.
     *
     * @return Le code de hachage calculé.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitants);
    }

    /**
     * Retourne une représentation textuelle personnalisée de la ville.
     *
     * @return Une chaîne au format "Nom (Habitants)".
     */
    @Override
    public String toString() {
        return nom + " (" + nbHabitants + ")";
    }

    /**
     * Compare cette ville avec une autre pour définir l'ordre de tri (du moins peuplé au plus peuplé).
     *
     * @param ville L'autre ville à comparer.
     * @return Un entier positif si cette ville est plus peuplée, négatif si elle l'est moins, zéro si elles sont égales.
     */
    @Override
    public int compareTo(Casa ville) {
        if (this.nbHabitants > ville.nbHabitants) {
            return 1;
        }
        if (this.nbHabitants < ville.nbHabitants) {
            return -1;
        }
        return 0;
    }

    /**
     * Retourne une valeur par défaut pour les habitants (méthode de transition).
     *
     * @return 0.
     */
    public int getHabitants() {
        return 0;
    }

    // --- APPROCHE ALTERNATIVE (Commentée à but pédagogique) ---
    // En Java moderne, on peut simplifier la méthode compareTo de cette manière :
    //
    // @Override
    // public int compareTo(Casa autreVille) {
    //     return Integer.compare(this.nbHabitants, autreVille.getNbHabitants());
    // }
    // -----------------------------------------------------------
}
