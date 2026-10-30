package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

/**
 * Classe de test principale permettant de gérer et de calculer un ensemble
 * d'opérations bancaires (Crédits et Débits) de manière polymorphe.
 *
 * @author xavier2734
 * @version 1.0
 */
public class TestOperation {

    /**
     * Constructeur par défaut de la classe TestOperation.
     */
    public TestOperation() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée de l'application.
     * Crée un tableau contenant des opérations de crédit et de débit, effectue le parcours
     * du tableau pour afficher le détail de chaque opération et calcule le solde total global.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Tableau contenant un historique mélangé d'opérations bancaires
        Operation[] operations = {
                new Credit("01/01/2025", 500),
                new Debit("02/01/2025", 100),
                new Credit("03/01/2025", 200),
                new Debit("04/01/2025", 50)
        };

        // Variable globale servant à calculer le solde final du compte
        double total = 0;

        // Lecture globale du tableau (op est la variable locale de type Operation)
        for (Operation op : operations) {

            // Affichage des informations de l'opération en cours via les accesseurs
            System.out.println("Date : " + op.getDate());
            System.out.println("Montant : " + op.getMontant());
            System.out.println("Type : " + op.getType());

            // Permet de faire appel à la classe concrète pour appliquer le bon calcul.
            // getType() exécute la méthode redéfinie dans la classe fille (Credit ou Debit).
            if (op.getType().equals("DEBIT")) {
                total -= op.getMontant(); // L'opérateur -= soustrait le montant au total général
            } else {
                total += op.getMontant(); // L'opérateur += ajoute le montant au total général
            }

            System.out.println("-------------------");
        }

        // Affichage du résultat final calculé
        System.out.println("Montant total : " + total);
    }
}
