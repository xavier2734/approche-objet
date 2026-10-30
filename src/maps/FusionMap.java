package maps;

import java.util.HashMap;

/**
 * Classe permettant d'apprendre à fusionner et copier le contenu
 * de plusieurs HashMap dans une nouvelle collection à l'aide de putAll().
 *
 * @author xavier2734
 * @version 1.0
 */
public class FusionMap {

    /**
     * Constructeur par défaut de la classe FusionMap.
     */
    public FusionMap() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Initialise deux Maps distinctes de couleurs, crée une troisième Map vide,
     * y copie l'ensemble des données, puis affiche le résultat final.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création de la première HashMap : clé (Integer) -> valeur (String)
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Création de la deuxième HashMap : clé (Integer) -> valeur (String)
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        // Création de la troisième HashMap qui va accueillir la fusion
        HashMap<Integer, String> map3 = new HashMap<>();

        // Copie de toutes les associations de map1 vers map3
        map3.putAll(map1);

        // Copie de toutes les associations de map2 vers map3
        map3.putAll(map2);

        // Affichage du résultat global
        System.out.println("Contenu de map3 :");
        System.out.println(map3);
    }
}
