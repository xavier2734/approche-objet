package fr.diginamic.chaine;

public class TestStringBuilder {
    public static void main(String[] args) {


       // Chrono début
        long debut = System.currentTimeMillis();

        // StringBuilder
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            builder.append(i);
        }

        // Chrono fin
        long fin = System.currentTimeMillis();

        System.out.println("Résultat StringBuilder terminé");
        System.out.println("Temps : " + (fin - debut) + " ms");


        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        /// VERSION STRING BUILDER

        long debut1 = System.currentTimeMillis();

        StringBuilder builder1 = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            builder1.append(i);
        }

        long fin1 = System.currentTimeMillis();

        System.out.println("StringBuilder : " + (fin1 - debut1) + " ms");

        ///VERSION STRING + "+"

        long debut2 = System.currentTimeMillis();

        String resutat = "";

        for (int i = 1; i <= 100000; i++) {
            resutat = resutat + i;
        }

        long fin2 = System.currentTimeMillis();

        System.out.println("String + concat : " + (fin2 - debut2) + " ms");



    }
}
