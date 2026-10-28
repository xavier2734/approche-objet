package TpEquals;

import java.util.Objects;

public class Pays {

    // Attributs privés pour respecter le principe d'encapsulation
    private String nom;        // Stocke le nom textuel du pays
    private int population;    // Stocke le nombre total d'habitants

    /**
     * Constructeur de la classe Pays
     * Permet d'initialiser les attributs de l'objet au moment de sa création avec 'new'
     */
    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    // ==========================================================================
    // GETTERS ET SETTERS (Accesseurs et Mutateurs pour les attributs privés)
    // ==========================================================================

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    // ==========================================================================
    // REDÉFINITION DE LA MÉTHODE EQUALS
    // ==========================================================================
    @Override
    public boolean equals(Object obj) {

        // ÉTAPE 1 : Comparaison des références mémoires (Réflexivité)
        // Si les deux variables pointent vers la même adresse, ils sont strictement identiques.
        if (this == obj) {
            return true;
        }

        // ÉTAPE 2 : Vérification de la validité et du type d'objet
        // Si l'objet à comparer n'existe pas (null) OU s'il provient d'une autre classe, l'égalité est impossible.
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // ÉTAPE 3 : Le "Cast" (Conversion de type)
        // À ce stade, on sait que 'obj' est un Pays. On le convertit pour pouvoir lire ses variables internes.
        Pays autre = (Pays) obj;

        // ÉTAPE 4 : Comparaison sémantique des données métier
        // L'égalité est validée si et seulement si les populations ET les noms sont strictement identiques.
        return population == autre.population && Objects.equals(nom, autre.nom);
    }
}

