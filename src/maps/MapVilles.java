package maps;

import java.util.HashMap;

 /// Objectif :
 /// Stocker des villes dans une HashMap
 /// Supprimer la ville ayant le moins d'habitants
 /// Afficher les villes restantes

public class MapVilles {

    public static void main(String args[]) {

        /// Création de la HashMap : Clé : nom de la ville et Valeur : objet Ville

        HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();

        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));


        /// Recherche de la ville la moins habitée
        String villeMoinsHabitee = null;
        int minimum = Integer.MAX_VALUE;

        for (String nom : mapVilles.keySet()) {
            Ville ville = mapVilles.get(nom);
            if (ville.getHabitants() < minimum) {
                minimum = ville.getHabitants();
                villeMoinsHabitee = nom;
            }
        }
        /// Suppression de la ville la plus petite

        mapVilles.remove(villeMoinsHabitee);

        /// Affichage des villes restantes
        System.out.println("Liste des villes :");

        for (Ville ville : mapVilles.values()) {
            System.out.println(ville);
        }
    }
}