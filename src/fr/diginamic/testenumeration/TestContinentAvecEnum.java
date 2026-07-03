package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

    public static void main(String[] args) {

        ArrayList<Commune> villes = new ArrayList<>();  ///  Créez une liste de villes avec tous les paramètres attendus dont le continent :

        villes.add(new Commune("New York", 8419000, Continent.AMERIQUE));
        villes.add(new Commune("Paris", 2161000, Continent.EUROPE));
        villes.add(new Commune("Pékin", 21540000, Continent.ASIE));
        villes.add(new Commune("Moscou", 12600000, Continent.EUROPE));
        villes.add(new Commune("Berlin", 3769000, Continent.EUROPE));
        villes.add(new Commune("Sydney", 5312000, Continent.OCEANIE));
        villes.add(new Commune("Sao Paulo", 12330000, Continent.AMERIQUE));
        villes.add(new Commune("Dakar", 1146000, Continent.AFRIQUE));

        for (Commune ville : villes) {  ///  Réalisez une boucle qui affiche l’ensemble des villes avec leur continent respectif
            System.out.println(ville);
        }
    }

}
