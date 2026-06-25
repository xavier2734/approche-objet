package fr.diginamic.banque;


import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;


public class TestOperation { // class test

    public static void main(String[] args) {


        Operation[] operations = {   //  tableau contenant les opérations

                new Credit("01/01/2025", 500),
                new Debit("02/01/2025", 100),
                new Credit("03/01/2025", 200),
                new Debit("04/01/2025", 50)
        };

        double total = 0;

        for (Operation op : operations) {  // lecture du tableau --- op variable de type Operation

            System.out.println("Date : " + op.getDate());         //
            System.out.println("Montant : " + op.getMontant());   //  affiche les methodes
            System.out.println("Type : " + op.getType());         //

            if (op.getType().equals("DEBIT")) {  // permet de faire appel la classe debit et soumettre
                                                 // getType execute le code la class fille
                total -= op.getMontant(); // -= soustrait deux valeurs et met le resultat
            } else {
                total += op.getMontant(); // += ajoute  les deux valeurs et met le resultat
            }

            System.out.println("-------------------");
        }

        System.out.println("Montant total : " + total);  // affiche le montant total
    }
}


