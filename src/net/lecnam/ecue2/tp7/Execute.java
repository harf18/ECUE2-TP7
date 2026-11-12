package net.lecnam.ecue2.tp7;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
        List<String> listeCouleurs = nuancier.getCouleurs();

        System.out.println("Nb éléments : " + listeCouleurs.size());

        System.out.println("----------------");

        // for
        for (int i = 0; i < listeCouleurs.size(); i++) {
            System.out.println(listeCouleurs.get(i));
        }
        System.out.println("----------------");

        // for each
        for (String couleur : listeCouleurs) {
            System.out.println(couleur);
        }

        System.out.println("----------------");

        // Iterator
        Iterator<String> it = listeCouleurs.iterator();
        while (it.hasNext()) {
            String couleur = it.next();
            System.out.println(couleur);
        }

        System.out.println("----------------");

        if (listeCouleurs.indexOf("cyan") == 0) {
            System.out.println("Cyan est bien premier");
        }

        System.out.println("----------------");

        Collections.sort(listeCouleurs);
        for (String couleur : listeCouleurs) {
            System.out.println(couleur);
        }


    }


    private static void exercice2() {
        System.out.println("\n\n\nExo 2\n");
        Nuancier nuancier = new Nuancier();
        for(Object s : nuancier.getCouleursTreeSet()){
            System.out.println(s);
        }

    }

    private static void exercice3() {
        System.out.println("\n\n\nExo 3\n");
        Nuancier nuancier = new Nuancier();
        System.out.println("Couelur r : " + nuancier.getCouleurFromCode('r'));


    }


    private static void exercice4() {



    }

    private static void exercice5() {



    }

    private static void exercice6() {



    }


}
