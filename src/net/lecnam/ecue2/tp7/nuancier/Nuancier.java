package net.lecnam.ecue2.tp7.nuancier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Nuancier {
    private List<String> couleurs;
    private Map<Character,String> couleursMap;

    public Nuancier() {
        couleurs = new ArrayList<>();
        couleurs.add("noir");
        couleurs = new ArrayList<>();
        couleurs.add("noir");
        couleurs.add("rouge");
        couleurs.add("vert");
        couleurs.add("marron");
        couleurs.add("blanc");
        couleurs.add("rouge");
        couleurs.addFirst("cyan");
    }
    public List<String> getCouleurs(){
        return couleurs;
    }
}
