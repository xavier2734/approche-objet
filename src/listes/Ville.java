package listes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

/**
 * Représente une ville au sein du package listes avec ses données démographiques.
 * Cette classe implémente les méthodes de comparaison equals et hashCode pour permettre
 * des manipulations avancées au sein de listes dynamiques.
 *
 * @author xavier2734
 * @version 1.0
 */
public class Ville {

    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    // tout est généré
    /**
     * Constructeur complet permettant d'initialiser une nouvelle instance de Ville.
     *
     * @param nom              Le nom de la ville.
     * @param codeDepartement  Le numéro ou code du département.
     * @param nomRegion        Le nom de la région associée.
     * @param populationTotale Le nombre total d'habitants.
     */
    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    /**
     * Récupère le nom de la ville.
     *
     * @return Le nom de la ville.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de la ville.
     *
     * @param nom Le nouveau nom à attribuer à la ville.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupère le code du département de la ville.
     *
     * @return Le code du département.
     */
    public String getCodeDepartement() {
        return codeDepartement;
    }

    /**
     * Récupère le nom de la région de la ville.
     *
     * @return Le nom de la région.
     */
    public String getNomRegion() {
        return nomRegion;
    }

    /**
     * Récupère la population totale de la ville.
     *
     * @return Le nombre total d'habitants.
     */
    public int getPopulationTotale() {
        return populationTotale;
    }

    /**
     * Compare cette instance de Ville avec un autre objet pour vérifier leur égalité
     * en se basant sur l'ensemble des attributs.
     *
     * @param o L'objet à comparer avec cette ville.
     * @return true si les objets sont identiques ou ont les mêmes valeurs, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) return false;
        return populationTotale == ville.populationTotale && Objects.equals(nom, ville.nom) && Objects.equals(codeDepartement, ville.codeDepartement) && Objects.equals(nomRegion, ville.nomRegion);
    }

    /**
     * Génère un code de hachage unique pour cette instance de Ville.
     *
     * @return Le hash code calculé à partir des attributs de la ville.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nom, codeDepartement, nomRegion, populationTotale);
    }

    /**
     * Retourne une représentation textuelle des informations de la ville.
     *
     * @return Une chaîne décrivant l'état de l'objet Ville.
     */
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}
