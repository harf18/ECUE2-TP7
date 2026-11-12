package net.lecnam.ecue2.tp7.film;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.*;

public class FilmService {
    private static Set<Film> filmSet;
    private static Map<Year, Set<Film>> indexParAnnee;

    public FilmService() throws IOException {
        filmSet = new TreeSet<>();
        indexParAnnee = new HashMap<>();
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

                        Film nouveauFilm = new Film(titre, realisateur, annee);
                        filmSet.add(nouveauFilm);
                        Year anneeKey = nouveauFilm.getAnneeSortie();

                        if (indexParAnnee.containsKey(anneeKey)) {
                            indexParAnnee.get(anneeKey).add(nouveauFilm);
                        } else {
                            Set<Film> filmsDeLAnnee = new TreeSet<>();
                            filmsDeLAnnee.add(nouveauFilm);
                            indexParAnnee.put(anneeKey, filmsDeLAnnee);
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Ligne ignorée (erreur de format) : " + line);
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

    public void searchFilmByAnnee(int search) {
        Year anneeRecherche = Year.of(search);
        System.out.println("Films sortis en " + search);
        Set<Film> resultats = indexParAnnee.get(anneeRecherche);

        if (resultats != null && !resultats.isEmpty()) {
            System.out.println(resultats.size() + " film(s) trouvé(s) :");
            for (Film film : resultats) {
                System.out.println(film);
            }
        } else {
            System.out.println("Aucun film trouvé pour l'année " + search);
        }
    }
}