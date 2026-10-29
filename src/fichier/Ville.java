package fichier;

/**
 * Représente une ville avec son nom, son code département, le nom de sa région
 * et sa population totale. Cette entité est utilisée pour stocker et manipuler
 * les données lues depuis le fichier de recensement.
 * 
 * @author xavier2734
 * @version 1.0
 */
public class Ville {

    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int population;

    /**
     * Constructeur complet permettant d'initialiser une nouvelle instance de Ville.
     * 
     * @param nom             Le nom de la ville.
     * @param codeDepartement Le numéro ou code du département.
     * @param nomRegion       Le nom de la région associée.
     * @param population      Le nombre total d'habitants.
     */
    public Ville(String nom, String codeDepartement, String nomRegion, int population) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    /**
     * Récupère le nom de la ville.
     * 
     * @return Le nom de la ville.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le code du département de la ville.
     * 
     * @return Le code du département.
     */
    public String getCodeDepartement() {
        return codeDepartement;
    }

    /**
     * Récupère le nom de la région de la ville.
     * 
     * @return Le nom de la région.
     */
    public String getNomRegion() {
        return nomRegion;
    }

    /**
     * Récupère le nombre total d'habitants de la ville.
     * 
     * @return La population totale.
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Retourne une chaîne de caractères représentant l'état actuel de l'objet Ville.
     * 
     * @return Une description textuelle des attributs de la ville.
     */
    @Override
    public String toString() {
        return "ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale=" + population +
                '}';
    }
}
