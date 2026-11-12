package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilmService {

    private static Set<Film> filmSet;

    public FilmService() throws IOException {
        filmSet = new TreeSet<>();
        importFilm();
    }

    private void importFilm() throws IOException {
        Path chemin = Path.of("films.csv");
        if (Files.exists(chemin)) {
            List<String> lignes = Files.readAllLines(chemin);
            for (String ligne : lignes) {
                if (!ligne.isBlank()) {
                    // Utilisation du point-virgule comme séparateur
                    String[] elements = ligne.split(";");
                    if (elements.length >= 3) {
                        // Ordre dans le CSV : Année (0), Titre (1), Réalisateur (2)
                        int annee = Integer.parseInt(elements[0].trim());
                        String titre = elements[1].trim();
                        String realisateur = elements[2].trim();

                        filmSet.add(new Film(titre, realisateur, annee));
                    }
                }
            }
        }
    }

    public void printFilms() {
        if (filmSet != null) {
            for (Film film : filmSet) {
                System.out.println(film);
            }
        }
    }

}
