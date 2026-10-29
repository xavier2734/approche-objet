package entites;

/**
 * Représente une adresse postale avec son numéro, sa rue, son code postal et sa ville.
 * Cette classe est une entité de base utilisée pour stocker des coordonnées géographiques.
 *
 * @author xavier2734
 * @version 1.0
 */
public class AdressePostale {

    int numeroRue;
    public String libelleRue;
    public String codePostal;
    public String ville;

    /**
     * Constructeur permettant d'initialiser une nouvelle adresse postale complète.
     *
     * @param nvnumeroRue Le numéro de la rue.
     * @param nvlibelleRue Le nom ou libellé de la rue.
     * @param nvcodePostal Le code postal de la localité.
     * @param nvville      Le nom de la ville.
     */
    public AdressePostale(int nvnumeroRue, String nvlibelleRue,
                          String nvcodePostal, String nvville) {
        numeroRue = nvnumeroRue;
        libelleRue = nvlibelleRue;
        codePostal = nvcodePostal;
        ville = nvville;
    }

    /**
     * Retourne une représentation textuelle de l'adresse postale sous forme de chaîne de caractères.
     *
     * @return Une chaîne décrivant l'ensemble des attributs de l'adresse.
     */
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
