package maps;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Classe principale permettant de compter le nombre de pays par continent
 * à partir d'une liste de pays prédéfinie.
 *
 * @author xavier2734
 * @version 1.0
 */
public class ComptagePaysParContinent {

    /**
     * Constructeur par défaut de la classe ComptagePaysParContinent.
     */
    public ComptagePaysParContinent() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Initialise la liste des pays, effectue le comptage par continent
     * à l'aide d'une Map, puis affiche les résultats.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création de la liste des pays
        ArrayList<Pays> listePays = new ArrayList<>();

        listePays.add(new Pays("France", 65, "Europe"));
        listePays.add(new Pays("Allemagne", 80, "Europe"));
        listePays.add(new Pays("Belgique", 10, "Europe"));
        listePays.add(new Pays("Russie", 150, "Asie"));
        listePays.add(new Pays("Chine", 1400, "Asie"));
        listePays.add(new Pays("Indonésie", 220, "Océanie"));
        listePays.add(new Pays("Australie", 20, "Océanie"));

        // HashMap de comptage : clé = continent (String) et valeur = nombre de pays (Integer)
        HashMap<String, Integer> comptage = new HashMap<>();

        // Parcours de la liste des pays pour alimenter les compteurs
        for (Pays pays : listePays) {
            String continent = pays.getContinent();

            // Approche 1 : Utilisation de containsKey()
            if (comptage.containsKey(continent)) {
                int nombre = comptage.get(continent);
                comptage.put(continent, nombre + 1);
            }
            else {
                comptage.put(continent, 1);
            }

            // --- APPROCHE ALTERNATIVE (Commentée à but pédagogique) ---
            // On peut aussi tester si get() renvoie null au lieu d'utiliser containsKey() :
            //
            // if (comptage.get(continent) == null) {
            //     comptage.put(continent, 1); // Premier passage : on initialise à 1
            // } else {
            //     Integer compteur = comptage.get(continent);
            //     compteur++; // Incrémentation locale
            //     comptage.put(continent, compteur); // Mise à jour de la Map
            // }
            // -----------------------------------------------------------
        }

        // Affichage du résultat final
        System.out.println("Nombre de pays par continent :");
        for (String continent : comptage.keySet()) {
            System.out.println(continent + " : " + comptage.get(continent));
        }
    }
}
