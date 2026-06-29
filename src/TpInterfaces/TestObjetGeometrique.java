package TpInterfaces;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique[] objets = new ObjetGeometrique[2];  /// Création d'un tableau de 2 objets géométriques


        objets[0] = new Cercle(10); /// On place un cercle
        objets[1] = new Rectangle(10, 20); /// On place un rectangle

        /// Parcours du tableau
        for (ObjetGeometrique objet : objets) {

            System.out.println("Périmètre : " + objet.perimetre());
            System.out.println("Surface : " + objet.surface());
            System.out.println("------------------------");
        }
    }
}

///  Pour mémoire :
///  Une interface définit des méthodes obligatoires, sans leur code.
///  implements signifie : "je m'engage à écrire ces méthodes".
///  Chaque classe calcule son propre périmètre et sa propre surface.
///  Un tableau d'ObjetGeometrique peut contenir des Cercle, des Rectangle,
///  ou toute autre classe qui implémente cette interface.
///  Quand on appelle objet.perimetre(), Java exécute automatiquement la bonne méthode
///  selon le type réel de l'objet (cercle ou rectangle). C'est le principe du polymorphisme.
