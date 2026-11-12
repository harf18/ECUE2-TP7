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

        this.couleurs.add(0,"cyan");
        initializeMap();
    }

    public Set<String> getCouleursTreeSet(){
        return new TreeSet<>(couleurs);
    }

    private void initializeMap() {
        this.couleursMap = new HashMap<>();
        Set<String> treeSet = getCouleursTreeSet();
        for (String couleur : treeSet) {
            if (!couleur.isEmpty()) {
                couleursMap.put(couleur.charAt(0), couleur);
            }
        }
    }

    public String getCouleurFromCode(char initiale) {
        return couleursMap.get(initiale);
    }
}
