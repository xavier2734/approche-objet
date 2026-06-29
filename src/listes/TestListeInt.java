package listes;

import java.util.ArrayList;


public class TestListeInt {

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();  /// Je crée une liste d'entiers

        /// J'ajoute les nombres demandés
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Liste : " + liste);  /// J'affiche toute la liste
        System.out.println("Taille : " + liste.size());  /// J'affiche le nombre d'éléments


        int max = liste.get(0); /// Je considère que le premier nombre est le plus grand

        for (int i = 0; i < liste.size(); i++) {  /// Je parcours la liste pour chercher le plus grand nombre
            if (liste.get(i) > max) {  /// Si je trouve un nombre plus grand que max
                max = liste.get(i);  /// Il devient le nouveau maximum
            }
        }
        System.out.println("Le plus grand : " + max);  /// J'affiche le plus grand nombre

        int min = liste.get(0);  /// Je considère que le premier nombre est le plus petit
        int indiceMin = 0;  /// Je retiens également sa position

        for (int i = 0; i < liste.size(); i++) {  /// Je recherche le plus petit nombre
            if (liste.get(i) < min) {
                min = liste.get(i);
                indiceMin = i;
            }
        }

        liste.remove(indiceMin);  /// Je supprime le plus petit élément

        System.out.println("Après suppression : " + liste);  /// J'affiche la liste après la suppression


        for (int i = 0; i < liste.size(); i++) {  /// Je parcours toute la liste
            if (liste.get(i) < 0) {  /// Si le nombre est négatif
                liste.set(i, Math.abs(liste.get(i)));  /// Je le remplace par sa valeur positive

                ///  if (liste.get(i) < 0) : Je regarde le nombre de la case i, s'il est négatif, je le remplace par sa version positive

            }
        }
        System.out.println("Liste finale : " + liste);  /// J'affiche la liste finale
    }
}
