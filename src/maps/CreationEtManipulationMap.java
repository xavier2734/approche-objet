package maps;

import java.util.HashMap;

/**
 * Classe permettant de découvrir la création, l'alimentation et la manipulation
 * de base d'une HashMap (clés, valeurs et taille).
 *
 * @author xavier2734
 * @version 1.0
 */
public class CreationEtManipulationMap {

    /**
     * Constructeur par défaut de la classe CreationEtManipulationMap.
     */
    public CreationEtManipulationMap() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Initialise la Map des villes par département, ajoute de nouveaux éléments,
     * puis affiche les clés, les valeurs ainsi que la taille globale.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création de la HashMap : clé = Code Département (Integer) et valeur = Ville (String)
        HashMap<Integer, String> mapVilles = new HashMap<Integer, String>();

        // Villes fournies dans l'énoncé
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // Ajout des villes demandées
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Affichage de toutes les clés
        System.out.println("Liste des départements :");
        for (Integer departement : mapVilles.keySet()) {
            System.out.println(departement);
        }

        // Affichage de toutes les valeurs
        System.out.println("\nListe des villes :");
        for (String ville : mapVilles.values()) {
            System.out.println(ville);
        }

        // Affichage de la taille de la HashMap
        System.out.println("\nNombre de villes : " + mapVilles.size());
    }
}
