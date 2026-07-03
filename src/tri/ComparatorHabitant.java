package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Casa> {

    @Override
    public int compare(Casa v1, Casa v2) {

        /// Comparaison sur le nombre d'habitants
        return Integer.compare(v1.getHabitants(), v2.getHabitants());
    }
}
