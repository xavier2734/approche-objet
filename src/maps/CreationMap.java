package maps;

import java.util.HashMap;

/**
 * Premier exercice du TP consacré à la création et à la découverte
 * du fonctionnement d'une HashMap (association Prénom -> Salaire).
 *
 * @author xavier2734
 * @version 1.0
 */
public class CreationMap {

    /**
     * Point d'entrée de l'application.
     * Initialise la Map des salaires, insère les couples prénom/salaire,
     * puis affiche le nombre total d'associations.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création de la HashMap : clé = prénom (String) et valeur = salaire (Double)
        HashMap<String, Double> mapSalaires = new HashMap<>();

        // Ajout des employés
        mapSalaires.put("Paul", 1750.0);
        mapSalaires.put("Hicham", 1825.0);
        mapSalaires.put("Yu", 2250.0);
        mapSalaires.put("Ingrid", 2015.0);
        mapSalaires.put("Chantal", 2418.0);

        // Affichage de la taille de la HashMap
        System.out.println("Nombre d'employés : " + mapSalaires.size());
    }

    /**
     * Constructeur par défaut de la classe CreationMap.
     */
    public CreationMap() {
        super();
    }

    /**
     * Génère le code de hachage de l'objet basé sur l'implémentation parente.
     *
     * @return Le code de hachage de l'instance.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Compare l'instance actuelle avec un autre objet pour vérifier leur égalité.
     *
     * @param obj L'objet à comparer avec l'instance actuelle.
     * @return true si les objets sont identiques, false sinon.
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Retourne une représentation textuelle de l'objet.
     *
     * @return La chaîne de caractères représentant l'objet.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
