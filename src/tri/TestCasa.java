package tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestCasa {

    public static  void main(String[] args) {

        /// Création de la liste de villes
        ArrayList<Casa> villes = new ArrayList<>();

        villes.add(new Casa("Carcassonne", 47800));
        villes.add(new Casa("Narbonne", 53400));
        villes.add(new Casa("Nice", 343000));
        villes.add(new Casa("Paris", 2161000));
        villes.add(new Casa("Lyon", 515695));
        villes.add(new Casa("Marseille", 870321));
        villes.add(new Casa("Toulouse", 493465));
        villes.add(new Casa("Bordeaux", 260958));

        /// Affichage avant tri
        System.out.println("Avant tri :");
        System.out.println(villes);

        /// TRI (utilise compareTo automatiquement)
        Collections.sort(villes);

        /// Affichage après tri
        System.out.println("\nAprès tri (par habitants) :");
        System.out.println(villes);

    }
}
