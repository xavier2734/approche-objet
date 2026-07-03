package maps;

import java.util.HashMap;

public class FusionMap {

    public static void main(String args[]) {

        /// Création de la première HashMap

        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        /// Création de la deuxième HashMap

        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        /// Création de la troisième HashMap

        HashMap<Integer, String> map3 = new HashMap<>();

        /// Copie de map1
        map3.putAll(map1);

        /// Copie de map2
        map3.putAll(map2);

        /// Affichage du résultat

        System.out.println("Contenu de map3 :");
        System.out.println(map3);
    }
}
