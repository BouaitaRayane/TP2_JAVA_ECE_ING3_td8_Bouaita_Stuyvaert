package TP2_Hanoi;

public class Main {
    public static void main(String[] args) {
        Hanoi jeu = new Hanoi();
        jeu.saisirTaille();
        jeu.remplir();
        jeu.afficherHanoi();
        jeu.resolutionIteratif();
    }
}
