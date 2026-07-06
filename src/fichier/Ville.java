package fichier;

public class Ville {

    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int population;

    public Ville(String nom, String codeDepartement, String nomRegion, int population) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulation() {
        return population;
    }

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
