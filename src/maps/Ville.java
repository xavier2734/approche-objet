package maps;

public class Ville {

    private String nom;
    private int habitants;

    public Ville(String nom, int habitants) {
        this.nom = nom;
        this.habitants = habitants;
    }

    public String getNom() {
        return nom;
    }

    public int getHabitants() {
        return habitants;
    }

    @Override
    public String toString() {
        return nom + " (" + habitants + ")";
    }
}
