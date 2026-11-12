package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.Iterator;

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
