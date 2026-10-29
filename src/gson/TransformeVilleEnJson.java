package gson;

import com.google.gson.Gson;
import fichier.Ville;
import tri.Casa;

/**
 * Classe principale démontrant la sérialisation d'un objet Java en format JSON
 * à l'aide de la bibliothèque Google Gson.
 * 
 * @author xavier2734
 * @version 1.0
 */
public class TransformeVilleEnJson {
    
    /**
     * Point d'entrée de l'application. Initialise l'instance Gson, 
     * crée un objet de test et affiche sa représentation JSON dans la console.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Objet simple
        Casa p = new Casa("Marseille", 834000);
        // Conversion en JSON
        String json = gson.toJson(p);
        System.out.println(json);
    }
}
