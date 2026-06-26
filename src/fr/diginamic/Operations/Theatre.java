package fr.diginamic.Operations;

public class Theatre {

    // Private élément à usage interne de la classe, invisible de l'extérieur
    // classe de visibilité package utilisable seulement par des
    // classes situées dans le même package

    private String nom;   // Nom du théâtre
    private int capaciteMax;  // Nombre maximum de personnes
    private int totalClients;  // Nombre de clients déjà inscrits
    private double recetteTotale;  // Argent gagné grâce aux ventes

    public Theatre(String nom, int capaciteMax) { // Constructeur

        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClients = 0;
        this.recetteTotale = 0;

    }

    public void inscrire(int nbClients, double prixPlace) {


        if (totalClients + nbClients <= capaciteMax) {  // Vérification si les nouveaux clients peuvent encore entrer
            totalClients += nbClients;  // On ajoute les clients
            recetteTotale += nbClients * prixPlace;  // On ajoute l'argent gagné

            System.out.println(nbClients + " client(s) inscrit(s).");  // Affichage d'inscrits
        } else {

            System.out.println("Erreur : capacité maximale atteinte !");  // Plus assez de place dans le theatre
        }

    }

    public int getTotalClients() { // renvoie nombre clients
        return totalClients;
    }

    public double getRecetteTotale() { // renvoie recette totale
        return recetteTotale;
    }

    public String getNom() {  // renvoie nom du theatre
        return nom;
    }

    public int getCapaciteMax() {  // renvoie nombre de places max
        return capaciteMax;
    }



}
