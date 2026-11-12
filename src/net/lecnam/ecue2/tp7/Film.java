package net.lecnam.ecue2.tp7.film;

import java.time.Year;

public class Film implements Comparable<Film> {

    private String titre;
    private String realisateur;
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

    @Override
    public String toString() {
        return titre + ", " + realisateur + ", " + anneeSortie;
    }

    @Override
    public int compareTo(Film f) {
        // D'abord sur l'année, puis sur le titre en cas d'égalité
        int resultat = this.anneeSortie.compareTo(f.anneeSortie);
        if (resultat != 0) {
            return resultat;
        }
        return this.titre.compareTo(f.titre);
    }
}