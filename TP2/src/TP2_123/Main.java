package TP2_123;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        //Declaration de trois instances de la classe PileEntiers
        PileEntiers P1 = new PileEntiers();
        PileEntiers P2 = new PileEntiers();
        PileEntiers P3 = new PileEntiers();


        //Création d'une instance de la classe Random
        Random alea = new Random();

        int valeur;

        //Tirage de nombre aléatoire et remplissage des Piles
        for (int i = 0; i < 5; i++) {
            //Valeur entre -10 et 10 compris
            valeur = alea.nextInt(10);
            //affichage de la valeur
            System.out.println("On empile " + valeur + " dans P1");
            //Empiler la valeur dans P1
            P1.Empiler(valeur);
        }

        P1.maListe.afficher();

        for (int i=0; i<5; i++)
        {
            valeur = P1.depiler();
            P3.Empiler(valeur);
            System.out.println(valeur+" : depile P1 / empile dans P3");
        }

        for (int i = 0; i<5; i++)
        {
            valeur = P3.depiler();
            if (valeur%2 == 0)
            {
                P2.Empiler(valeur);
                System.out.println(valeur+" : depile P3 / empile dans P2 et P1");
            }
            else
            {
                System.out.println(valeur+" : depile P3 / empile dans P1");
            }
            P1.Empiler(valeur);
        }

        for (int i =0; i<5; i++)
        {
            valeur = P1.depiler();
            P2.Empiler(valeur);
            System.out.println(valeur+" : depile P1 / empile dans P2");
        }

        for (int i=0; i<5; i++)
        {
            valeur = P2.depiler();
            if (valeur%2 != 0)
            {
                P3.Empiler(valeur);
                System.out.println(valeur+" : depile P2 / empile dans P3 et P1");
            }
            else
            {
                System.out.println(valeur+" : depile P2 / empile dans P1");
            }
            P1.Empiler(valeur);
        }

        P1.maListe.afficher();
        P2.maListe.afficher();
        P3.maListe.afficher();

        System.out.println("Valeur : "+ P1.sommet());
        System.out.println("Valeur : "+ P2.sommet());
        System.out.println("Valeur : "+ P3.sommet());

    }
}