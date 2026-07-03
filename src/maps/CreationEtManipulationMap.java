package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

    public static void main(String args[]) {

        /// Création de la HashMap
        HashMap<Integer, String> mapVilles = new HashMap<Integer, String>();

        /// Villes fournies dans l'énoncé
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        /// Ajout des villes demandées
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        /// Affichage de toutes les clés
        System.out.println("Liste des départements :");

        for (Integer departement : mapVilles.keySet()) {
            System.out.println(departement);
        }
        /// Affichage de toutes les valeurs
        System.out.println("\nListe des villes :");

        for (String ville : mapVilles.values()) {
            System.out.println(ville);
        }
        /// Affichage de la taille de la HashMap
        System.out.println("\nNombre de villes : " + mapVilles.size());


    }
}
