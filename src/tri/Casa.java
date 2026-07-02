package tri;

class Casa implements Comparable<Casa> {

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

}
