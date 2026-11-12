package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.film.*;
import net.lecnam.ecue2.tp7.nuancier.Nuancier;


import java.io.IOException;
import java.util.*;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();

        //exercice3();

        //exercice4();

        exercice5();

        //exercice6();


    }

    private static void exercice1() {
        Nuancier nuancier = new Nuancier();
        List<String> couleurs = nuancier.getCouleurs();

        // Afficher le nombre d'éléments (7)
        System.out.println("Nombre d'éléments : " + couleurs.size());
        System.out.println("----------------");

        // 1er parcours : boucle for classique
        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");

        // 2ème parcours : boucle foreach
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        System.out.println("----------------");

        // 3ème parcours : Iterator
        Iterator<String> iterator = couleurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");

        // Vérifier que "cyan" est en première position
        if ("cyan".equals(couleurs.get(0))) {
            System.out.println("Vérification OK : cyan est bien en première position.");
        }
        System.out.println("----------------");

        // Trier la liste et la parcourir une fois
        Collections.sort(couleurs);
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
    }

    private static void exercice2() {
        Nuancier nuancier = new Nuancier();
        Set<String> couleursTreeSet = nuancier.getCouleursTreeSet();

        System.out.println(couleursTreeSet);
        // Remarque :
        // 1. Le doublon "rouge" a disparu car un Set n'accepte pas les doublons.
        // 2. Les couleurs sont automatiquement triées par ordre alphabétique
        //    ([blanc, cyan, marron, noir, rouge, vert]) car TreeSet maintient
        //    ses éléments selon leur ordre naturel.
    }

    private static void exercice3() {
        Nuancier nuancier = new Nuancier();
        String couleur = nuancier.getCouleurFromCode('r');
        System.out.println("Couleur pour 'r' : " + couleur);
    }


    private static void exercice4() {
        // Collection nativement triée : TreeSet
        Set<Film> films = new TreeSet<>();
        films.add(new Film("Inception", "Christopher Nolan", 2010));
        films.add(new Film("The Godfather", "Francis Ford Coppola", 1972));
        films.add(new Film("Pulp Fiction", "Quentin Tarantino", 1994));
        films.add(new Film("12 Angry Men", "Sidney Lumet", 1957));
        films.add(new Film("Parasite", "Bong Joon-ho", 2019));

        System.out.println("--- Tri ascendant ---");
        for (Film f : films) {
            System.out.println(f);
        }

        // Création d'une ArrayList à partir du TreeSet et inversion de l'ordre
        List<Film> filmsList = new ArrayList<>(films);
        Collections.reverse(filmsList);

        System.out.println("--- Tri descendant ---");
        for (Film f : filmsList) {
            System.out.println(f);
        }
    }

    private static void exercice5() {
        try {
            FilmService filmService = new FilmService();
            filmService.printFilms();
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }
    }

    private static void exercice6() {



    }


}
