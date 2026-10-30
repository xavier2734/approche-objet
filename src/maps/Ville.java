package maps;

/**
 * Représente une ville définie par son nom et son nombre d'habitants.
 *
 * @author xavier2734
 * @version 1.0
 */
public class Ville {

    /** Le nom de la ville. */
    private String nom;

    /** Le nombre d'habitants de la ville. */
    private int habitants;

    /**
     * Constructeur complet permettant d'initialiser une nouvelle ville.
     *
     * @param nom       Le nom de la ville.
     * @param habitants Le nombre d'habitants.
     */
    public Ville(String nom, int habitants) {
        this.nom = nom;
        this.habitants = habitants;
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
    public int getHabitants() {
        return habitants;
    }

    /**
     * Retourne une représentation textuelle personnalisée de la ville.
     *
     * @return Une chaîne au format "Nom (Habitants)".
     */
    @Override
    public String toString() {
        return nom + " (" + habitants + ")";
    }
}
