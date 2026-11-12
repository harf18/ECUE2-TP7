package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

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
