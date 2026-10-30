package TpInterfaces;

/**
 * Liste les méthodes obligatoires que doit posséder un objet géométrique.
 * Tout objet implémentant cette interface s'engage à fournir un calcul
 * pour son périmètre et sa surface.
 *
 * @author DIGINAMIC
 * @author xavier2734
 * @version 1.0
 */
public interface ObjetGeometrique {

    /**
     * Retourne le périmètre d’une forme géométrique.
     *
     * @return Le périmètre sous forme de double.
     */
    double perimetre();

    /**
     * Retourne la surface d’une forme géométrique.
     *
     * @return La surface sous forme de double.
     */
    double surface();
}
