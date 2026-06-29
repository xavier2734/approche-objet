package listes;

import java.util.ArrayList;

public class CreationListe {

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();  /// Je crée une liste qui pourra contenir des entiers (Integer)
                                                       /// Je crée une liste qui contiendra uniquement des entiers

        for (int i = 1; i <= 100; i++) {  /// Je remplis la liste avec les nombres de 1 à 100
            liste.add(i);  /// J'ajoute la valeur de i dans la liste
                           ///  Ajoute un élément à la fin de la liste
        }
        System.out.println("Taille de la liste : " + liste.size());   /// J'affiche le nombre d'éléments contenus dans la liste
                                                                      /// size() : Combien d'éléments y a-t-il dans la liste ?
    }


}
