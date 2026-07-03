package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps",1),
    ETE("Ete",2),
    AUTOMNE("Automne",3),
    HIVER("Hiver",4);

    private String nom;
    private int numero;

    private Saison(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public static Saison getSaisonParNumero(int numero) {

        for (Saison saison : Saison.values()) {
            if (saison.numero == numero) {
                return saison;
            }
        }
        return null;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Saison{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                '}';
    }
}
