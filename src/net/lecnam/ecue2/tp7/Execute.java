package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.film.Film;
import net.lecnam.ecue2.tp7.film.FilmService;
import net.lecnam.ecue2.tp7.nuancier.Nuancier;

import java.util.*;
import java.io.IOException;

public class Execute {

    public static void main(String[] args) {

        // exercice1();

        // exercice2();

        //exercice3();

        //exercice4();

        //exercice5();

        exercice6();


    }

    private static void exercice1() {

        Nuancier nuancier = new Nuancier();
        List<String> maListe = nuancier.getCouleurs();

        System.out.println("Nombre d'éléments dans la liste : " + maListe.size());
        System.out.println("----------------");

        System.out.println("Parcours avec un for :");
        for (int i = 0; i < maListe.size(); i++) {
            System.out.println(maListe.get(i));
        }
        System.out.println("----------------");

        System.out.println("Parcours avec un for each :");
        for (String couleur : maListe) {
            System.out.println(couleur);
        }
        System.out.println("----------------");

        System.out.println("Parcours avec un iterator :");
        Iterator<String> it = maListe.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");


        System.out.println(maListe.get(0));
        System.out.println("----------------");

        Collections.sort(maListe);
        for (String couleur : maListe) {
            System.out.println(couleur);
        }

    }


    private static void exercice2() {

        Nuancier nuancier = new Nuancier();
        Set<String> monTreeSet = nuancier.getCouleursTreeSet();

        System.out.println("Contenu du TreeSet :");
        for (String couleur : monTreeSet) {
            System.out.println(couleur);
        }

        /*
         * On remarque 2 choses :
         * 1/ D'une part, le tree set à retiré le doublon "rouge" qui était présent autrefois
         * 2/ La liste est automatiquement triée dans l'ordre alphabétique
         */

    }

    private static void exercice3() {

        Nuancier nuancier = new Nuancier();
        char code = 'r';
        String couleurTrouvee = nuancier.getCouleurFromCode(code);
        System.out.println("La couleur correspondant à l'initiale '" + code + "' est : " + couleurTrouvee);

    }


    private static void exercice4() {

        Film f1 = new Film("Sharknado", "Yannis Mouchard", 1994);
        Film f2 = new Film("Pacific Rim", "Zackari Nouchet", 1972);
        Film f3 = new Film("Cars", "Julien Forestier", 1957);
        Film f4 = new Film("The Amazing Digital Circus", "Maxime Monichon", 1993);
        Film f5 = new Film("Le Diner de Cons", "Andrea Andreoli", 2019);

        Set<Film> filmsTries = new TreeSet<>();
        filmsTries.add(f1);
        filmsTries.add(f2);
        filmsTries.add(f3);
        filmsTries.add(f4);
        filmsTries.add(f5);

        System.out.println("Contenu de la collection triée");
        for (Film film : filmsTries) {
            System.out.println(film);
        }

        List<Film> listeFilms = new ArrayList<>(filmsTries);

        Collections.reverse(listeFilms);

        System.out.println("Contenu inversé");
        for (Film film : listeFilms) {
            System.out.println(film);
        }

    }

    private static void exercice5() {

        try {
            FilmService filmService = new FilmService();
            filmService.printFilms();
        } catch (IOException e) {
            System.err.println("Une erreur est survenue lors de la lecture du fichier films.csv : " + e.getMessage());
        }

    }

    private static void exercice6() {

        try {
            FilmService filmService = new FilmService();
            filmService.searchFilm("Man");
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

    }


}
