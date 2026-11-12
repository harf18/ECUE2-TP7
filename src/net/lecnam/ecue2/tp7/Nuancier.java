package net.lecnam.ecue2.tp7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Nuancier {
    private List<String> couleurs;

    public Nuancier() {
        this.couleurs = new ArrayList<>();
        this.couleurs.add("noir");
        this.couleurs.add("rouge");
        this.couleurs.add("vert");
        this.couleurs.add("marron");
        this.couleurs.add("blanc");
        this.couleurs.add("rouge");
        this.couleurs.add(0, "cyan");
    }

    public List<String> getCouleurs() {
        return couleurs;
    }

    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(this.couleurs);
    }
}

