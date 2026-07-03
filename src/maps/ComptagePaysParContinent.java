package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

    public static void main(String args[]) {

        /// Création de la liste des pays

        ArrayList<Pays> listePays = new ArrayList<>();

        listePays.add(new Pays("France", 65, "Europe"));
        listePays.add(new Pays("Allemagne", 80, "Europe"));
        listePays.add(new Pays("Belgique", 10, "Europe"));
        listePays.add(new Pays("Russie", 150, "Asie"));
        listePays.add(new Pays("Chine", 1400, "Asie"));
        listePays.add(new Pays("Indonésie", 220, "Océanie"));
        listePays.add(new Pays("Australie", 20, "Océanie"));

        /// HashMap de comptage : clé = continent et valeur = nombre de pays

        HashMap<String, Integer> comptage = new HashMap<>();

        /// Parcours de la liste

        for (Pays pays : listePays) {
            String continent = pays.getContinent();

            /// Si le continent existe déjà
            if (comptage.containsKey(continent)) {
                int nombre = comptage.get(continent);
                comptage.put(continent, nombre + 1);
            }
            /// Sinon on l'ajoute avec 1 pays
            else {
                comptage.put(continent, 1);
            }

            /*
             HashMap<String, Integer> compteurs = new HashMap<>();
             for (Pays pays : listePays){
             String continent = pays.getContinent();
             if (compteurs.get(continent)==null){
                 compteurs.put(continent, 1);
             }
               else {
                   Integer compteur = compteurs.get(continent);
                   compteur++;
                   compteurs.put(continent, compteur);
                  }
             }
           */
        }
        /// Affichage du résultat

        System.out.println("Nombre de pays par continent :");
        for (String continent : comptage.keySet())
            System.out.println(continent + " : " + comptage.get(continent));

    }
}

