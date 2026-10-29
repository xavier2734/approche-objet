package entites2;

import entites.AdressePostale;

/**
 * Représente une personne physique caractérisée par son nom, son prénom
 * et son adresse postale.
 *
 * @author xavier2734
 * @version 1.0
 */
public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    /**
     * Constructeur permettant d'initialiser une personne uniquement avec
     * son nom et son prénom. L'adresse reste non définie (null).
     *
     * @param nvnom    Le nom de la personne.
     * @param nvprenom Le prénom de la personne.
     */
    public Personne(String nvnom, String nvprenom) {
        nom = nvnom;
        prenom = nvprenom;
    }

    /**
     * Constructeur complet permettant d'initialiser une personne avec
     * son nom, son prénom et son adresse postale associée.
     *
     * @param nvnom     Le nom de la personne.
     * @param nvprenom  Le prénom de la personne.
     * @param nvadresse L'adresse postale de la personne.
     */
    public Personne(String nvnom, String nvprenom,
                    AdressePostale nvadresse) {
        nom = nvnom;
        prenom = nvprenom;
        adresse = nvadresse;
    }

    /**
     * Affiche l'identité de la personne dans la console en mettant
     * son nom de famille en majuscules suivi de son prénom.
     */
    public void afficherIdentite() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    /**
     * Modifie le nom de la personne.
     *
     * @param nouveauNom Le nouveau nom de famille.
     */
    public void modifierNom(String nouveauNom) {
        nom = nouveauNom;
    }

    /**
     * Modifie le prénom de la personne.
     *
     * @param nouveauPrenom Le nouveau prénom.
     */
    public void modifierPrenom(String nouveauPrenom) {
        prenom = nouveauPrenom;
    }

    /**
     * Assigne ou remplace l'adresse postale actuelle de la personne.
     *
     * @param nouvelleAdresse La nouvelle adresse postale à associer.
     */
    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        adresse = nouvelleAdresse;
    }

    /**
     * Récupère le nom de famille de la personne.
     *
     * @return Le nom de la personne.
     */
    public String getNom() {  // retourne le nom
        return nom;
    }

    /**
     * Récupère le prénom de la personne.
     *
     * @return Le prénom de la personne.
     */
    public String getPrenom() {  // retourne le prenom
        return prenom;
    }

    /**
     * Récupère l'adresse postale associée à la personne.
     *
     * @return L'objet AdressePostale de la personne.
     */
    public AdressePostale getAdresse() {
        return adresse;
    }
}
