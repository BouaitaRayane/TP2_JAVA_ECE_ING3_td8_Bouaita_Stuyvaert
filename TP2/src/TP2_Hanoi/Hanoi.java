package TP2_Hanoi;
import java.util.Scanner;
import TP2_123.PileEntiers;

public class Hanoi {

    private PileEntiers P1;
    private PileEntiers P2;
    private PileEntiers P3;
    private int n;

    public PileEntiers getP1() {return P1;}

    public void setP1(PileEntiers p1) {P1 = p1;}

    public PileEntiers getP2() {return P2;}

    public void setP2(PileEntiers p2) {P2 = p2;}

    public PileEntiers getP3() {return P3;}

    public void setP3(PileEntiers p3) {P3 = p3;}

    public int getN() {return n;}

    public void setN(int n) {this.n = n;}

    public Hanoi() {
        P1 = new PileEntiers();
        P2 = new PileEntiers();
        P3 = new PileEntiers();
        n=0;
    }

    public void saisirTaille ()
    {
        Scanner clavier = new Scanner(System.in);
        do {
            System.out.print("Saisir le nombre de disques : ");
            n = clavier.nextInt();
        }while(n<=0);
    }

    public void remplir ()
    {
        for (int i=n; i>=1; i--)
        {
            P1.Empiler(i);
        }
    }

    public void afficherHanoi()
    {
        System.out.print("P1 : ");
        P1.getMaListe().afficher();
        System.out.print("P2 : ");
        P2.getMaListe().afficher();
        System.out.print("P3 : ");
        P3.getMaListe().afficher();
    }

    public void resolutionIteratif ()
    {
        int indic = 0;

        //Parité de n
        if (n%2==0)
        {
            indic=1; // Si le nombre de disque est Pair
        }
        else
        {
            indic=-1; // Si le nombre de disque est impair
        }

        //Calcul du nb de déplacement min (Cast en int, Math.pow renvoie un double)
        int deplacementMin = (int) Math.pow(2,n)-1;

        for (int i=0; i<deplacementMin; i++)
        {
            //n Paire
            if (indic==1)
            {
                if(i%3==0)
                {
                    //Entre P1 et  (vers la droite)
                    if ((!P1.vide())&&((P2.vide())||(P1.sommet()< P2.sommet()))){P2.Empiler(P1.depiler());}
                    else {P1.Empiler(P2.depiler());}

                }
                else if (i%3==1)
                {
                    //Entre P1 et P3 (vers la droite)
                    if ((!P1.vide())&&((P3.vide())||(P1.sommet()< P3.sommet()))){P3.Empiler(P1.depiler());}
                    else{P1.Empiler(P3.depiler());}
                }
                else
                {
                    //Entre P2 et P3
                    if ((!P2.vide())&&((P3.vide())||(P2.sommet()< P3.sommet()))){P3.Empiler(P2.depiler());}
                    else{P2.Empiler(P3.depiler());}
                }
            }
            //n Impair
            else {
                if(i%3==0)
                {
                    //Entre P1 et P3
                    if ((!P1.vide())&&((P3.vide())||(P1.sommet()< P3.sommet()))){P3.Empiler(P1.depiler());}
                    else{P1.Empiler(P3.depiler());}
                }
                else if (i%3==1)
                {
                    //Entre P1 et P2 (vers la gauche)
                    if ((!P1.vide())&&((P2.vide())||(P1.sommet()< P2.sommet()))){P2.Empiler(P1.depiler());}
                    else {P1.Empiler(P2.depiler());}
                }
                else
                {
                    //Entre P2 et P3
                    if ((!P3.vide())&&((P2.vide())||(P3.sommet()< P2.sommet()))){P2.Empiler(P3.depiler());}
                    else {P3.Empiler(P2.depiler());}
                }
            }

            afficherHanoi();
            System.out.println("_-_-_-_-_-_-_-_");
        }

    }


}
