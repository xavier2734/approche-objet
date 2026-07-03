package fr.diginamic.testenumeration;

public class Commune {

    private String nom;
    private int habitants;
    private Continent continent;

    public Commune(String nom, int habitants, Continent continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public int getHabitants() {
        return habitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {

        return nom + " - "
                + habitants + " habitants - "
                + continent.getLibelle();
    }


}
