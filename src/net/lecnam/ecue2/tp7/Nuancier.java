package net.lecnam.ecue2.tp7;

import java.util.*;

public class Nuancier {
    private List<String> couleurs;
    private Map<Character, String> couleursMap;

    public List<String> getCouleurs() {
        return couleurs;
    }

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

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(this.couleurs);
    }

    private void initializeMap(){
        this.couleursMap = new HashMap<>();
        for (String couleur : this.getCouleursTreeSet()) {
            this.couleursMap.put(couleur.charAt(0), couleur);
        }
    }

    public String getCouleurFromCode(char initiale){
        return this.couleursMap.get(initiale);
    }
}
