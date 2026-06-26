package fr.diginamic.chaines;


import fr.diginamic.Operations.entites1.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {



    String chaine = "Durand;Marcel;2 523.5";

    System.out.println("Chaîne : " + chaine);

        System.out.println("-----------------------------");

    char premierCaractere = chaine.charAt(0);  // Utilisation de la méthode charAt(int index)

        System.out.println("Premier caractère : " + premierCaractere); //

        System.out.println("-----------------------------");


        System.out.println("Longueur : " + chaine.length());  // Utilisation de la méthode length() pour afficher
                                                              // la longueur de la chaine de caractères

        System.out.println("-----------------------------");

    int indexPointVirgule = chaine.indexOf(';');  // Utilisation de la méthode indexOf(char c) pour
                                                  // afficher l’index du premier « ; » contenu
                                                  // dans la chaine de caractères.

        System.out.println("Premier ';' trouvé à l'index : "
                + indexPointVirgule);

        System.out.println("-----------------------------");


    String nom = chaine.substring(0, indexPointVirgule);  // Utilisation de La méthode substring(int start, int end) permet
                                                          // d’extraire une portion de chaine de caractères comprise entre
                                                          // un index de début (inclus) et un index de fin (exclu).
    System.out.println("Nom : " + nom);

        System.out.println("-----------------------------");


        System.out.println("Nom en MAJUSCULES : "  // Utilisation de la méthode toUpperCase() pour afficher le nom de famille en majuscules
                + nom.toUpperCase());

        System.out.println("-----------------------------");


        System.out.println("Nom en minuscules : "  // Utilisation de la méthode toLowerCase() pour afficher le nom de famille en minuscules
                + nom.toLowerCase());

        System.out.println("-----------------------------");


    String[] morceaux = chaine.split(";");  // Utilisation de la méthode split pour découper la chaine de caractères
                                                  // en morceaux. La méthode Le séparateur est le caractère « ; ». Cette méthode
                                                  // retourne un tableau. Affichez le tableau ainsi obtenu

        System.out.println("Contenu du tableau :");  // Utilisation de la méthode split pour découper la chaine de caractères en
                                                     // morceaux. La méthode Le séparateur est le caractère « ; ». Cette
                                                     // méthode retourne un tableau. Affichez le tableau ainsi obtenu
        for (String morceau : morceaux) {
            System.out.println(morceau);

    }



        String sansEspace = morceaux[2].replace(" ", "");
        double salaire = Double.parseDouble(sansEspace);
        System.out.println(salaire);
        Salarie nvSalairie = new Salarie(morceaux[0], morceaux[1], salaire);
}
}


