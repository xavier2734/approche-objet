package fr.diginamic.CalculateurDevis;

import java.util.ArrayList;

public class Commande {

    private int numero;
    private ArrayList<LigneCommande> lignes = new ArrayList<>();

    public Commande(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<LigneCommande> getLignes() {
        return lignes;
    }

    public void ajouterLigne(LigneCommande ligne) {
        lignes.add(ligne);
    }

    public void supprimerLigne(int indice) {

        if (indice >= 0 && indice < lignes.size()) {
            lignes.remove(indice);
        }
    }

    public double montantTotalHT() {

        double total = 0;

        for (LigneCommande ligne : lignes) {
            total += ligne.getTotalHT();
        }

        return total;
    }

    public void afficher() {

        System.out.println("Commande n° " + numero);

        for (int i = 0; i < lignes.size(); i++) {

            System.out.println(i + " - " + lignes.get(i));
        }

        System.out.println("Total HT : " + montantTotalHT());
    }

}


