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

        initializeMap();
    }

    private void initializeMap() {
        couleursMap = new HashMap<>();
        for (String couleur : getCouleursTreeSet()) {
            couleursMap.put(couleur.charAt(0), couleur);
        }
    }

    public String getCouleurFromCode(char initiale) {
        return couleursMap.get(initiale);
    }

    public List<String> getCouleurs() {
        return couleurs;
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(couleurs);
    }
}