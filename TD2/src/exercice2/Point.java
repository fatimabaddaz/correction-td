package exercice2;

public class Point {
    private  double abscisse;
    private  double ordonne;

    public Point(double abscisse,double ordonne)
    {
        this.abscisse = abscisse;
        this.ordonne= ordonne;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(double ordonne) {
        this.ordonne = ordonne;
    }
    public double Norme(){
        return Math.sqrt(abscisse*abscisse + ordonne*ordonne);
    }
}


