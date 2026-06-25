package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class testBanque {


    public static void main(String[] args) {

        // Création d'un compte
        Compte[] comptes = new Compte[2];// Créez un tableau de comptes. Dans ce tableau, stockez 2 instances de comptes
        // index 0 du tableau, doit être une instance de
        //compte normal
        Compte compte1 = new Compte("FR69BB", 2000.75);
        comptes[0] = compte1; // case 0
        // index 1 du tableau, doit être une instance de
        //CompteTaux
        CompteTaux compte2 = new CompteTaux("FR13KUNU", 1998.03, 3.5);
        comptes[1] = compte2; // case 1

        // Affichage des comptes 1 et 2
        for (Compte compte : comptes){   // c'est for each -- pour boucler sur la variable compte typer Compte
            System.out.println(compte);
        }
    }
}
// dans le for : ( Compte (est le type) compte (est la variable) :( : veut dire dans ou dans chaque tableaux)
// et comptes ( le tableau complet )
