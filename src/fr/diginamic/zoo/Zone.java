package fr.diginamic.zoo;

import java.util.ArrayList;

public class Zone {

    private String nom;  /// Nom de la zone
    private ArrayList<Animal> animaux;  /// Liste des animaux de la zone

    public Zone(String nom) {  /// Constructeur

        this.nom = nom;  /// On enregistre le nom
        this.animaux = new ArrayList<>();  /// On crée une liste vide d'animaux
    }

    public void ajouterAnimal(Animal animal) {  /// Ajouter un animal
        animaux.add(animal);
    }

    public String getNom() {  /// Getter du nom
        return nom;
    }

    public ArrayList<Animal> getAnimaux() { /// Getter de la liste d'animaux
        return animaux;
    }
}
/// private = protégé (on ne touche pas directement)
/// getters = lire
/// setters = modifier
/// constructeur = créer l’objet
/// equals = comparer
/// toString = afficher proprement