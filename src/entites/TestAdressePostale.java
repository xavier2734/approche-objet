package entites;

/**
 * Classe de test pour instancier et vérifier la création
 * d'objets de type AdressePostale.
 *
 * @author xavier2734
 * @version 1.0
 */
public class TestAdressePostale {

    /**
     * Point d'entrée principal du programme permettant de créer
     * deux adresses de test distinctes.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        AdressePostale adr1 =
                new AdressePostale(12, "la bonne tranche",
                        "75019", "Paris");

        AdressePostale adr2 =
                new AdressePostale(34, "la bonne tronche",
                        "34000", "Montpellier");
    }
}
