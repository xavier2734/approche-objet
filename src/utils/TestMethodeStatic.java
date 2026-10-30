package utils;

/**
 * Classe de test permettant d'expérimenter et de comprendre l'utilisation
 * des méthodes statiques utilitaires fournies par les classes enveloppes de Java (Wrapper Classes).
 *
 * @author xavier2734
 * @version 1.0
 */
public class TestMethodeStatic {

    /**
     * Constructeur par défaut de la classe TestMethodeStatic.
     */
    public TestMethodeStatic() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Effectue la conversion d'une chaîne de caractères en entier, puis recherche
     * la valeur maximale entre deux variables à l'aide de méthodes statiques.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Chaîne de caractères initiale représentant un nombre
        String nombre = "70";

        // Déclaration et conversion de la chaîne en entier primitif int
        int nombre1;
        nombre1 = Integer.parseInt(nombre);

        // Affichage du résultat de la conversion (corrigé pour afficher la variable convertie nombre1)
        System.out.println("Nombre converti : " + nombre1);

        // Déclaration de deux variables entières à comparer
        int a = 25;
        int b = 42;

        // Appel de la méthode statique max pour isoler la valeur la plus grande
        int max = Integer.max(a, b);

        // Affichage du résultat de la comparaison
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
    }
}
