package fr.diginamic.Operations.TestEssaies.fr.diginamic;

import fr.diginamic.Operations.Operations;

public class TestOperations {

    public static void main(String[] args) {

        // Test de l'addition
        System.out.println("10 + 5 = "
                + Operations.calcul(10, 5, '+'));

        // Test de la soustraction
        System.out.println("10 - 5 = "
                + Operations.calcul(10, 5, '-'));

        // Test de la multiplication
        System.out.println("10 * 5 = "
                + Operations.calcul(10, 5, '*'));

        // Test de la division
        System.out.println("10 / 5 = "
                + Operations.calcul(10, 5, '/'));

       /* // Test d'un opérateur qui n'existe pas
        System.out.println("Test opérateur inconnu : "
                + Operations.calcul(10, 5, '%')); */

    }

}
