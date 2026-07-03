package fr.diginamic.recensement;

import fichier.Ville;

import java.util.ArrayList;

public class Departement {

    private String code; /// Code du département
    private ArrayList<Ville> villes;

    /// Liste des villes du département
    public Departement(String code) {  /// Constructeur
        this.code = code;
        this.villes = new ArrayList<>();
    }

    public void ajouterVille(Ville ville) {  /// Ajouter une ville dans le département
        villes.add(ville);
    }

    public int calculerPopulation() {  /// Calcul de la population totale du département
        int total = 0;
        for (int i = 0; i < villes.size(); i++) {
            total = total + villes.get(i).getPopulation();
        }
        return total;
    }

    public String getCode() {  /// Getter
        return code;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }
}
