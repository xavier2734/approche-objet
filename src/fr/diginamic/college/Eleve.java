package fr.diginamic.college;

import java.util.ArrayList;


 /// Un élève possède des notes

public class Eleve {

    private String nom;
    private String prenom;
    private ArrayList<Note> notes;

    public Eleve(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new ArrayList<>();
    }

    public void ajouterNote(Note note) {
        notes.add(note);
    }

    public double calculerMoyenne() {

        double somme = 0;

        for (int i = 0; i < notes.size(); i++) {
            somme += notes.get(i).getValeur();
        }

        return notes.isEmpty() ? 0 : somme / notes.size();
    }

    public double calculerMoyenne(String matiere) {

        double somme = 0;
        int count = 0;

        for (int i = 0; i < notes.size(); i++) {

            Note n = notes.get(i);

            if (n.getMatiere().equals(matiere)) {
                somme += n.getValeur();
                count++;
            }
        }

        return count == 0 ? 0 : somme / count;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}

