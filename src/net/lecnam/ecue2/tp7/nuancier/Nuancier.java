package net.lecnam.ecue2.tp7.nuancier;

import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.TreeSet;

import java.util.HashMap;
import java.util.Map;


public class Nuancier {

    private final List<String> couleurs;
    private Map<Character, String> couleursMap;

    /*CONSTRUCTEUR*/
    public Nuancier() {
        couleurs = new ArrayList<>();
        couleurs.add("noir");
        couleurs.add("rouge");
        couleurs.add("vert");
        couleurs.add("marron");
        couleurs.add("blanc");
        couleurs.add("rouge");
        couleurs.addFirst("cyan");

        initializeMap();
    }

    /*GETTER des couleurs*/
    public List<String> getCouleurs() {
        return this.couleurs;
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(couleurs);
    }

    private void initializeMap() {
        couleursMap = new HashMap<>();
        for (String couleur : getCouleursTreeSet()) {
            if (!couleur.isEmpty()) {
                couleursMap.put(couleur.charAt(0), couleur);
            }
        }
    }

    public String getCouleurFromCode(char initiale) {
        return couleursMap.get(initiale);
    }

}
