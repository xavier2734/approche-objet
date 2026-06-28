package fr.diginamic.Operations.TestEssaies.fr.diginamic;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;


public class TestIntervenant {

    public static void main(String[] args) {

        // Création d'un salarié
        Salarie salarie = new Salarie(
                "Dupont",
                "Jean",
                2300);

        // Création d'un pigiste
        Pigiste pigiste = new Pigiste(
                "Martin",
                "Sophie",
                18,
                120);

        // Test du calcul du salaire
        System.out.println("Salaire du salarié : "
                + salarie.getSalaire());

        System.out.println("Salaire du pigiste : "
                + pigiste.getSalaire());

        System.out.println();

        // Affichage complet
        salarie.afficherDonnees();

        pigiste.afficherDonnees();

    }

}
