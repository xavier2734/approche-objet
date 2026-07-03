package fr.diginamic.recensement;

import fichier.Ville;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class ExtractionRecensement {
    public static void main(String[] args) {

        Path pathFichier = Paths.get("C:desktop/approche-objet/recensement.csv");

        /// On charge les données du recensement
        /// (souvent fourni dans le TP précédent)


        List<Ville> villes;
        villes = RecensementService.chargerFichier();

        /// Villes de plus de 100 000 habitants
        System.out.println("Villes de plus de 100 000 habitants :");

        for (int i = 0; i < villes.size(); i++) {

            Ville v = villes.get(i);

            if (v.getPopulation() > 100000) {

                System.out.println(v.getNom() + " - " + v.getPopulation());

            }
        }

        System.out.println();

        /// Villes du département 34 avec plus de 10 000 habitants
        System.out.println("Villes du département 34 (> 10 000 hab) :");

        for (int i = 0; i < villes.size(); i++) {

            Ville v = villes.get(i);

            if (v.getCodeDepartement().equals("34")
                    && v.getPopulation() > 10000) {

                System.out.println(v.getNom() + " - " + v.getPopulation());

            }
        }

        System.out.println();

        /// Population totale du département 34
        int totalDept34 = 0;

        for (int i = 0; i < villes.size(); i++) {

            Ville v = villes.get(i);

            if (v.getCodeDepartement().equals("34")) {

                totalDept34 = totalDept34 + v.getPopulation();

            }
        }

        System.out.println("Population totale département 34 : " + totalDept34);

        System.out.println();

        /// Population totale de la région Occitanie
        /// (on suppose que la région est donnée dans Ville)
        int totalOccitanie = 0;

        for (int i = 0; i < villes.size(); i++) {

            Ville v = villes.get(i);

            if (v.getNomRegion().equals("Occitanie")) {

                totalOccitanie = totalOccitanie + v.getPopulation();

            }
        }

        System.out.println("Population Occitanie : " + totalOccitanie);
    }
}
