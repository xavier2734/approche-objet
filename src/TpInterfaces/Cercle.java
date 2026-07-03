package TpInterfaces;

import java.util.Objects;

public class Cercle implements ObjetGeometrique  {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cercle cercle)) return false;
        return Double.compare(rayon, cercle.rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rayon);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
