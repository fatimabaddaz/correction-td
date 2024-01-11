package exercice1;

public class Point {
    private char nom;
    private double abscisse;



    public Point(char nom, double abscisse) {
        this.nom=nom;
        this.abscisse = abscisse;
    }

    public void Affiche(){
        System.out.println("Nom du point : " + nom );
        System.out.println("Abscisse : " + abscisse);

    }
    public void Translation(double dx)
    {
        abscisse+=dx;
    }
}

