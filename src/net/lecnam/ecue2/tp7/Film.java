
package net.lecnam.ecue2.tp7;

import java.time.Year;

public class Film implements Comparable<Film> {

    // Attributs
    private String titre;
    private String realisateur;
    private Year anneeSortie;

    // Constructeur
    public Film(String titre, String realisateur, int annee) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneeSortie = Year.of(annee);
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Year getAnneeSortie() {
        return anneeSortie;
    }

    // Affichage du film
    @Override
    public String toString() {
        return titre + ", " + realisateur + ", " + anneeSortie;
    }

    // Comparaison par année de sortie
    @Override
    public int compareTo(Film f) {
        return this.anneeSortie.compareTo(f.anneeSortie);
    }
}
