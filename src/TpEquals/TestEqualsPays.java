package TpEquals;

public class TestEqualsPays {

    public static void main(String[] args) {

        /// // Je crée un 3 objets Pays
        Pays p1 = new Pays("France", 68000000);
        Pays p2 = new Pays("France", 68000000);
        Pays p3 = new Pays("Espagne", 48000000);

        /// equals() compare le CONTENU des objets. Ici les informations sont identiques : true
        System.out.println("equals (mêmes attributs) : " + p1.equals(p2));

        /// Ici les informations sont différentes : false
        System.out.println("equals (attributs différents) : " + p1.equals(p3));

        /// == compare si c'est exactement le MÊME objet, p1 et p2 sont deux objets différents : false
        System.out.println("== (mêmes attributs) : " + (p1 == p2));

        /// p1 et p3 sont également deux objets différents : false
        System.out.println("== (attributs différents) : " + (p1 == p3));
    }
}

