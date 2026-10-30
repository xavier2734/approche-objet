package tri;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe de test principale permettant de valider et de comparer
 * les différentes stratégies de tri (ordre naturel, par nom, par population).
 *
 * @author xavier2734
 * @version 1.0
 */
public class TestCasa {

    /**
     * Constructeur par défaut de la classe TestCasa.
     */
    public TestCasa() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Initialise la liste des villes, affiche l'état de la collection avant tri,
     * puis applique et affiche successivement trois tris différents.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création de la liste de villes
        ArrayList<Casa> villes = new ArrayList<>();

        villes.add(new Casa("Carcassonne", 47800));
        villes.add(new Casa("Narbonne", 53400));
        villes.add(new Casa("Nice", 343000));
        villes.add(new Casa("Paris", 2161000));
        villes.add(new Casa("Lyon", 515695));
        villes.add(new Casa("Marseille", 870321));
        villes.add(new Casa("Toulouse", 493465));
        villes.add(new Casa("Bordeaux", 260958));

        // Affichage avant tri
        System.out.println("Avant tri :");
        System.out.println(villes);

        // TRI : Utilise automatiquement la méthode compareTo() définie dans Casa
        Collections.sort(villes);

        // Affichage après tri naturel (par habitants)
        System.out.println("\nAprès tri (par habitants) :");
        System.out.println(villes);

        // TRI PAR NOM : Utilise le comparateur de noms alternatif
        Collections.sort(villes, new ComparatorNom());
        System.out.println("\nTri par nom :");
        System.out.println(villes);

        // TRI PAR HABITANTS : Utilise le comparateur d'habitants alternatif
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println("\nTri par habitants :");
        System.out.println(villes);
    }
}
