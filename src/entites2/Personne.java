package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nvnom, String nvprenom,
                    AdressePostale nvadresse) {

        nom = nvnom;
        prenom = nvprenom;
        adresse = nvadresse;

    }
}
