package net.lecnam.ecue2.tp7;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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



    }


    private static void exercice4() {



    }

    private static void exercice5() {



    }

    private static void exercice6() {



    }


}
