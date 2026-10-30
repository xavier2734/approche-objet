package TpInterfaces;

/**
 * Représente un rectangle géométrique. Cette classe implémente le contrat
 * de l'interface ObjetGeometrique.
 *
 * @author xavier2734
 * @version 1.0
 */
public class Rectangle implements ObjetGeometrique {

    /** La longueur du rectangle. */
    private double longueur;

    /** La largeur du rectangle. */
    private double largeur;

    /**
     * Constructeur permettant d'initialiser un rectangle avec sa longueur et sa largeur.
     *
     * @param longueur La longueur du rectangle.
     * @param largeur  La largeur du rectangle.
     */
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * Calcule le périmètre du rectangle (2 * (longueur + largeur)).
     *
     * @return Le périmètre calculé sous forme de double.
     */
    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    /**
     * Calcule la surface du rectangle (longueur * largeur).
     *
     * @return La surface calculée sous forme de double.
     */
    @Override
    public double surface() {
        return longueur * largeur;
    }

    /**
     * Retourne une représentation textuelle personnalisée du rectangle.
     *
     * @return Une chaîne décrivant les dimensions (longueur et largeur) du rectangle.
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
