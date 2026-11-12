package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.time.Year;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

import java.util.List;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilmService {

    private static Set<Film> filmSet;
    private static Map<Year, Set<Film>> indexParAnnee;

    public FilmService() throws IOException {
        filmSet = new TreeSet<>();
        indexParAnnee = new HashMap<>();
        importFilm();
    }

    private void importFilm() throws IOException {
        Path chemin = Path.of("films.csv");
        if (Files.exists(chemin)) {
            List<String> lignes = Files.readAllLines(chemin);
            for (String ligne : lignes) {
                if (!ligne.isBlank()) {
                    String[] elements = ligne.split(";");
                    if (elements.length >= 3) {
                        int anneeInt = Integer.parseInt(elements[0].trim());
                        String titre = elements[1].trim();
                        String realisateur = elements[2].trim();

                        Film film = new Film(titre, realisateur, anneeInt);
                        filmSet.add(film);

                        // Indexation par année
                        Year anneeYear = film.getAnneeSortie();
                        if (!indexParAnnee.containsKey(anneeYear)) {
                            indexParAnnee.put(anneeYear, new TreeSet<>());
                        }
                        indexParAnnee.get(anneeYear).add(film);
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

    public void searchFilm(String search) {
        if (filmSet != null) {
            System.out.println("--- Résultats de la recherche pour : \"" + search + "\" ---");
            for (Film film : filmSet) {
                // Utilisation detoLowerCase() pour rendre la recherche insensible à la casse (majuscules/minuscules)
                if (film.getTitre().toLowerCase().contains(search.toLowerCase())) {
                    System.out.println(film);
                }
            }
        }
    }

    public void searchFilmByAnnee(int search) {
        Year anneeRecherchee = Year.of(search);
        Set<Film> filmsDeLAnnee = indexParAnnee.get(anneeRecherchee);

        System.out.println("--- Films sortis en " + search + " ---");
        if (filmsDeLAnnee != null && !filmsDeLAnnee.isEmpty()) {
            for (Film film : filmsDeLAnnee) {
                System.out.println(film);
            }
            System.out.println("Nombre total : " + filmsDeLAnnee.size());
        } else {
            System.out.println("Aucun film trouvé pour cette année.");
        }
    }

}
