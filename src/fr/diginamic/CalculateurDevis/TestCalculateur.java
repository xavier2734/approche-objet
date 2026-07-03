package fr.diginamic.CalculateurDevis;

import java.util.Scanner;

public class TestCalculateur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  /// Permet de lire ce que tape l'utilisateur

        Commande commande = null;  /// Cette variable contiendra la commande créée, au départ il n'y en a aucune

        int choix = 0;  /// Choix du menu principal

        while (choix != 4) {  /// Tant que l'utilisateur ne choisit pas 4
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1 - Saisir une commande");
            System.out.println("2 - Modifier une commande");
            System.out.println("3 - Afficher une commande");
            System.out.println("4 - Quitter");

            choix = scanner.nextInt();

            /// OPTION 1 : CREER UNE COMMANDE

            if (choix == 1) {
                System.out.print("Numéro de commande : ");
                int numero = scanner.nextInt();

                commande = new Commande(numero);  /// Création de la commande

                menuCommande(scanner, commande);  /// On envoie l'utilisateur dans le sous-menu
            }
            /// OPTION 2 : MODIFIER

            else if (choix == 2) {
                if (commande == null) {
                    System.out.println("Aucune commande n'existe.");
                } else {
                    System.out.print("Numéro de commande : ");
                    int numero = scanner.nextInt();
                    if (numero == commande.getNumero()) {  /// Vérifie que le numéro est correct
                        menuCommande(scanner, commande);
                    } else {
                        System.out.println("Commande introuvable.");
                    }
                }
            }
            /// OPTION 3 : AFFICHER

            else if (choix == 3) {
                if (commande == null) {
                    System.out.println("Aucune commande.");
                } else {
                    commande.afficher();
                }
            }
            /// OPTION 4 : QUITTER

            else if (choix == 4) {
                System.out.println("Au revoir.");
            } else {
                System.out.println("Choix invalide.");
            }
        }scanner.close();

    }
    public static void menuCommande(Scanner scanner, Commande commande) {  ///Sous-menu permettant de gérer une commande

        int choix = 0;

        while (choix != 4) {
            System.out.println();
            System.out.println("------ COMMANDE ------");
            System.out.println("1 - Ajouter une ligne");
            System.out.println("2 - Afficher les lignes");
            System.out.println("3 - Supprimer une ligne");
            System.out.println("4 - Retour");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            /// AJOUT D'UNE LIGNE

            if (choix == 1) {
                scanner.nextLine();  /// Vide le retour à la ligne laissé par nextInt()
                System.out.print("Nom : ");
                String nom = scanner.nextLine();
                System.out.print("Quantité : ");
                int quantite = scanner.nextInt();
                System.out.print("Prix unitaire HT : ");
                double prix = scanner.nextDouble();

                LigneCommande ligne = new LigneCommande(nom, quantite, prix);  /// Création de la ligne

                commande.ajouterLigne(ligne);  /// Ajout dans la commande
                System.out.println("Ligne ajoutée.");
            }
            /// AFFICHAGE

            else if (choix == 2) {
                commande.afficher();
            }
            /// SUPPRESSION

            else if (choix == 3) {
                commande.afficher();
                System.out.print("Indice de la ligne à supprimer : ");
                int indice = scanner.nextInt();
                commande.supprimerLigne(indice);
                System.out.println("Ligne supprimée.");
            }
            /// RETOUR
            // -----------------------------
            else if (choix == 4) {
                System.out.println("Retour au menu principal.");
            } else {
                System.out.println("Choix invalide.");
            }
        }
    }
}

/// ÉTAPE 1
/// On affiche le menu principal.
///
/// Pourquoi une boucle ?
/// Parce que le menu doit réapparaître
/// tant que l'utilisateur ne quitte pas.
/// Pourquoi appelle-t-on menuCommande() ?
/// Pour éviter d'avoir un main()
/// de 300 lignes.

/// Le main() gère le menu principal.
/// menuCommande() gère uniquement, les lignes de la commande.
