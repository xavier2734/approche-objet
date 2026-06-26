package fr.diginamic.Operations;

import java.util.Arrays;

public class CalculMoyenne {

    private double[] valeurs = new double[0];  // Tableau qui va contenir tous les nombres


   // méthode qui un nombre dans le tableau.

    public void ajout(double valeur) {
        valeurs = Arrays.copyOf(valeurs, valeurs.length + 1);  // On agrandit le tableau d'une case
        valeurs[valeurs.length - 1] = valeur;  // On place la nouvelle valeur dans la dernière case

    }
     // Calcule de la moyenne.

    public double calcul() {
        if (valeurs.length == 0) {  // Si le tableau est vide
            return 0;
        }
        double somme = 0;

        for (double valeur : valeurs) {  // On additionne tous
            somme += valeur;
        }

        return somme / valeurs.length;  // On retourne la moyenne

    }
}
