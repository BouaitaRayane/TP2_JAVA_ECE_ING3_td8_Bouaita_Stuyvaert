package TP2_123;

//Heritage
public class PileEntiers extends Pile {

    //empile un entier
    public void Empiler (Integer valeur)
    {
        //Utilisation de super pour redefinir la methode avec des Integer
        super.Empiler(valeur);
    }

    //depiler un entier
    public Integer depiler ()
    {
        //Cast avec (Integer)
        //Utilsation de super pour redefinir en castant la valeur renvoyer
        return (Integer) super.Depiler();
    }

    public Integer sommet() {
        //Cast avec (Integer)
        return (Integer) super.sommet();
    }



}

