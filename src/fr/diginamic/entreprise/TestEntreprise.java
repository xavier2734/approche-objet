package fr.diginamic.entreprise;

import java.util.ArrayList;

public class TestEntreprise {
    public static void main(String[] args) {

        Entreprise entreprise = new Entreprise("toto");

        entreprise.ajouterEmploye(new Employe("Martin", "Paul", 1800));
        entreprise.ajouterEmploye(new Employe("Durand", "Julie", 2500));
        entreprise.ajouterEmploye(new Employe("Petit", "Lucas", 3200));
        entreprise.ajouterEmploye(new Employe("Bernard", "Emma", 2100));

        System.out.println("Somme des salaires : "
                + entreprise.calculerSalaire());

        System.out.println();

        Employe employe = entreprise.chercherEmploye("Martin");

        if (employe != null) {

            System.out.println("Employé trouvé : "
                    + employe.getNom() + " "
                    + employe.getPrenom());

        }

        System.out.println();

        ArrayList<Employe> liste = entreprise.chercherParSalaire(2000, 3000);

        for (int i = 0; i < liste.size(); i++) {

            System.out.println(liste.get(i).getNom() + " "
                    + liste.get(i).getPrenom());

        }

    }

}
