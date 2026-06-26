package fr.diginamic.Operations.TestEssaies.fr.diginamic;

import fr.diginamic.Operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {

        System.out.println("---- test1 ----");  // Affichage de test1

        CalculMoyenne moyenne1 = new CalculMoyenne();

        moyenne1.ajout(10);
        moyenne1.ajout(20);
        moyenne1.ajout(30);

        System.out.println("Moyenne : "
                + moyenne1.calcul());

        System.out.println();

        System.out.println("---- Deuxième test ----");  // Affichage de test2

        CalculMoyenne moyenne2 = new CalculMoyenne();

        moyenne2.ajout(12.5);
        moyenne2.ajout(18);
        moyenne2.ajout(9.5);
        moyenne2.ajout(20);

        System.out.println("Moyenne : "
                + moyenne2.calcul());

    }



}
