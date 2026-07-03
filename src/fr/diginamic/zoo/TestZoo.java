package fr.diginamic.zoo;

public class TestZoo {  /// Classe de test, sert uniquement à exécuter le programme et vérifier que tout fonctionne

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Zoo de Royan"); /// Création du zoo

        /// Savane africaine
        zoo.ajouterAnimal(new Animal("Dumbo", "Éléphant", "Mammifere", 4500, "Herbivore"));
        zoo.ajouterAnimal(new Animal("Girafou", "Girafe", "Mammifere", 900, "Herbivore"));

        /// Terre des fauves
        zoo.ajouterAnimal(new Animal("Simba", "Lion", "Mammifere", 190, "Carnivore"));
        zoo.ajouterAnimal(new Animal("Shere Khan", "Tigre", "Mammifere", 220, "Carnivore"));

        /// Ferme aux reptiles
        zoo.ajouterAnimal(new Animal("Kaa", "Python", "Reptile", 80, "Carnivore"));
        zoo.ajouterAnimal(new Animal("Cobra", "Cobra", "Reptile", 12, "Carnivore"));

        /// Aquarium
        zoo.ajouterAnimal(new Animal("Nemo", "Poisson-clown", "Poisson", 0.3, "Omnivore"));
        zoo.ajouterAnimal(new Animal("Dory", "Chirurgien bleu", "Poisson", 0.5, "Omnivore"));

        /// Volière
        zoo.ajouterAnimal(new Animal("Rio", "Ara", "Oiseau", 1.5, "Omnivore"));
        zoo.ajouterAnimal(new Animal("Titi", "Canari", "Oiseau", 0.2, "Omnivore"));

        /// Affichage du zoo (zones + animaux)
        zoo.afficherInfos();

        /// Calcul de la nourriture totale nécessaire
        System.out.println();
        System.out.println("Nourriture nécessaire : "
                + zoo.calculerNourriture() + " kg");
    }
}
