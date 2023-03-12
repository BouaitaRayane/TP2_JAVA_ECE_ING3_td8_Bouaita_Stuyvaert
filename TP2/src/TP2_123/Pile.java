package TP2_123;

import TP2_123.Liste;

public class Pile {
    //ATTRIBUT
    protected Liste maListe;

    //GETTER SETTER CONSTRUCTEUR
    public Liste getMaListe() {
        return maListe;
    }

    public void setMaListe(Liste maListe) {
        this.maListe = maListe;
    }

    public Pile() {
        maListe = new Liste();
    }

    //METHODES

    //Empiler un element
    public void Empiler(Object valeur) {
        //System.out.println("On empile " + valeur);
        //Utilisation de l'ajout d'un element dans la liste
        maListe.ajouter(valeur);

    }
    //Depiler un element (Le dernier : Last In First Out LIFO) (Principe de la pile)
    public Object Depiler() {
        maListe.Dernier();
        return maListe.supprimer();
    }

    //Verification si vide ou non
    public boolean vide()
    {
        return maListe.getStockage().isEmpty();
        //True = vide
    }

    public Object sommet() {
        maListe.Dernier();
        return maListe.getStockage().get(maListe.getPosition());
    }



}
