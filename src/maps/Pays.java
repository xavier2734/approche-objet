package maps;

/**
 * Représente un pays défini par son nom, son nombre d'habitants en millions
 * et le continent auquel il appartient.
 *
 * @author xavier2734
 * @version 1.0
 */
public class Pays {

    /** Le nom du pays. */
    private String nom;

    /** Le nombre d'habitants (en millions). */
    private int habitants;

    /** Le continent sur lequel se situe le pays. */
    private String continent;

    /**
     * Constructeur complet permettant d'initialiser un nouveau pays.
     *
     * @param nom       Le nom du pays.
     * @param habitants Le nombre d'habitants en millions.
     * @param continent Le continent associé.
     */
    public Pays(String nom, int habitants, String continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

    /**
     * Retourne le nom du pays.
     *
     * @return Le nom du pays.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le nombre d'habitants (en millions).
     *
     * @return Le nombre d'habitants.
     */
    public int getHabitants() {
        return habitants;
    }

    /**
     * Retourne le continent du pays.
     *
     * @return Le continent du pays.
     */
    public String getContinent() {
        return continent;
    }

    /**
     * Retourne une représentation textuelle personnalisée du pays.
     *
     * @return Une chaîne de caractères contenant les informations du pays.
     */
    @Override
    public String toString() {
        return nom + " - " + habitants + " millions - " + continent;
    }
}
