package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale a1 = new AdressePostale();
        a1.numeroRue = 58;
        a1.libelleRue = "rue sans issue";
        a1.codePostal = "13000";
        a1.ville = "Carry";

        AdressePostale a2 = new AdressePostale();
        a1.numeroRue = 17;
        a1.libelleRue = "rue convert ";
        a1.codePostal = "33000";
        a1.ville = "Bordeaux";


        Personne nom1 = new Personne();
        nom1.nom = " Jean ";
        nom1.prenom = " Bon ";
        nom1.adresse = a1;
        Personne nom2 = new Personne();
        nom2.nom = " Jean ";
        nom2.prenom = " Bon ";
        nom2.adresse = a2;


    }
}
