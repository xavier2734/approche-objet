package listes;

import java.util.ArrayList;

/**
 * Classe de test permettant d'illustrer la création, l'alimentation
 * et la manipulation de base d'une liste dynamique d'entiers (ArrayList).
 * 
 * @author xavier2734
 * @version 1.0
 */
public class CreationListe {

    /**
     * Point d'entrée principal du programme. Initialise une liste,
     * y ajoute des entiers de manière séquentielle et affiche sa taille.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();  // Je crée une liste qui pourra contenir des entiers (Integer)
                                                       // Je crée une liste qui contiendra uniquement des entiers

        for (int i = 1; i <= 100; i++) {  // Je remplis la liste avec les nombres de 1 à 100
            liste.add(i);  // J'ajoute la valeur de i dans la liste
                           //  Ajoute un élément à la fin de la liste
        }
        System.out.println("Taille de la liste : " + liste.size());   // J'affiche le nombre d'éléments contenus dans la liste
                                                                      // size() : Combien d'éléments y a-t-il dans la liste ?
    }

}
