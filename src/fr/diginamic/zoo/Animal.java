package fr.diginamic.zoo;

import java.util.Objects; /// Import utile pour comparer proprement des objets (évite les NullPointerException)

public class Animal {  /// Classe qui représente un animal dans le zoo, c'est le "plan" à partir duquel on crée des animaux (new Animal(...))

    private String nom;
    private String famille;
    private String espece;
    private double poids;
    private String alimentation;

    public Animal(String nom, String famille, String espece, double poids, String alimentation) {  /// Constructeur : permet de créer un animal
                                                                                                   /// avec toutes ses infos
        this.nom = nom;
        this.famille = famille;
        this.espece = espece;
        this.poids = poids;
        this.alimentation = alimentation;
    }
    /// GETTERS Permettent de lire les valeurs (car les attributs sont private
    /// SETTERS Permettent de modifier les valeurs si besoin
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }

    /// equals() Sert à comparer deux animaux (utile pour les collections)
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return Double.compare(poids, animal.poids) == 0 && Objects.equals(nom, animal.nom) && Objects.equals(famille, animal.famille) && Objects.equals(espece, animal.espece) && Objects.equals(alimentation, animal.alimentation);
    }

    /// hashCode() Doit toujours aller avec equals()
    @Override
    public int hashCode() {
        return Objects.hash(nom, famille, espece, poids, alimentation);
    }

    /// toString() Permet d'afficher l'objet proprement
    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", famille='" + famille + '\'' +
                ", espece='" + espece + '\'' +
                ", poids=" + poids +
                ", alimentation='" + alimentation + '\'' +
                '}';
    }
}
