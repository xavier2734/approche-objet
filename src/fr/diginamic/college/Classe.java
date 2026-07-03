package fr.diginamic.college;

import java.util.ArrayList;


 ///  Classe scolaire (6A, 5B...)

public class Classe {

    private String nom;
    private ArrayList<Eleve> eleves;

    public Classe(String nom) {
        this.nom = nom;
        this.eleves = new ArrayList<>();
    }

    public void ajouterEleve(Eleve eleve) {
        eleves.add(eleve);
    }

    public Eleve findEleve(String nom, String prenom) {

        for (int i = 0; i < eleves.size(); i++) {

            Eleve e = eleves.get(i);
            if (e.getNom().equals(nom) && e.getPrenom().equals(prenom)) {
                return e;
            }
        }

        return null;
    }

    public double calculerMoyenne() {

        double somme = 0;
        int count = 0;

        for (int i = 0; i < eleves.size(); i++) {

            Eleve e = eleves.get(i);
            somme += e.calculerMoyenne();
            count++;
        }
        return count == 0 ? 0 : somme / count;
    }

    public double calculerMoyenne(String matiere) {

        double somme = 0;
        int count = 0;

        for (int i = 0; i < eleves.size(); i++) {

            Eleve e = eleves.get(i);
            somme += e.calculerMoyenne(matiere);
            count++;
        }
        return count == 0 ? 0 : somme / count;
    }
    public String getNom() {
        return nom;
    }
}


