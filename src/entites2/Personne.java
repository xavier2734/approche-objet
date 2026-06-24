package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nvnom, String nvprenom) {
        nom = nvnom;
        prenom = nvprenom;

    }
    public Personne(String nvnom, String nvprenom,
                    AdressePostale nvadresse) {
        nom = nvnom;
        prenom = nvprenom;
        adresse = nvadresse;
    }
    public void afficherIdentite() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public void modifierNom(String nouveauNom) {
        nom = nouveauNom;
    }

    public void modifierPrenom(String nouveauPrenom) {
        prenom = nouveauPrenom;
    }

    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        adresse = nouvelleAdresse;
    }

    public String getNom() {  // retourne le nom
        return nom;
    }

    public String getPrenom() {  // retourne le prenom
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

}
