package listes;

import java.util.ArrayList;

public class TestVilles {

    public static void main(String[] args) {

        /// Je crée unenouvelle liste de villes
        ArrayList<Ville> villes = new ArrayList<>();  /// ArrayList<Ville> : Ce n’est plus des String, mais des Objets

        /// J'ajoute les villes avec add()
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));


        Ville plusGrande = villes.get(0);

        for (int i = 1; i < villes.size(); i++) {  /// Je cherche la ville la plus peuplée
            if (villes.get(i).getNvHabitants() > plusGrande.getNvHabitants()) {
                plusGrande = villes.get(i);
            }
        }
        System.out.println("Ville la plus peuplée : " + plusGrande);

        /// Je cherche la ville la moins peuplée
        int indexMin = 0;

        for (int i = 1; i < villes.size(); i++) {
            if (villes.get(i).getNvHabitants() < villes.get(indexMin).getNvHabitants()) {
                indexMin = i;
            }
        }

        villes.remove(indexMin);  /// Je supprime la ville la moins peuplée

        for (Ville v : villes) {
            if (v.getNvHabitants() > 100000) {  /// Je mets en majuscule les villes de plus de 100 000 habitants
                v.setNom(v.getNom().toUpperCase()); /// modifie, récupére, majuscule
            }
        }
        System.out.println("Liste finale : " + villes);  /// J'affiche la liste finale
    }
}

/// pour mémoire :
/// get(i) : récupérer l'élément de la case i
/// add() : ajouter un élément
/// size() : connaître le nombre d'éléments
/// remove(i) : supprimer l'élément de la case i
/// set(i, valeur) : remplacer l'élément de la case i
/// Math.abs() : transformer un nombre négatif en positif
/// get(), set() et remove(). Ce sont les trois méthodes les plus utilisées avec les ArrayList


