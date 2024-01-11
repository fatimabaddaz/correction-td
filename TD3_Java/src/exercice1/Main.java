package exercice1;

public class Main {
    public static void main(String[] args) {
        Point point=new Point(3,2);
        PointA pointA=new PointA(2,3);

        point.deplace(2, 2);
        pointA.deplace(1, -1);

        // Affichage des coordonnées
        System.out.println("Coordonnées du point : (" + point.getX() + ", " + point.getY() + ")");
        pointA.affiche();
        }

}
