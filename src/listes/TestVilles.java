package listes;

import java.util.ArrayList;

/**
 * Classe de test permettant de manipuler une liste d'objets Ville.
 * Elle contient la logique de recherche de la ville la plus peuplée, la suppression
 * de la ville la moins peuplée, et la mise en majuscule conditionnelle des noms.
 *
 * @author xavier2734
 * @version 1.0
 */
public class TestVilles {

    /**
     * Point d'entrée principal qui exécute l'algorithme de filtrage et de
     * modification sur la liste des villes.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Je crée unenouvelle liste de villes
        ArrayList<Ville> villes = new ArrayList<>();  // ArrayList<Ville> : Ce n’est plus des String, mais des Objets

        // J'ajoute les villes avec add()
        villes.add(new Ville("Nice", "06", "PACA", 343000));
        villes.add(new Ville("Carcassonne", "11", "Occitanie", 47800));
        villes.add(new Ville("Narbonne", "11", "Occitanie", 53400));
        villes.add(new Ville("Lyon", "69", "Auvergne-Rhône-Alpes", 484000));
        villes.add(new Ville("Foix", "09", "Occitanie", 9700));
        villes.add(new Ville("Pau", "64", "Nouvelle-Aquitaine", 77200));
        villes.add(new Ville("Marseille", "13", "PACA", 850700));
        villes.add(new Ville("Tarbes", "65", "Occitanie", 40600));


        Ville plusGrande = villes.get(0);

        for (int i = 1; i < villes.size(); i++) {  // Je cherche la ville la plus peuplée
            if (villes.get(i).getPopulationTotale() > plusGrande.getPopulationTotale()) {
                plusGrande = villes.get(i);
            }
        }
        System.out.println("Ville la plus peuplée : " + plusGrande);

        // Je cherche la ville la moins peuplée
        int indexMin = 0;

        for (int i = 1; i < villes.size(); i++) {
            // On cherche si la ville actuelle est plus petite (<) que notre minimum temporaire
            if (villes.get(i).getPopulationTotale() < villes.get(indexMin).getPopulationTotale()) {
                indexMin = i;
            }
        }

        villes.remove(indexMin);  // Je supprime la ville la moins peuplée

        for (Ville v : villes) {
            if (v.getPopulationTotale() > 100000) {  // Je mets en majuscule les villes de plus de 100 000 habitants
                v.setNom(v.getNom().toUpperCase()); // modifie, récupére, majuscule
            }
        }
        System.out.println("Liste finale : " + villes);  // J'affiche la liste finale
    }
}

// pour mémoire :
// get(i) : récupérer l'élément de la case i
// add() : ajouter un élément
// size() : connaître le nombre d'éléments
// remove(i) : supprimer l'élément de la case i
// set(i, valeur) : remplacer l'élément de la case i
// Math.abs() : transformer un nombre négatif en positif
// get(), set() et remove(). Ce sont les trois méthodes les plus utilisées avec les ArrayList
