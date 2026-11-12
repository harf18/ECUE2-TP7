package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.film.Film;
import net.lecnam.ecue2.tp7.film.FilmService;
import net.lecnam.ecue2.tp7.nuancier.Nuancier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Execute {

    public static void main(String[] args) {

//        exercice1();
//
//        exercice2();
//
//        exercice3();

//        exercice4();
//
//        exercice5();
//
//        exercice6();
//
        exercice7();


    }

    private static void exercice1() {

        Nuancier nuancier = new Nuancier();
        List<String> couleurs = nuancier.getCouleurs();

        // Nombre d'éléments
        System.out.println("Nombre de couleurs : " + couleurs.size());
        System.out.println("----------------");

        // 1. avec un for
        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");

        // 2. avec un foreach
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        System.out.println("----------------");

        // 3. avec un iterator
        Iterator<String> it = couleurs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");

        // Tri de la liste puis parcours
        Collections.sort(couleurs);
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

    }


    private static void exercice2() {

        Nuancier nuancier = new Nuancier();
        Set<String> treeSet = nuancier.getCouleursTreeSet();

        for (String couleur : treeSet) {
            System.out.println(couleur);
        }

        // Remarque : le TreeSet ne contient pas de doublons ("rouge" n'apparaît
        // qu'une seule fois alors qu'il est 2 fois dans la liste) et les éléments
        // sont triés par ordre alphabétique (cyan n'est plus en première position
        // car l'ordre d'insertion n'est pas conservé).

    }

    private static void exercice3() {

        Nuancier nuancier = new Nuancier();
        System.out.println(nuancier.getCouleurFromCode('r'));

    }


    private static void exercice4() {

        // Collection nativement triée (utilise compareTo de Film : tri par année)
        // Attention : le TreeSet considère 2 films de même année comme identiques,
        // d'où des années toutes différentes ici.
        Set<Film> films = new TreeSet<>();
        films.add(new Film("The Godfather", "Francis Ford Coppola", 1972));
        films.add(new Film("Schindler's List", "Steven Spielberg", 1993));
        films.add(new Film("The Shawshank Redemption", "Frank Darabont", 1994));
        films.add(new Film("Seven Samurai", "Akira Kurosawa", 1954));
        films.add(new Film("Fight Club", "David Fincher", 1999));
        films.add(new Film("Spirited Away", "Hayao Miyazaki", 2001));
        films.add(new Film("Inception", "Christopher Nolan", 2010));
        films.add(new Film("Parasite", "Bong Joon-ho", 2019));

        System.out.println("Films triés par année :");
        for (Film film : films) {
            System.out.println(film);
        }
        System.out.println("----------------");

        // ArrayList créée à partir de la collection, puis ordre inversé
        List<Film> liste = new ArrayList<>(films);
        Collections.reverse(liste);

        System.out.println("Films dans l'ordre inverse :");
        for (Film film : liste) {
            System.out.println(film);
        }

    }

    private static void exercice5() {

        try {
            FilmService filmService = new FilmService();
            filmService.printFilms();
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture de films.csv : " + e.getMessage());
        }

    }

    private static void exercice6() {

        try {
            FilmService filmService = new FilmService();
            filmService.searchFilm("man");
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture de films.csv : " + e.getMessage());
        }

    }

    private static void exercice7() {

        try {
            FilmService filmService = new FilmService();
            filmService.searchFilmByAnnee(1985);
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture de films.csv : " + e.getMessage());
        }

    }


}