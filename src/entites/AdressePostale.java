package entites;

public class AdressePostale {

    int numeroRue;
    String libelleRue;
    String codePostal;
    String ville;

    public AdressePostale(int nvnumeroRue, String nvlibelleRue,
                          String nvcodePostal, String nvville) {
        numeroRue = nvnumeroRue;
        libelleRue = nvlibelleRue;
        codePostal = nvcodePostal;
        ville = nvville;
    }
}