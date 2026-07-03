package tri;

import java.util.Comparator;

/// Tri des villes par ordre alphabétique
public class ComparatorNom implements Comparator<Casa> {

    @Override
    public int compare(Casa v1, Casa v2) {
        return v1.getNom().compareTo(v2.getNom());
    }
}
