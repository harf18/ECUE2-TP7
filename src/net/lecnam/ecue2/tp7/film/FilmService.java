package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
        Path path = Paths.get("films.csv");
        List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);

        // On démarre à i = 1 pour ignorer la ligne d'en-tête du fichier CSV
        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i).trim();
            if (ligne.isEmpty()) {
                continue;
            }

            // Vérifie dans films.csv si le séparateur est ";" ou ","
            String[] infos = ligne.split(";");
            if (infos.length >= 3) {
                String titre = infos[1].trim();
                String realisateur = infos[2].trim();
                int annee = Integer.parseInt(infos[0].trim());

                Film film = new Film(titre, realisateur, annee);
                filmSet.add(film);
            }
        }
    }

    public void printFilms() {
        for (Film film : filmSet) {
            System.out.println(film);
        }
    }
}