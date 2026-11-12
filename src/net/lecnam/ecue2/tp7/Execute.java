package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import java.util.Set;


public class Execute {

    public static void main(String[] args) {

        //exercice1();

        exercice2();

        //exercice3();

        //exercice4();

        //exercice5();

        //exercice6();


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



    }


    private static void exercice4() {



    }

    private static void exercice5() {



    }

    private static void exercice6() {



    }


}
