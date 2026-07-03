package fr.diginamic.zoo;

import java.util.ArrayList;

public class Zoo{   ///Classe Zoo, représente un zoo qui contient plusieurs zones

    private String nom;
    private ArrayList<Zone> zones;    /// Liste des zones du zoo

    public Zoo(String nom) {    ///Constructeur, ici on crée le zoo + toutes ses zones directement
        this.nom = nom;
        /*this.zones = new ArrayList<>();*/

        zones = new ArrayList<>(); /// Création de la liste des zones

        /// On crée les 5 zones du zoo
        zones.add(new SavaneAfricaine("Savane africaine"));
        zones.add(new TerreFauves("Terre des fauves"));
        zones.add(new FermeReptiles("Ferme aux reptiles"));
        zones.add(new Aquarium("Aquarium"));
        zones.add(new Voliere("Volière"));
    }

    public void ajouterAnimal (Animal animal) {  ///  Méthode : ajouter un animal dans la bonne zone
                                                 /// On parcourt toutes les zones et on teste où il doit aller
        for (Zone zone : zones) {

            /// SAVANE AFRICAINE, Mammifère + Herbivore
            if (zone.getNom().equals("Savane africaine")
                    && animal.getEspece().equals("Mammifere")
                    && animal.getAlimentation().equals("Herbivore")) zone.ajouterAnimal(animal);

                /// TERRE DES FAUVES, Mammifère + Carnivore
            else if (zone.getNom().equals("Terre des fauves")
                    && animal.getEspece().equals("Mammifere")
                    && animal.getAlimentation().equals("Carnivore")) {
                zone.ajouterAnimal(animal);
            }

            /// FERME AUX REPTILES, Reptiles uniquement
            else if (zone.getNom().equals("Ferme aux reptiles")
                    && animal.getEspece().equals("Reptile")) {
                zone.ajouterAnimal(animal);
            }

            /// AQUARIUM, Poissons uniquement
            else if (zone.getNom().equals("Aquarium")
                    && animal.getEspece().equals("Poisson")) {
                zone.ajouterAnimal(animal);
            }

            /// VOLIÈRE, Oiseaux uniquement
            else if (zone.getNom().equals("Volière")
                    && animal.getEspece().equals("Oiseau")) {
                zone.ajouterAnimal(animal);
            }
        }
    }
    public double calculerNourriture() {  /// Calcule la nourriture totale nécessaire pour le zoo
        double total = 0;
        for (int i = 0; i < zones.size(); i++) {
            Zone zone = zones.get(i);
            if (zone.getNom().equals("Savane africaine")) {  /// SAVANE : 25 kg par animal
                total = total + zone.getAnimaux().size() * 25;
            }
            else if (zone.getNom().equals("Terre des fauves")) {  /// TERRE DES FAUVES : 7 kg par animal
                total = total + zone.getAnimaux().size() * 7;
            }
            else if (zone.getNom().equals("Ferme aux reptiles")) {  /// REPTILES : 0.1 kg par animal
                total = total + zone.getAnimaux().size() * 0.1;
            }
            else if (zone.getNom().equals("Aquarium")) {  /// POISSONS : 0.01 kg par animal
                total = total + zone.getAnimaux().size() * 0.01;
            }
            else if (zone.getNom().equals("Volière")) {  /// OISEAUX : 0.01 kg par animal
                total = total + zone.getAnimaux().size() * 0.01;
            }
        }
        return total;
    }
    public void afficherInfos() {  /// Affiche toutes les infos du zoo (zones + animaux dans chaque zone)
        System.out.println("Zoo : " + nom);
        for (int i = 0; i < zones.size(); i++) {
            Zone zone = zones.get(i);
            System.out.println();
            System.out.println("Zone : " + zone.getNom());
            for (int j = 0; j < zone.getAnimaux().size(); j++) {
                Animal animal = zone.getAnimaux().get(j);
                System.out.println(animal.getNom()
                        + " - "
                        + animal.getFamille());
            }
        }
    }
}
