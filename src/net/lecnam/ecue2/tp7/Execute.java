package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.film.Film;
import net.lecnam.ecue2.tp7.nuancier.Nuancier;

import java.time.Year;
import java.util.*;

public class Execute {

    public static void main(String[] args) {

        exercice1();

        exercice2();

        exercice3();

        exercice4();

        exercice5();

        exercice6();


    }

    private static void exercice1() {
        Nuancier nuance = new Nuancier();
        List<String> couleurs = nuance.getCouleurs();
        System.out.println("------Exercice 1 ----------");


        System.out.println("--------parcours 1 : FOR  --------");
        for(int i=0 ; i<couleurs.size();i++)
        {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");
        System.out.println("--------parcours 2 : FOREACH --------");
        for(String couleur : couleurs)
        {
            System.out.println(couleur);
        }
        System.out.println("--------parcours 2 : ITERATOR --------");
        Iterator<String> iter = couleurs.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println("----------------");
        System.out.println("Première couleur : " + couleurs.get(0));
        Collections.sort(couleurs);
        couleurs.forEach(System.out::println);
        System.out.println("----------------");

    }


    private static void exercice2() {
        Nuancier nuancier1 = new Nuancier();
        Set<String> setCouleurs  = nuancier1.getCouleursTreeSet();
        System.out.println("-------Exercice 2 ---------");
        setCouleurs.forEach(System.out::println);
        System.out.println("----------------");
        /*Remarque : le doublon "rouge" a disparu (un Set n'accepte pas
         les doublons) et les couleurs sont triées par ordre alphabétique
         (blanc, cyan, marron, noir, rouge, vert).*/
    }

    private static void exercice3() {
        Nuancier nuance2 = new Nuancier();
        System.out.println("-------Exercice 3 ---------");
        System.out.println(nuance2.getCouleurFromCode('r'));
        System.out.println("----------------");

    }


    private static void exercice4() {
        Set<Film> films = new TreeSet<>();

        films.add(new Film("The Godfather", "Francis Ford Coppola", 1972));
        films.add(new Film("The Shawshank Redemption", "Frank Darabont", 1994));
        films.add(new Film("Schindler's List", "Steven Spielberg", 1993));
        films.add(new Film("Pulp Fiction", "Quentin Tarantino", 1994 + 0));
        films.add(new Film("Spirited Away", "Hayao Miyazaki", 2001));



        System.out.println("-------Exercice 4 ---------");

        System.out.println("--- ordre année croissante -----");
        films.forEach(System.out::println);
        List<Film> liste = new ArrayList<>(films);
        Collections.reverse(liste);
        System.out.println("---inverse l'ordre-----");
        liste.forEach(System.out::println);
        System.out.println("----------------");

    }

    private static void exercice5() {



    }

    private static void exercice6() {



    }


}
