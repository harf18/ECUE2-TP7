package net.lecnam.ecue2.tp7.nuancier;

import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.TreeSet;


public class Nuancier {

    private final List<String> couleurs;

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
    }

    /*GETTER des couleurs*/
    public List<String> getCouleurs() {
        return this.couleurs;
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(couleurs);
    }

}
