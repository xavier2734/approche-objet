package TpEquals;

import java.util.Objects;

public class Pays {

    private String nom;  /// Nom du pays
    private int population; /// Nombre d'habitants du pays

    /// Constructeur : appelé quand on fait new Pays(...)
    public Pays(String nom, int population) {
        this.nom = nom;  /// Je mets le nom reçu dans l'attribut nom
        this.population = population; /// Je mets la population reçue dans l'attribut population
    }

    public String getNom() {  /// Retourne le nom du pays
        return nom;
    }

    public void setNom(String nom) {  /// Modifie le nom du pays
        this.nom = nom;
    }

    public int getPopulation() {  /// Retourne la population du pays
        return population;
    }

    public void setPopulation(int population) {  /// Modifie la population du pays
        this.population = population;
    }

    @Override
    public boolean equals(Object obj) {  /// equals() : compare si les objets ont le même contenu

        /// Si les deux variables désignent exactement le même objet, il est inutile de comparer les attributs : c'est forcément true
        if (this == obj) { /// == : est-ce que c'est le même objet
            return true;
        }
        /// Si l'objet est null OU si ce n'est pas un objet de type Pays, alors ils ne peuvent pas être égaux
        if (obj == null || getClass() != obj.getClass()) { ///  || : ou
            return false;
        }
        /// Je transforme l'objet reçu en objet Pays pour pouvoir accéder à ses attributs
        Pays autre = (Pays) obj;

        /// Je compare les deux populations, ET je compare les deux noms, Les deux comparaisons doivent être vraies
        return population == autre.population &&
                Objects.equals(nom, autre.nom);
    }
}

/// equals() : Je compare les informations contenues dans les objets.
/// == : Je compare si les deux variables désignent exactement le même objet.
