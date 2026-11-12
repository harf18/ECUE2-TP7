package net.lecnam.ecue2.tp7.film;

import java.time.Year;

public class Film implements Comparable<Film>{

    private String titre;
    private String realisateur;
    private Year anneeSortie;

    /*CONSTRUCTEUR*/
    public Film(String titre, String realisateur, int annee) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneeSortie = Year.of(annee);
    }

    /*GETTERS*/
    public String getTitre() {
        return this.titre;
    }

    public String getRealisateur() {
        return this.realisateur;
    }

    public Year getAnneeSortie() {
        return this.anneeSortie;
    }

    @Override
    public String toString() {
        return titre + ", " + realisateur + ", " + anneeSortie;
    }

    public int compareTo(Film f) {
        // 1. Comparaison par année
        int resultat = this.anneeSortie.compareTo(f.anneeSortie);
        // 2. Si les années sont égales, on compare par titre
        if (resultat == 0) {
            return this.titre.compareTo(f.titre);
        }
        return resultat;
    }
}
