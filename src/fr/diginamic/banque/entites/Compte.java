package fr.diginamic.banque.entites;

public class Compte {


    private String numeroCompte;   // Attributs privés (encapsulation)
    private double solde;

    // Constructeur
    public Compte(String numeroCompte, double solde) { // Atomique (double)
        this.numeroCompte = numeroCompte;
        this.solde = solde;

    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + solde +
                '}';
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }
}




