package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * Classe de test principale permettant d'expérimenter la création de comptes bancaires
 * et l'exploitation du polymorphisme à l'aide d'un tableau de comptes.
 *
 * @author xavier2734
 * @version 1.0
 */
public class testBanque {

    /**
     * Constructeur par défaut de la classe testBanque.
     */
    public testBanque() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Initialise un tableau de comptes, y stocke une instance de Compte normal
     * et une instance de CompteTaux, puis affiche leur contenu via une boucle for-each.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création d'un tableau de comptes pour stocker 2 instances de comptes
        Compte[] comptes = new Compte[2];

        // Index 0 du tableau : instance de compte normal
        Compte compte1 = new Compte("FR69BB", 2000.75);
        comptes[0] = compte1;

        // Index 1 du tableau : instance de CompteTaux
        CompteTaux compte2 = new CompteTaux("FR13KUNU", 1998.03, 3.5);
        comptes[1] = compte2;

        // Affichage du contenu du tableau à l'aide d'une boucle For-Each
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}

/*
 * ============================================================================
 * 🧠 MÉMO POUR LES RÉVISIONS (Le fonctionnement du For-Each)
 * ============================================================================
 * Dans la syntaxe "for (Compte compte : comptes)" :
 * - Compte  : correspond au TYPE d'élément contenu dans le tableau.
 * - compte  : correspond à la VARIABLE locale qui prend la valeur de l'élément à chaque tour.
 * - :       : signifie "dans" ou "pour chaque élément dans".
 * - comptes : correspond au TABLEAU complet que l'on est en train de parcourir.
 * ============================================================================
 */
