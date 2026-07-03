package maps;

import java.util.HashMap;

public class CreationMap {

    ///   Création d'une HashMap permettant d'associer
    ///  * le prénom d'un employé à son salaire.

    public static void main(String[] args) {

        /// Création de la HashMap : clé : prénom (String) et valeur : salaire (Double)
        HashMap<String, Double> mapSalaires = new HashMap<>();

        /// Ajout des employés
        mapSalaires.put("Paul", 1750.0);
        mapSalaires.put("Hicham", 1825.0);
        mapSalaires.put("Yu", 2250.0);
        mapSalaires.put("Ingrid", 2015.0);
        mapSalaires.put("Chantal", 2418.0);

        /// Affichage de la taille de la HashMap
        System.out.println("Nombre d'employés : " + mapSalaires.size());

    }

    public CreationMap() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
