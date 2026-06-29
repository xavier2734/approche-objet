package listes;

public class Ville {

    private String nom;
    private  int nvHabitants;


    /// tout est généré
    public Ville(String nom, int nvHabitants) {
        this.nom = nom;
        this.nvHabitants = nvHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNvHabitants() {
        return nvHabitants;
    }

    public void setNvHabitants(int nvHabitants) {
        this.nvHabitants = nvHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nvHabitants=" + nvHabitants +
                '}';
    }
}
