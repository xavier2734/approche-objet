package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

    // Nombre de jours travaillés
    private int nbJours;

    // Salaire gagné par jour
    private double montantJournalier;

    public Pigiste(String nom, String prenom, int nbJours, double montantJournalier) {

        // Initialise nom et prénom
        super(nom, prenom);

        this.nbJours = nbJours;
        this.montantJournalier = montantJournalier;
    }

    // Calcule le salaire du pigiste
    @Override
    public double getSalaire() {

        return nbJours * montantJournalier;
    }

    // Retourne le statut
    @Override
    public String getStatut() {

        return "Pigiste";
    }

    public int getNbJours() {
        return nbJours;
    }

    public double getMontantJournalier() {
        return montantJournalier;
    }
}
