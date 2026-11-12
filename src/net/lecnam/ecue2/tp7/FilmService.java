package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Year;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FilmService {

    private static Set<Film> filmSet;
    private static Map<Year, Set<Film>> indexParAnnee;

    public FilmService() throws IOException {
        // LinkedHashSet : conserve l'ordre du fichier et garde tous les films
        filmSet = new LinkedHashSet<>();
        indexParAnnee = new HashMap<>();
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
                Film film = new Film(titre, realisateur, annee);
                filmSet.add(film);

                // Indexation par année : si la clé existe on récupère le sous-ensemble,
                // sinon on crée la clé avec un nouveau sous-ensemble (computeIfAbsent)
                indexParAnnee.computeIfAbsent(film.getAnneeSortie(), k -> new TreeSet<>()).add(film);
            } catch (NumberFormatException e) {
                // année invalide : on ignore la ligne
            }
        }
    }

    public void searchFilm(String search) {
        String recherche = search.toLowerCase();
        for (Film film : filmSet) {
            if (film.getTitre().toLowerCase().contains(recherche)) {
                System.out.println(film);
            }
        }
    }

    public void searchFilmByAnnee(int search) {
        Set<Film> films = indexParAnnee.get(Year.of(search));
        if (films == null) {
            System.out.println("Aucun film pour l'année " + search);
            return;
        }
        for (Film film : films) {
            System.out.println(film);
        }
    }

    public void printFilms() {
        for (Film film : filmSet) {
            System.out.println(film);
        }
    }
}