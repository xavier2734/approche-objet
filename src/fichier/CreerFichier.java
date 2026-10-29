package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe principale permettant de lire un fichier de recensement au format CSV,
 * de filtrer les données selon un critère de population, et de générer
 * un nouveau fichier CSV contenant uniquement les villes filtrées.
 *
 * @author xavier2734
 * @version 1.0
 */
public class CreerFichier {

    /**
     * Point d'entrée de l'application qui orchestre la lecture, le traitement
     * et l'écriture des données démographiques.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     * @throws IOException Si une erreur d'entrée/sortie survient lors de la lecture ou de l'écriture des fichiers.
     */
    public static void main(String[] args) throws IOException {

        // Etape 1 : j'ai besoin d'un path construit à partir du chemin
        Path pathFichier = Paths.get("C:/Users/Vigneron/desktop/approche-objet/recensement.csv");

        // Etape 2 : lecture du contenu et stockage dans une liste : lignes
        List<String> lignes = Files.readAllLines(pathFichier);
        lignes.remove(0);

        // Etape 3 : Je crée une liste vide pour stocker les villes
        ArrayList<Ville> listeVilles = new ArrayList<>();

        // Etape 4 : Pour chaque ligne du fichier qu'on a lu, on va créer une Ville
        //           qu'on met dans listeVilles
        for (String ligne : lignes) {
            String[] morceaux = ligne.split(";"); // tableau avec 10 morceaux
            // 1 : nom région, 2: code dept, 6: nom de la ville, 9: pop

            int population = Integer.parseInt(morceaux[9].replace(" ", ""));
            System.out.println(ligne);
            System.out.println(morceaux.length);

            Ville nvVille = new Ville(morceaux[6], morceaux[2],
                    morceaux[1], population);
            if (nvVille.getPopulation() >= 25000) {
                listeVilles.add(nvVille);
            }
        }

        // Etape 5 : on crée une liste de String qui va servir à alimenter notre
        //           fichier de sortie qui ne contindra que les villes de plus de
        //           25000 habitants

        ArrayList<String> lignesOut = new ArrayList<>();
        lignesOut.add("Nom; Code département; Nom de la région; Population totale");
        for (Ville v : listeVilles) {
            String ligneOut = v.getNom() + ";" + v.getCodeDepartement() + ";" + v.getNomRegion() + ";" + v.getPopulation();
            lignesOut.add(ligneOut);
        }

        // Etape 6: crée le fichier de sortie
        Path pathOut = Paths.get("C:/Users/Vigneron/desktop/approche-objet/recensement25k.csv");
        Files.write(pathOut, lignesOut);
    }

}
