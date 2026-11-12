package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;

public class Execute {

    public static void main(String[] args) {

        exercice1();

        exercice2();

        //exercice3();

        //exercice4();

        //exercice5();

        //exercice6();


    }


    private static void exercice1() {

        Nuancier nuancier = new Nuancier();
        List<String> couleurs = nuancier.getCouleurs();

        System.out.println("Nombre d'éléments : " + couleurs.size());
        System.out.println("----------------");

        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");

        for (String c : couleurs) {
            System.out.println(c);
        }
        System.out.println("----------------");

        Iterator<String> iterator = couleurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");

        boolean estCyanPremier = !couleurs.isEmpty() && couleurs.get(0).equals("cyan");
        System.out.println("Cyan est en première position : " + estCyanPremier);
        System.out.println("----------------");

        Collections.sort(couleurs);
        for (String c : couleurs) {
            System.out.println(c);
        }
    }



    public static void exercice2() {

        Nuancier nuancier = new Nuancier();
        Set<String> couleursTreeSet = nuancier.getCouleursTreeSet();

        System.out.println("Contenu du TreeSet :");
        for (String c : couleursTreeSet) {
            System.out.println(c);
        }


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
