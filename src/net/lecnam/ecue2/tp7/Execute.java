package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

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



    }

    private static void exercice5() {



    }

    private static void exercice6() {



    }


}
