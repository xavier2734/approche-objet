package TpEquals;

/**
 * Classe de test pour valider la redéfinition de la méthode {@code equals} 
 * sur l'objet {@link Pays}.
 * <p>
 * Ce programme permet de comparer le comportement de l'opérateur d'identité {@code ==} 
 * avec celui de la méthode d'égalité sémantique {@code equals()}.
 * </p>
 * 
 * @author xavier2734
 */
public class TestEqualsPays {

    /**
     * Constructeur par défaut de la classe de test.
     */
    public TestEqualsPays() {
        // Constructeur vide
    }

    /**
     * Point d'entrée principal du programme de test.
     * Crée des instances de Pays et affiche les résultats des comparaisons.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // Instanciation de trois pays pour les tests
        Pays p1 = new Pays("France", 68000000);
        Pays p2 = new Pays("France", 68000000); // Identique à p1 en attributs, mais distinct en mémoire
        Pays p3 = new Pays("Espagne", 48000000); // Différent de p1 et p2

        // ----------------==========================================================
        // TESTS AVEC LA MÉTHODE EQUALS() (Compare le contenu métier)
        // ==========================================================================
        
        // p1 et p2 ont les mêmes attributs, equals() doit retourner true
        boolean testEqualsMeme = p1.equals(p2);
        System.out.println("equals (mêmes attributs) : " + testEqualsMeme);

        // p1 et p3 ont des attributs différents, equals() doit retourner false
        boolean testEqualsDiff = p1.equals(p3);
        System.out.println("equals (attributs différents) : " + testEqualsDiff);

        // ==========================================================================
        // TESTS AVEC L'OPÉRATEUR == (Compare uniquement l'adresse mémoire)
        // ==========================================================================
        
        // Même si le contenu est identique, p1 et p2 sont deux objets distincts en mémoire (false)
        System.out.println("== (mêmes attributs) : " + (p1 == p2));

        // p1 et p3 sont des objets distincts à des adresses mémoires différentes (false)
        System.out.println("== (attributs différents) : " + (p1 == p3));
    }
}
