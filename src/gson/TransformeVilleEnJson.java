package gson;

import com.google.gson.Gson;
import fichier.Ville;
import tri.Casa;

public class TransformeVilleEnJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Objet simple
        Casa p = new Casa("Marseille", 834000);
        // Conversion en JSON
        String json = gson.toJson(p);
        System.out.println(json);
    }
}
