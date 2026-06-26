package fr.diginamic.Operations.TestEssaies.fr.diginamic;

import  fr.diginamic.Operations.Theatre;

public class TestTheatre {

    public static void main(String[] args) {


        Theatre theatre = new Theatre("Le Grand Rex", 100);  // Création d'un nouveau théâtre

        System.out.println("Nom : " + theatre.getNom());
        System.out.println("Capacité : " + theatre.getCapaciteMax());

        System.out.println();

        // Trois réservations
        theatre.inscrire(20, 15);
        theatre.inscrire(30, 15);
        theatre.inscrire(40, 15);

        // Dépassement de la capacité theatre
        theatre.inscrire(20, 15);

        System.out.println();

        System.out.println("Nombre total de clients : "
                + theatre.getTotalClients());
        System.out.println("Recette totale : "
                + theatre.getRecetteTotale() + " €");

    }
}
