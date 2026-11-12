package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FilmService {

    private static Set<Film> filmSet;

    public FilmService() throws IOException {
        // LinkedHashSet : conserve l'ordre du fichier et garde tous les films
        filmSet = new LinkedHashSet<>();
        importFilm();
    }

    private void importFilm() throws IOException {
        // Format de chaque ligne : année;titre;réalisateur
        List<String> lignes = Files.readAllLines(Path.of("films.csv"));

        for (String ligne : lignes) {
            if (ligne.isBlank()) {
                continue;
            }
            String[] champs = ligne.split(";");
            if (champs.length < 3) {
                continue; // ligne mal formée
            }
            try {
                int annee = Integer.parseInt(champs[0].trim());
                String titre = champs[1].trim();
                String realisateur = champs[2].trim();
                filmSet.add(new Film(titre, realisateur, annee));
            } catch (NumberFormatException e) {
                // année invalide : on ignore la ligne
            }
        }
    }

    public void printFilms() {
        for (Film film : filmSet) {
            System.out.println(film);
        }
    }
}