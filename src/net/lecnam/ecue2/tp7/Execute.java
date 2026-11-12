package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.nuancer.Nuancier;

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

        System.out.println("Exercice 1.");
        System.out.println("Methode : for");
        for (int i=0; i < couleurs.size();i++) {
            System.out.println(i + " : " + couleurs.get(i));
        }

        System.out.println("\nMethode : foreach");
        System.out.println("----------------");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

        System.out.println("\nMethode : iterator");
        System.out.println("----------------");
        Iterator<String> iterCouleur = couleurs.iterator();
        while ( iterCouleur.hasNext()) {
            System.out.println(iterCouleur.next());
        }


        Collections.sort(couleurs);
        System.out.println("\nMethode post tri : foreach");
        System.out.println("----------------");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
    }


    private static void exercice2() {
        Nuancier nuancier = new Nuancier();
        Set<String> couleurs = nuancier.getCouleursTreeSet();

        System.out.println("\nExercice 2.");
        System.out.println("Methode : foreach");
        System.out.println("----------------");
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        // TreeSet Ordonne la liste automatiquement et efface les doublons
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
