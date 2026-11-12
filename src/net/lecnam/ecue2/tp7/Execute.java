package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Execute {

    public static void main(String[] args) {

        exercice1();

//        exercice2();
//
//        exercice3();
//
//        exercice4();
//
//        exercice5();
//
//        exercice6();


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