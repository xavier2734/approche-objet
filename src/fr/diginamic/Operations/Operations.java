package fr.diginamic.Operations;

public class Operations {

    public static double calcul(double a, double b, char operateur) {

        // Si l'opérateur est +
        if (operateur == '+') {
            return a + b;
        }

        // Si l'opérateur est -
        if (operateur == '-') {
            return a - b;
        }

        // Si l'opérateur est *
        if (operateur == '*') {
            return a * b;
        }

        // Si l'opérateur est /
        if (operateur == '/') {

           /* // Petite sécurité pour éviter une division par zéro
            if (b == 0) {
                System.out.println("Erreur : division par zéro.");
                return 0;
            }*/

            return a / b;
        }

       /* // Si l'utilisateur tape un opérateur inconnu
        System.out.println("Opérateur inconnu.");*/

        return 0;
    }

}