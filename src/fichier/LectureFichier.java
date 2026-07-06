package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Paths;

public class LectureFichier {

    public static void main(String[] args) throws IOException {


        Path pathFichier = Paths.get("C:/Users/Vigneron/desktop/approche-objet/recensement.csv");


        /// Lecture de toutes les lignes
        List<String> lignes = Files.readAllLines(pathFichier);

        /// Affichage de chaque ligne
        for (String ligne : lignes) {
            System.out.println(ligne);
        }

    }
}
