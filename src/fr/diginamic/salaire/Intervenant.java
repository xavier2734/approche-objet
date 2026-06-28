package fr.diginamic.salaire;

public abstract class Intervenant {

    // Informations communes à tous les intervenants
    private String nom;
    private String prenom;

    // Constructeur de la classe mère
    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Chaque classe fille calculera son salaire à sa manière
    public abstract double getSalaire();

    // Chaque classe fille retournera son statut
    public abstract String getStatut();

    // Affiche toutes les informations d'un intervenant
    public void afficherDonnees() {

        System.out.println("--------------------------");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);

        // Appel de la méthode de la classe fille
        System.out.println("Salaire : " + getSalaire() + " €");

        // Appel de la méthode de la classe fille
        System.out.println("Statut : " + getStatut());

        System.out.println("--------------------------");
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
