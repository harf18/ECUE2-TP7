package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;
import net.lecnam.ecue2.tp7.film.Film;
import net.lecnam.ecue2.tp7.film.FilmService;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import java.util.Set;

import java.util.ArrayList;
import java.util.TreeSet;


public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();

        //exercice3();

        //exercice4();

        //exercice5();

        exercice6();


    }

    private static void exercice1() {
        Nuancier nuancier = new Nuancier();
        List<String> couleurs = nuancier.getCouleurs();

        // 1. Afficher le nombre d'éléments
        System.out.println("Nombre d'éléments : " + couleurs.size());
        System.out.println("----------------");

        // 2. Parcours avec un for classique
        System.out.println("Parcours avec un for :");
        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");

        // 3. Parcours avec un foreach
        System.out.println("Parcours avec un foreach :");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        System.out.println("----------------");

        // 4. Parcours avec un Iterator
        System.out.println("Parcours avec un Iterator :");
        Iterator<String> iterator = couleurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");

        // 5. Vérifier que la couleur cyan est en première position
        boolean estPremierCyan = !couleurs.isEmpty() && couleurs.get(0).equals("cyan");
        System.out.println("Cyan est en première position : " + estPremierCyan);
        System.out.println("----------------");

        // 6. Trier la liste et la parcourir
        Collections.sort(couleurs);
        System.out.println("Liste triée :");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

    }


    private static void exercice2() {
        Nuancier nuancier = new Nuancier();
        Set<String> couleursTreeSet = nuancier.getCouleursTreeSet();

        System.out.println("Contenu du TreeSet :");
        System.out.println(couleursTreeSet);

    }

    private static void exercice3() {
        Nuancier nuancier = new Nuancier();
        String couleurTrouvee = nuancier.getCouleurFromCode('r');
        System.out.println("Couleur pour la lettre 'r' : " + couleurTrouvee);

    }


    private static void exercice4() {
        // 1. Créer une collection naturellement triée (TreeSet) avec plusieurs films
        Set<Film> filmsTreeSet = new TreeSet<>();
        filmsTreeSet.add(new Film("The Godfather", "Francis Ford Coppola", 1972));
        filmsTreeSet.add(new Film("12 Angry Men", "Sidney Lumet", 1957));
        filmsTreeSet.add(new Film("The Shawshank Redemption", "Frank Darabont", 1994));
        filmsTreeSet.add(new Film("The Dark Knight", "Christopher Nolan", 2008));

        // 2. Afficher le contenu de la collection (triée par année ascendante)
        System.out.println("--- Collection triée par année (TreeSet) ---");
        for (Film film : filmsTreeSet) {
            System.out.println(film);
        }
        System.out.println("----------------------------------------");

        // 3. Créer une ArrayList à partir de la collection
        List<Film> filmsList = new ArrayList<>(filmsTreeSet);

        // 4. Inverser l'ordre de la liste avec Collections.reverse()
        Collections.reverse(filmsList);

        // 5. Afficher le contenu de l'ArrayList inversée
        System.out.println("--- ArrayList après inversion de l'ordre ---");
        for (Film film : filmsList) {
            System.out.println(film);
        }


    }

    private static void exercice5() {
        try {
            FilmService service = new FilmService();
            System.out.println("--- Liste des films chargés depuis le fichier CSV ---");
            service.printFilms();
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier films.csv : " + e.getMessage());
        }

    }

    private static void exercice6() {
        try {
            FilmService service = new FilmService();
            service.searchFilm("man");
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier films.csv : " + e.getMessage());
        }

    }


}
