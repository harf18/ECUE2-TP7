package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FilmService {
    private static Set<Film> filmSet;

    public FilmService() throws IOException {
        filmSet = new TreeSet<>();
        this.importFilm();
    }

    private void importFilm() throws IOException {
        Path path = Paths.get("films.csv");
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            if (line != null && !line.trim().isEmpty()) {
                String[] data = line.split(";");
                if (data.length >= 3) {
                    try {
                        String titre = data[1].trim();
                        String realisateur = data[2].trim();
                        int annee = Integer.parseInt(data[0].trim());
                        filmSet.add(new Film(titre, realisateur, annee));
                    } catch (NumberFormatException e) {
                        System.out.println("Ligne ignorée (erreur de format sur l'année) : " + line);
                    }
                }
            }
        }
    }

    public void printFilms() {
        System.out.println("Liste des films importés :");
        for (Film film : filmSet) {
            System.out.println(film);
        }
    }

    public void searchFilm(String search) {
        System.out.println("Résultat(s) de la recherche pour : '" + search);
        boolean found = false;
        String searchLower = search.toLowerCase();

        for (Film film : filmSet) {
            if (film.getTitre().toLowerCase().contains(searchLower)) {
                System.out.println(film);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Aucun film ne correspond à votre recherche.");
        }
    }
}