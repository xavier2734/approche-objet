package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Compte;

public class testBanque {


    public static void main(String[] args) {

        // Création d'un compte
        Compte compte1 = new Compte("FR69BB", 2000.75);

        // Affichage de l'objet
        System.out.println(compte1);
    }

}
