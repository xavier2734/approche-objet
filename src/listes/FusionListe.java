package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String[] args) {

        /// Création des 2 listes
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<String>();  /// Création de la troisième liste (vide au départ)
                                                        /// création d'une nouvelle liste vide

        for (int i = 0; i < liste1.size(); i++) {  /// Je parcours toute la première liste
            liste3.add(liste1.get(i));  /// J'ajoute chaque élément de liste1 dans liste3
                                        /// liste.get(i); : Je récupère l'élément situé à la position i
                                        /// liste.add(...); : J'ajoute un nouvel élément à la fin de la liste
        }

        for (int i = 0; i < liste2.size(); i++) { /// Je parcours toute la deuxième liste
            liste3.add(liste2.get(i));  /// J'ajoute chaque élément de liste2 dans liste3
                                        /// liste.size(); : Je connais le nombre d'éléments de la liste
        }

        System.out.println(liste3);  /// J'affiche la liste obtenue
    }

}

