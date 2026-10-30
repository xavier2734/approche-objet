package maps;

import java.util.HashMap;

/**
 * Classe mettant en œuvre le stockage d'objets de type Ville dans une HashMap.
 * Elle gère la recherche algorithmique de la ville la moins peuplée afin
 * de la supprimer, puis affiche la liste mise à jour.
 *
 * @author xavier2734
 * @version 1.0
 */
public class MapVilles {

    /**
     * Constructeur par défaut de la classe MapVilles.
     */
    public MapVilles() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Initialise la Map des villes, recherche la ville ayant le minimum d'habitants,
     * procède à sa suppression sécurisée et affiche les objets Ville restants.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création de la HashMap : Clé = Nom de la ville (String) et Valeur = Objet Ville (Ville)
        HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();

        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

        // Recherche de la ville la moins habitée
        String villeMoinsHabitee = null;
        int minimum = Integer.MAX_VALUE; // Initialisé avec la plus grande valeur possible

        for (String nom : mapVilles.keySet()) {
            Ville ville = mapVilles.get(nom);
            if (ville.getHabitants() < minimum) {
                minimum = ville.getHabitants();
                villeMoinsHabitee = nom;
            }
        }

        // Suppression sécurisée de la ville la plus petite en dehors de la boucle de parcours
        if (villeMoinsHabitee != null) {
            mapVilles.remove(villeMoinsHabitee);
        }

        // Affichage des objets Ville restants
        System.out.println("Liste des villes :");
        for (Ville ville : mapVilles.values()) {
            System.out.println(ville);
        }
    }
}
