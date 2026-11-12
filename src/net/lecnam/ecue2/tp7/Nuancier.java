package net.lecnam.ecue2.tp7.nuancier;

import java.util.ArrayList;
import java.util.List;

public class Nuancier {

    private List<String> couleurs;

    public Nuancier() {
        couleurs = new ArrayList<>();

        couleurs.add("noir");
        couleurs.add("rouge");
        couleurs.add("vert");
        couleurs.add("marron");
        couleurs.add("blanc");
        // Une List accepte les doublons : on peut ajouter "rouge" une 2ème fois
        couleurs.add("rouge");

        // Insertion en première position, sans toucher au code précédent
        couleurs.add(0, "cyan");
    }

    public List<String> getCouleurs() {
        return couleurs;
    }
}