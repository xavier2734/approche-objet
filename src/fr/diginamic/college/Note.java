package fr.diginamic.college;
/**
 * Représente une note d'un élève dans une matière
 */
public class Note {

    private double valeur;
    private String matiere;

    public Note(double valeur, String matiere) {
        this.valeur = valeur;
        this.matiere = matiere;
    }

    public double getValeur() {
        return valeur;
    }

    public String getMatiere() {
        return matiere;
    }
}

