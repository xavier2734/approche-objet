package entites;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 12;
        adr1.libelleRue = "la bonne tranche ";
        adr1.codePostal = " 75019 ";
        adr1.ville = " Paris ";
        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 34;
        adr2.libelleRue = "la bonne tronche ";
        adr2.codePostal = " 34000 ";
        adr2.ville = " Montpellier ";


    }
}
