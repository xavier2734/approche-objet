package listes;

import java.util.ArrayList;

/**
 * Classe de test effectuant des manipulations algorithmiques sur une liste
 * de chaînes de caractères (ArrayList de String) : recherche de la chaîne la plus longue,
 * passage en majuscules et suppression sélective avec réajustement d'index.
 * 
 * @author xavier2734
 * @version 1.0
 */
public class TestListeString {

    /**
     * Point d'entrée principal du programme réalisant les traitements de filtrage
     * et de transformation sur la liste des villes.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<>();  // Je crée une liste de villes

        // J'ajoute les villes dans la liste
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");


        String villePlusLongue = villes.get(0);

        for (int i = 1; i < villes.size(); i++) {  // Je cherche la ville avec le plus grand nombre de lettres
            if (villes.get(i).length() > villePlusLongue.length()) {
                villePlusLongue = villes.get(i);
            }
        }
        System.out.println("Ville la plus longue : " + villePlusLongue);
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());  // Je transforme toutes les villes en majuscules
        }

        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).startsWith("N")) {  // Je supprime les villes qui commencent par N
                                                  // startsWith("N") : vérifie si le mot commence par N
                villes.remove(i);
                i--;  // important pour ne pas sauter un élément
            }
        }
        System.out.println("Liste finale : " + villes); // J'affiche la liste finale

    }
}
