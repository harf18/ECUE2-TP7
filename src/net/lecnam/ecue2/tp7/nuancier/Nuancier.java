package net.lecnam.ecue2.tp7.nuancier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Nuancier {

    private List<String> couleurs;
    private Map<Character, String> couleursMap;

    public Nuancier() {
        this.couleurs = new ArrayList<>();
        this.couleurs.add("noir");
        this.couleurs.add("rouge");
        this.couleurs.add("vert");
        this.couleurs.add("marron");
        this.couleurs.add("blanc");
        this.couleurs.add("rouge");
        this.couleurs.add(0, "cyan");

        // Appel immédiat après l'ajout des couleurs
        initializeMap();
    }

    private void initializeMap() {
        this.couleursMap = new HashMap<>();
        for (String couleur : getCouleursTreeSet()) {
            this.couleursMap.put(couleur.charAt(0), couleur);
        }
    }

    public String getCouleurFromCode(char initiale) {
        return this.couleursMap.get(initiale);
    }

    public List<String> getCouleurs() {
        return couleurs;
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(this.couleurs);
    }
}