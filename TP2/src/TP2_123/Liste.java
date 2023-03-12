package TP2_123;

import java.util.ArrayList;
import java.util.*;

public class Liste {
    //ATTRIBUT
    private int position;
    private ArrayList<Object> stockage = new ArrayList<>();

    //GETTERS SETTERS CONSTRUCTEUR

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ArrayList<Object> getStockage() {
        return stockage;
    }

    public void setStockage(ArrayList<Object> stockage) {
        this.stockage = stockage;
    }

    public Liste() {
        position=0;
    }

    //METHODE

    /*Se positionner sur Le premier element de la liste*/
    public void Premier()
    {
        //Premier = position 0 du tableau dynamique
        position = 0;
        System.out.println("Le premiere elment de la liste est : "+stockage.get(position));
    }

    /*Se positionner sur le derniere element de la liste*/
    public void Dernier()
    {
        //Dernier = taille du tableau -1 (le tableau commence à 0)
        position = stockage.size()-1;



    }
    /*Retourne l'objet suivant sur lequelle on est positionné*/
    public Object suivant () {
        //test si la liste est vide ou si position sur dernier
        if (stockage.size() == 0||position==stockage.size()-1)
        {
            System.out.println("Erreur");
            //renvoie de l'objet vide
            return null;
        }
        else
        {
            //Postion suivante
            position++;
            //Renvoie de la valeur
            return stockage.get(position);
        }
    }
    /*Ajoute un element a la liste*/
    public void ajouter  (Object valeur)
    {
        stockage.add(valeur);
    }

    public Object supprimer ()
    {
        //Verification de la position
        if (stockage.size() == 0||position>=stockage.size())
        {
            System.out.println("Erreur");
            return null;
        }
        else
        {
            //Supprimer un element
            Object suppr = stockage.remove(position);
            //L'objet a la position precedente n'existe plus
            //System.out.println("On depile " + suppr);
            position = stockage.size() - 1;
            return suppr;
        }
    }

    public void afficher ()
    {
        System.out.print(stockage);
        System.out.println("");
    }
}
