package fr.diginamic.entreprise;

import java.util.ArrayList;

public class Entreprise {

    // Nom de l'entreprise
    private String nom;

    // Liste des employés de l'entreprise
    private ArrayList<Employe> employes;

    // Constructeur
    public Entreprise(String nom) {

        // On récupère le nom passé en paramètre
        this.nom = nom;

        // On crée une liste vide d'employés
        this.employes = new ArrayList<>();

    }

    // Permet d'ajouter un employé dans la liste
    public void ajouterEmploye(Employe employe) {

        employes.add(employe);

    }

    // Calcule la somme de tous les salaires
    public double calculerSalaire() {

        double total = 0;

        // On parcourt toute la liste
        for (int i = 0; i < employes.size(); i++) {

            // On ajoute le salaire de chaque employé
            total = total + employes.get(i).getSalaire();

        }

        return total;

    }

    // Recherche un employé grâce à son nom
    public Employe chercherEmploye(String nom) {

        // On parcourt la liste
        for (int i = 0; i < employes.size(); i++) {

            // Si le nom correspond
            if (employes.get(i).getNom().equals(nom)) {

                // On retourne l'employé trouvé
                return employes.get(i);

            }

        }

        // Aucun employé trouvé
        return null;

    }

    // Retourne les employés dont le salaire est compris
    // entre min et max
    public ArrayList<Employe> chercherParSalaire(double min, double max) {

        // Nouvelle liste pour stocker le résultat
        ArrayList<Employe> resultat = new ArrayList<>();

        // On parcourt tous les employés
        for (int i = 0; i < employes.size(); i++) {

            // Si le salaire est compris entre min et max
            if (employes.get(i).getSalaire() >= min
                    && employes.get(i).getSalaire() <= max) {

                // On ajoute l'employé dans la liste résultat
                resultat.add(employes.get(i));

            }

        }

        // On retourne la liste
        return resultat;

    }

}
