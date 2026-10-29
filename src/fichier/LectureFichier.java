package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Paths;

/**
 * Classe utilitaire permettant de lire l'intégralité d'un fichier de recensement
 * au format CSV et de l'afficher directement dans la console ligne par ligne.
 * 
 * @author xavier2734
 * @version 1.0
 */
public class LectureFichier {

    /**
     * Point d'entrée principal de l'application réalisant l'ouverture,
     * le parcours et l'affichage du fichier cible.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     * @throws IOException Si une erreur d'accès ou de lecture du fichier survient.
     */
    public static void main(String[] args) throws IOException {

        Path pathFichier = Paths.get("C:/Users/Vigneron/desktop/approche-objet/recensement.csv");

        // Lecture de toutes les lignes
        List<String> lignes = Files.readAllLines(pathFichier);

        // Affichage de chaque ligne
        for (String ligne : lignes) {
            System.out.println(ligne);
        }

    }
}
