package tri;

import java.util.Objects;

public class Casa implements Comparable<Casa> {

    private String nom;
    private int nbHabitants;

    public Casa(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }
    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Casa casa)) return false;
        return nbHabitants == casa.nbHabitants && Objects.equals(nom, casa.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitants);
    }

    @Override
    public String toString() {
        return nom + " (" + nbHabitants + ")";
    }

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

    public int getHabitants() {
        return 0;
    }


    /// pn peut faire ceci :
    ///  @Override
    /// public int compareTo(Ville autreVille) {
    /// return Integer.compare(this.population, autreVille.getPopulation());
    /// }

}
