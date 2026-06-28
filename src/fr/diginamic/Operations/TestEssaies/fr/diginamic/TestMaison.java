package fr.diginamic.Operations.TestEssaies.fr.diginamic;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison = new Maison();  // Création de la maison

        // Création des pièces
        maison.ajouterPiece(new Chambre(15, 1));
        maison.ajouterPiece(new Chambre(12, 1));
        maison.ajouterPiece(new Cuisine(10, 0));
        maison.ajouterPiece(new Salon(30, 0));
        maison.ajouterPiece(new SalleDeBain(8, 1));
        maison.ajouterPiece(new WC(3, 0));

        System.out.println("Surface totale : " + maison.superficieTotale());
        System.out.println("Surface RDC : " + maison.superficieEtage(0));
        System.out.println("Surface étage 1 : " + maison.superficieEtage(1));
        System.out.println("Surface des chambres : " + maison.superficieChambres());
        System.out.println("Nombre de chambres : " + maison.nombreChambres());

        // Ajoute des contrôles
        maison.ajouterPiece(null);  // Test null
        maison.ajouterPiece(new Chambre(-10, 1));  // Test superficie négative
        maison.ajouterPiece(new Cuisine(10, -2));  // Test étage négatif

    }
}
///  Méthode qui fonctionne pour toutes les pièces, lié a (<? extends Piece>) dans la class Maison ///
///  System.out.println("Surface des chambres : " + maison.superficieType(Chambre.class)); ///
///  System.out.println("Nombre de chambres : " + maison.nombrePiecesType(Chambre.class)); ///
/// exemple, ça remplace 5 metodes : ///
/* maison.nombrePiecesType(Chambre.class);

maison.nombrePiecesType(Cuisine.class);

maison.nombrePiecesType(Salon.class);

maison.nombrePiecesType(WC.class);

maison.nombrePiecesType(SalleDeBain.class);*/

