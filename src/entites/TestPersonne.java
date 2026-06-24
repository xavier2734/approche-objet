package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        AdressePostale a1 =
                new AdressePostale(58, "rue sans issue",
                        "13000", "Carry");

        AdressePostale a2 =
                new AdressePostale(17, "rue convert",
                        "33000", "Bordeaux");




        Personne p1 = new Personne("Jean", "Bon");
        Personne p2 = new Personne("Jean", "Bon");

        // Valorisation de l'adresse via la méthode
        p1.modifierAdresse(a1);
        p2.modifierAdresse(a2);

        // Affichage
        p1.afficherIdentite();
        p2.afficherIdentite();

        // Test des getters
        System.out.println("Nom : " + p1.getNom());
        System.out.println("Nom : " + p2.getNom());
        System.out.println("Prénom : " + p1.getPrenom());
        System.out.println("Prénom : " + p2.getPrenom());

        // Test des setters
        p1.modifierNom("Durand");
        p1.modifierPrenom("Paul");
        p2.modifierNom("Marley");
        p2.modifierPrenom("Bob");

        p1.afficherIdentite();
        p2.afficherIdentite();

        System.out.println(p2.getAdresse());
        System.out.println(p1.getAdresse());
    }
}


