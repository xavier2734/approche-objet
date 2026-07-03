package fr.diginamic.CalculateurDevis;

public class LigneCommande {

    private String nom;
    private int quantite;
    private double prixUnitaireHT;

    public LigneCommande(String nom, int quantite, double prixUnitaireHT) {
        this.nom = nom;
        this.quantite = quantite;
        this.prixUnitaireHT = prixUnitaireHT;
    }

    public double getTotalHT() {
        return quantite * prixUnitaireHT;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrixUnitaireHT() {
        return prixUnitaireHT;
    }

    @Override
    public String toString() {
        return nom + " | Quantité : " + quantite + " | PU HT : " + prixUnitaireHT + " | Total : " + getTotalHT();
    }
}



