package fr.diginamic.maison;

public class Maison {


    private Piece[] pieces; // Tableau qui contient toutes les pièces de la maison

    public Maison() {  // Au départ, la maison ne contient aucune pièce
        pieces = new Piece[0];
    }
    public void ajouterPiece(Piece piece) {  // Permet d'ajouter une pièce dans la maison
        if (piece == null) {  // Vérifie que la pièce existe
            System.out.println("Erreur : la pièce est null.");
            return;
        }
        if (piece.getSuperficie() < 0 || piece.getEtage() < 0) {  // Vérifie que les informations sont cohérentes
            System.out.println("Erreur : superficie ou étage invalide.");
            return;
        }

        Piece[] nouveauTableau = new Piece[pieces.length + 1]; // Création d'un nouveau tableau plus grand d'une case


        /// Mon nouveau tableau est vide. Je dois recopier toutes les anciennes pièces dedans.
        for (int i = 0; i < pieces.length; i++) { // Copie des anciennes pièces dans le nouveau tableau

            /// Je copie la pièce qui est à la position i dans le nouveau tableau, à la même position.
            /// Je prends la pièce située à la position i dans l'ancien tableau et je la mets à la même position
            /// dans le nouveau tableau.
            /// La variable i vaut 0, donc elle désigne la case 0 du tableau.
            nouveauTableau[i] = pieces[i];
        }

        nouveauTableau[pieces.length] = piece;  // Ajout de la nouvelle pièce à la dernière case

        pieces = nouveauTableau;   // Le nouveau tableau remplace l'ancien
    }

    public double superficieTotale() {  // Calcule la superficie totale de la maison
        double total = 0;
        for (Piece piece : pieces) {  // On parcourt toutes les pièces
            total += piece.getSuperficie(); // On additionne chaque superficie
        }

        return total;
    }

    public double superficieEtage(int etage) {  // Calcule la superficie d'un étage
        double total = 0;
        for (Piece piece : pieces) {  // On parcourt toutes les pièces
            if (piece.getEtage() == etage) {  // On garde uniquement les pièces du bon étage
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public double superficieChambres() {  // Calcule la superficie totale des chambres
        double total = 0;

        for (Piece piece : pieces) {  // On parcourt toutes les pièces
            if (piece instanceof Chambre) {  // On vérifie si c'est une chambre
                total += piece.getSuperficie();
            }
        }
        return total;
    }


    public double superficieCuisines() {  // Calcule la superficie totale des cuisines
        double total = 0;

        for (Piece piece : pieces) {
            if (piece instanceof Cuisine) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public double superficieSalons() { // Calcule la superficie totale des salons
        double total = 0;

        for (Piece piece : pieces) {
            if (piece instanceof Salon) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public double superficieSallesDeBain() {  // Calcule la superficie totale des salles de bain
        double total = 0;

        for (Piece piece : pieces) {
            if (piece instanceof SalleDeBain) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public double superficieWC() { // Calcule la superficie totale des WC

        /// Je dois calculer la superficie totale des WC.

        /// Au début, je n'ai encore additionné aucune superficie.Le total commence donc à 0.
        double total = 0;

        /// Je vais regarder toutes les pièces de la maison,une par une.
        for (Piece piece : pieces) {

            /// Est-ce que la pièce que je regarde est un WC ?
            if (piece instanceof WC) {

                /// Oui.J'ajoute sa superficie au total.
                total += piece.getSuperficie();
            }
        }

        /// J'ai regardé toutes les pièces. Le total contient maintenant la superficie de tous les WC.
        return total;
    }

    public int nombreChambres() {  // Compte le nombre de chambres
        int compteur = 0;

        for (Piece piece : pieces) {
            if (piece instanceof Chambre) {
                compteur++;
            }
        }
        return compteur;
    }

    public int nombreCuisines() {  // Compte le nombre de cuisines
        int compteur = 0;

        for (Piece piece : pieces) {
            if (piece instanceof Cuisine) {
                compteur++;
            }
        }
        return compteur;
    }

    public int nombreSalons() {  // Compte le nombre de salons,  C'est une boucle foreach

        ///  Au début, je n'ai encore trouvé aucun salon.J'ai donc besoin d'un compteur qui commence à 0.
        /// ou Je dois compter les salons.Je regarde donc toutes les pièces.
        int compteur = 0;

        for (Piece piece : pieces) {

            /// Pour la pièce que je suis en train de regarder,je me demande : est-ce un Salon ?
            /// ou Est-ce que la pièce actuelle est un salon ?
            if (piece instanceof Salon) {

                /// Oui ! J'en ai trouvé un de plus, donc j'ajoute 1.
                /// ou Oui, alors je le compte.
                compteur++;
            }
        }

        ///  J'ai terminé de regarder toutes les pièces. Je renvoie le nombre de salons trouvés.
        /// ou Maintenant je connais la réponse.
        return compteur;
    }

    public int nombreSallesDeBain() {   // Compte le nombre de salles de bain
        int compteur = 0;

        for (Piece piece : pieces) {
            if (piece instanceof SalleDeBain) {
                compteur++;
            }
        }
        return compteur;
    }

    public int nombreWC() {  // Compte le nombre de WC
        int compteur = 0;

        for (Piece piece : pieces) {
            if (piece instanceof WC) {
                compteur++;
            }
        }
        return compteur;
    }


///Prpopsition pour eviter de créer une méthode pour chaque type ( ici les 5 classes)///
/// (<? extends Piece>) veut dire : N'importe quelle classe à condition qu'elle hérite de la class Piece ///
    /*public double superficieType(Class<? extends Piece> type) {

        double total = 0;
        for (Piece piece : pieces) {   // Parcours de toutes les pièces
            if (type.isInstance(piece)) {  // Vérifie si la pièce est du type demandé
                total += piece.getSuperficie();
            }
        }
        return total;
    }*/
    /*public int nombrePiecesType(Class<? extends Piece> type) {
        int compteur = 0;
        for (Piece piece : pieces) {  // Lecture de toutes les pièces
           if (type.isInstance(piece)) {  // Si le type correspond, on incrémente
                compteur++;
            }
        }
       return compteur;
    }*/
}
