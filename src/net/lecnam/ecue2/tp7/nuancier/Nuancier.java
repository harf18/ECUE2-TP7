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

        this.initializeMap();
    }

    public List<String> getCouleurs() {
        return couleurs;
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(this.couleurs);
    }

    private void initializeMap() {
        this.couleursMap = new HashMap<>();
        Set<String> setCouleurs = this.getCouleursTreeSet();
        for (String couleur : setCouleurs) {
            char initiale = couleur.charAt(0);
            this.couleursMap.put(initiale, couleur);
        }
    }

    public String getCouleurFromCode(char initiale) {
        return this.couleursMap.get(initiale);
    }
}
