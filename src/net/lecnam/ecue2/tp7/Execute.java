package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

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

        // Nombre d'éléments
        System.out.println("Nombre de couleurs : " + couleurs.size());

        // 1. Parcours avec un for classique
        System.out.println("----- FOR -----");

        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }

        // 2. Parcours avec un foreach
        System.out.println("----- FOREACH -----");

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

        // 3. Parcours avec un Iterator
        System.out.println("----- ITERATOR -----");

        Iterator<String> iterator = couleurs.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Vérification de la première position
        System.out.println("Première couleur : " + couleurs.get(0));

        // Tri de la liste
        couleurs.sort(null);

        System.out.println("----- LISTE TRIEE -----");

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
    }



    public static void exercice2() {

        Nuancier nuancier = new Nuancier();

        Set<String> couleurs = nuancier.getCouleursTreeSet();

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

    }

    public static void exercice3() {

        Nuancier nuancier = new Nuancier();

        String couleur = nuancier.getCouleurFromCode('r');

        System.out.println(couleur);
    }



    public static void exercice4() {

        // Création des films
        Film film1 = new Film("Interstellar", "Christopher Nolan", 2014);
        Film film2 = new Film("Pulp Fiction", "Quentin Tarantino", 1994);
        Film film3 = new Film("Matrix", "Lana Wachowski", 1999);
        Film film4 = new Film("Le Parrain", "Francis Ford Coppola", 1972);
        Film film5 = new Film("Inception", "Christopher Nolan", 2010);

        // Création d'une collection automatiquement triée
        Set<Film> films = new TreeSet<>();

        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);
        films.add(film5);

        // Affichage de la collection triée
        System.out.println("----- FILMS TRIES -----");

        for (Film film : films) {
            System.out.println(film);
        }

        // Création d'une ArrayList à partir du TreeSet
        ArrayList<Film> listeFilms = new ArrayList<>(films);

        // Inversion de l'ordre de la liste
        Collections.reverse(listeFilms);

        // Affichage de l'ArrayList inversée
        System.out.println("----- FILMS EN ORDRE INVERSE -----");

        for (Film film : listeFilms) {
            System.out.println(film);
        }
    }


    private static void exercice5() {



    }

    private static void exercice6() {



    }


}
