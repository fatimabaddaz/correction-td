package exercice1;

public class PointA extends Point{
    private int x,y;
    
    public PointA(int x, int y) {
        super(x, y);
    }


      
        public void affiche() {
            System.out.println("Coordonnées du point est(" + getX() + " et " + getY() + ")");
        }
    }

