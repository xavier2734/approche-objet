package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {


        String nombre = "70";

        int nombre1;
        nombre1= Integer.parseInt(nombre);

        System.out.println("Nombre converti : " + nombre);


        int a = 25;
        int b = 42;


        int max = Integer.max(a, b);


        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
    }
}
