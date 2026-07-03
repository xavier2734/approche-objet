package fr.diginamic.testenumeration;

public class TestEnumeration {


    static void main() {
        for (Saison saison : Saison.values()) {  ///  Utilisez une boucle pour affichez toutes les saisons
            System.out.println(saison.getNom());
        }
       // System.out.println();
        String nom = "ETE";/// Utilisez une méthode de base des énumérations pour retrouver et afficher le
                           ///  libellé de l’instance de Saison dont le nom est ETE.
        Saison saison = Saison.valueOf(nom);
        System.out.println("Climat : " + saison.getNom());

        int numero = 3 ;  ///  Développez une méthode dans votre énumération qui retourne une instance
                          ///  de Saison en fonction du numéro d’ordre. Utilisez cette méthode afin de vérifier
                          ///  que c’est bien AUTOMNE qui est retournée lorsque vous la tester avec la variable numero
        Saison Chiffre = Saison.getSaisonParNumero(numero);
        System.out.println(Chiffre);

    }
}







