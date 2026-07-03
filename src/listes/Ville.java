package listes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class Ville {

    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    /// tout est généré
    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) return false;
        return populationTotale == ville.populationTotale && Objects.equals(nom, ville.nom) && Objects.equals(codeDepartement, ville.codeDepartement) && Objects.equals(nomRegion, ville.nomRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, codeDepartement, nomRegion, populationTotale);
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}

