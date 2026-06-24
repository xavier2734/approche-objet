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

        Personne p1 = new Personne("Jean", "Bon", a1);
        Personne p2 = new Personne("Jean", "Bon", a2);
    }

}
