package TpInterfaces;

import java.util.Objects;

/**
 * Représente un cercle géométrique. Cette classe implémente le contrat
 * de l'interface ObjetGeometrique.
 *
 * @author xavier2734
 * @version 1.0
 */
public class Cercle implements ObjetGeometrique {

    /** Le rayon du cercle. */
    private double rayon;

    /**
     * Constructeur permettant d'initialiser un cercle avec son rayon.
     *
     * @param rayon Le rayon du cercle.
     */
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Calcule le périmètre du cercle (2 * PI * rayon).
     *
     * @return Le périmètre calculé sous forme de double.
     */
    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    /**
     * Calcule la surface du cercle (PI * rayon^2).
     *
     * @return La surface calculée sous forme de double.
     */
    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    /**
     * Retourne le rayon du cercle.
     *
     * @return Le rayon.
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * Compare ce cercle avec un autre objet pour vérifier leur égalité
     * en se basant sur la valeur du rayon.
     *
     * @param o L'objet à comparer.
     * @return true si l'objet est un Cercle possédant le même rayon, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cercle cercle)) return false;
        return Double.compare(rayon, cercle.rayon) == 0;
    }

    /**
     * Génère le code de hachage de l'objet Cercle basé sur son rayon.
     *
     * @return Le code de hachage calculé.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(rayon);
    }

    /**
     * Retourne une représentation textuelle personnalisée du cercle.
     *
     * @return Une chaîne décrivant le rayon du cercle.
     */
    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
