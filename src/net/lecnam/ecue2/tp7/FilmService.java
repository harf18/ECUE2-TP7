package net.lecnam.ecue2.tp7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilmService {
    private static Set<Film> filmSet;

    public FilmService() throws IOException {
        filmSet = new HashSet<>();
        importFilm();
    }

    private void importFilm() throws IOException {
        Path chemin = Paths.get("films.csv");
        List<String> lignes = Files.readAllLines(chemin);

        for (String ligne : lignes) {
            if (ligne != null && !ligne.trim().isEmpty()) {
                String[] elements = ligne.split(";");
                if (elements.length >= 3) {
                    try {
                        int annee = Integer.parseInt(elements[0].trim());
                        String titre = elements[1].trim();
                        String realisateur = elements[2].trim();

                        filmSet.add(new Film(titre, realisateur, annee));
                    } catch (NumberFormatException e) {
                        System.err.println("Ligne ignorée (année invalide) : " + ligne);
                    }
                }
            }
        }
    }

    public void printFilms() {
        for (Film film : filmSet) {
            System.out.println(film);
        }
    }

    public void searchFilm(String search) {
        String rechercheMin = search.toLowerCase();
        for (Film film : filmSet) {
            if (film.getTitre().toLowerCase().contains(rechercheMin)) {
                System.out.println(film);
            }
        }
    }
}
