package fr.diginamic.salaire;

public class Salarie extends Intervenant{

    // Salaire mensuel fixe
    private double salaireMensuel;

    public Salarie(String nom, String prenom, double salaireMensuel) {

        // Initialise nom et prénom dans la classe mère
        super(nom, prenom);

        this.salaireMensuel = salaireMensuel;
    }

    // Retourne simplement le salaire mensuel
    @Override
    public double getSalaire() {

        return salaireMensuel;
    }

    // Retourne le statut
    @Override
    public String getStatut() {

        return "Salarié";
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }
}
