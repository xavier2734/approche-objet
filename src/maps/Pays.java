package maps;

public class Pays {

    /// Nom du pays
    private String nom;

    /// Nombre d'habitants (en millions)
    private int habitants;

    /// Continent
    private String continent;

    ///Constructeur

    public Pays(String nom, int habitants, String continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

    /// Getter du nom
    public String getNom() {
        return nom;
    }

    /// Getter du nombre d'habitants
    public int getHabitants() {
        return habitants;
    }

    /// Getter du continent
    public String getContinent() {
        return continent;
    }

    /// Affichage d'un pays
    @Override
    public String toString() {
        return nom + " - " + habitants + " millions - " + continent;
    }


}
