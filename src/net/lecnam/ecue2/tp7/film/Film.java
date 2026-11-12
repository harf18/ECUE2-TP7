package net.lecnam.ecue2.tp7.film;
import java.time.Year;
public class Film implements Comparable<Film>{
    private final String titre;
    private final String realisateur;
    private final Year anneeSortie;

    public Film(String titre, String realisateur, int anneeSortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneeSortie = Year.of(anneeSortie);
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
        return titre + " - " + realisateur + " - " + anneeSortie;
    }
    @Override
    public int compareTo(Film f) {
        int cmp = this.anneeSortie.compareTo(f.anneeSortie);
        if (cmp != 0) {
            return cmp;
        }
        return this.titre.compareTo(f.titre);
    }
}
