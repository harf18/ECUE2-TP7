package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
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


        this.couleurs.add(0, "cyan");

        initializeMap();
    }

    // Getter
    public List<String> getCouleurs() {
        return couleurs;
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(couleurs);
    }

    private Map<Character, String> couleursMap;

    private void initializeMap() {

        couleursMap = new HashMap<>();

        for (String couleur : getCouleursTreeSet()) {
            couleursMap.put(couleur.charAt(0), couleur);
        }
    }

    public String getCouleurFromCode(char initiale) {
        return couleursMap.get(initiale);
    }
}
