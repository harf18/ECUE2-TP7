package net.lecnam.ecue2.tp7.film;

import java.time.Year;

public class Film implements Comparable<Film> {
    private String titre, realisateur;
    private Year anneeSortie;

    public Film(String titre, String realisateur, int annee) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneeSortie = Year.of(annee);
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Year getAnneeSortie() {
        return anneeSortie;
    }

    public String toString() {
        return titre + ", " + realisateur + ", " + anneeSortie;
    }

    public int compareTo(Film f) {
        int comparaisonAnnee = this.anneeSortie.compareTo(f.getAnneeSortie());
        if (comparaisonAnnee == 0) {
            return this.titre.compareTo(f.getTitre());
        }
        return comparaisonAnnee;
    }
}
