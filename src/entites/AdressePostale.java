package entites;

public class AdressePostale {

    int numeroRue;
    public String libelleRue;
    public String codePostal;
    public String ville;

    public AdressePostale(int nvnumeroRue, String nvlibelleRue,
                          String nvcodePostal, String nvville) {
        numeroRue = nvnumeroRue;
        libelleRue = nvlibelleRue;
        codePostal = nvcodePostal;
        ville = nvville;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}