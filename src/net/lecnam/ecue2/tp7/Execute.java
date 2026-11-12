package net.lecnam.ecue2.tp7;

import java.io.IOException;
import java.util.*;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();

        //exercice3();

        exercice4();

        exercice5();

        exercice6();


    }

    private static void exercice1() {

        Nuancier nuancier = new Nuancier();
        List<String> couleurs = nuancier.getCouleurs();

        System.out.println("Taille de la liste : " + couleurs.size());

        System.out.println("----------------");
        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        System.out.println("----------------");

        Iterator<String> iterator = couleurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");

        System.out.println("La couleur en première position est : " + couleurs.getFirst());

        Collections.sort(couleurs);
        System.out.println("----------------");
        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");
    }


    private static void exercice2() {
        Nuancier nuancier = new Nuancier();
        Set<String> couleursTreeSet = nuancier.getCouleursTreeSet();
        System.out.println(couleursTreeSet);
    }

    private static void exercice3() {
        Nuancier nuancier = new Nuancier();
        System.out.println("Couleur pour la lettre 'r' : " + nuancier.getCouleurFromCode('r'));

    }


    private static void exercice4() {
        Set<Film> films = new TreeSet<>();
        films.add(new Film("Dune", "Denis Villeneuve", 2021));
        films.add(new Film("Pacific Rim", "Guillermo Del Toro", 2013));
        films.add(new Film("22 Jump Street", "Christopher Miller/Phil Lord", 2014));
        films.add(new Film("The Dark Knight", "Christopher Nolan", 2008));

        for (Film f : films) {
            System.out.println(f);
        }
        System.out.println("----------------");

        List<Film> listeFilms = new ArrayList<>(films);
        Collections.reverse(listeFilms);

        for (Film f : listeFilms) {
            System.out.println(f);
        }


    }

    private static void exercice5() {
        try {
            FilmService service = new FilmService();
            System.out.println("--- Liste des films importés depuis le fichier CSV ---");
            service.printFilms();
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

    }

    private static void exercice6() {
        try {
            FilmService service = new FilmService();
            System.out.println("--- Recherche de films ---");
            service.searchFilm("une");
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }


}
