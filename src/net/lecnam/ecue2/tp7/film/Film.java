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

    public Year getAnnee() {
        return this.anneeSortie;
    }

    @Override
    public String toString() {
        return titre + ", " + realisateur + ", " + anneeSortie;
    }

    @Override
    public int compareTo(Film f) {
        return this.anneeSortie.compareTo(f.anneeSortie);
    }
}
