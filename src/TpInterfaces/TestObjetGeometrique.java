package TpInterfaces;

/**
 * Classe de test (point d'entrée) permettant de manipuler différentes structures
 * géométriques à travers une approche polymorphe basée sur l'interface ObjetGeometrique.
 *
 * @author xavier2734
 * @version 1.0
 */
public class TestObjetGeometrique {

    /**
     * Constructeur par défaut de la classe TestObjetGeometrique.
     */
    public TestObjetGeometrique() {
        // Constructeur vide explicite
    }

    /**
     * Point d'entrée principal de l'application de test.
     * Initialise un tableau polymorphe d'objets géométriques, y insère un cercle
     * et un rectangle, puis parcourt le tableau pour afficher les périmètres et surfaces.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        // Création d'un tableau capable de contenir 2 objets implémentant l'interface ObjetGeometrique
        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        // On place un cercle à l'index 0
        objets[0] = new Cercle(10);

        // On place un rectangle à l'index 1
        objets[1] = new Rectangle(10, 20);

        // --- APPROCHE ALTERNATIVE (Commentée à but pédagogique) ---
        // On peut aussi utiliser une collection dynamique à la place du tableau fixe :
        //
        // ArrayList<ObjetGeometrique> tabGeos = new ArrayList<>();
        // tabGeos.add(new Cercle(2.0));
        // tabGeos.add(new Rectangle(10.0, 8.25));
        // -----------------------------------------------------------

        // Parcours du tableau et exploitation du polymorphisme
        for (ObjetGeometrique objet : objets) {
            System.out.println("Périmètre : " + objet.perimetre());
            System.out.println("Surface : " + objet.surface());
            System.out.println("------------------------");
        }
    }
}

/*
 * ============================================================================
 * 🧠 MÉMO POUR LES RÉVISIONS (Le fonctionnement des interfaces)
 * ============================================================================
 * - Une interface définit des méthodes obligatoires, sans leur code.
 * - Le mot-clé "implements" signifie : "je m'engage à écrire ces méthodes".
 * - Chaque classe fille calcule son propre périmètre et sa propre surface.
 * - Un tableau d'ObjetGeometrique peut contenir des Cercle, des Rectangle,
 *   ou toute autre classe qui implémente cette interface.
 * - Quand on appelle objet.perimetre(), Java exécute automatiquement la bonne
 *   méthode selon le type réel de l'objet (Cercle ou Rectangle).
 *   C'est le principe fondamental du polymorphisme.
 * ============================================================================
 */
