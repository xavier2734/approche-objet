package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double tauxRemuneration;

    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {  // hérite de comptes et va représenter le concept de compte
        super(numeroCompte, solde);   // Appel du constructeur de la classe mère Compte
        this.tauxRemuneration = tauxRemuneration;  // Taux de rémunération
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    @Override
    public String toString() {  // super pour appeler la méthode toString() de Compte
// Récupère l'affichage de Compte puis ajoute le taux
        return super.toString() +
                ", tauxRemuneration=" + tauxRemuneration;  //  Ajout du tauxRenumeration
    }
}
