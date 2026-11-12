package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.ArrayList;

public class Nuancier {

    // Déclaration de la liste
    private List<String> couleurs;

    // Constructeur sans paramètre
    public Nuancier() {
        this.couleurs = new ArrayList<>();

        this.couleurs.add("noir");
        this.couleurs.add("rouge");
        this.couleurs.add("vert");
        this.couleurs.add("marron");
        this.couleurs.add("blanc");

        this.couleurs.add("rouge");

        // Ajout de cyan à la première position
        this.couleurs.add(0, "cyan");
    }

    // Getter
    public List<String> getCouleurs() {
        return couleurs;
    }
}
