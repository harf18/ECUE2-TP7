
package net.lecnam.ecue2.tp7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class FilmService {

    private static Set<Film> filmSet;

    // Importation des films depuis le fichier CSV
    private void importFilm() throws IOException {

        for (String ligne : Files.readAllLines(Paths.get("films.csv"))) {

            String[] donnees = ligne.split(";");

            int annee = Integer.parseInt(donnees[0].trim());
            String titre = donnees[1].trim();
            String realisateur = donnees[2].trim();

            Film film = new Film(titre, realisateur, annee);

            filmSet.add(film);
        }
    }

    // Affichage des films
    public void printFilms() {

        for (Film film : filmSet) {
            System.out.println(film);
        }
    }

    // Constructeur
    public FilmService() throws IOException {

        filmSet = new TreeSet<>();

        importFilm();
    }
}
