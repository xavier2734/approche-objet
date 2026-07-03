package fr.diginamic.college;


import java.util.ArrayList;

/**
 * Collège = contient plusieurs classes
 */
public class College {

    private String nom;
    private ArrayList<Classe> classes;

    public College(String nom) {
        this.nom = nom;
        this.classes = new ArrayList<>();
    }

    public void ajouterClasse(Classe c) {
        classes.add(c);
    }

    public Classe findClasse(String nom) {

        for (int i = 0; i < classes.size(); i++) {

            Classe c = classes.get(i);

            if (c.getNom().equals(nom)) {
                return c;
            }
        }

        return null;
    }
}

///Le schéma :
/// College
///    ↓ contient
///       Classes
///       ↓ contient
///        Eleves
///       ↓ contient
///        Notes
