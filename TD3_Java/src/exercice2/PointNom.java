package exercice2;

public class PointNom extends Point{
    private String nom;
    private int x;
    private int y;
    public PointNom(int x, int y,String nom) {
        super(x, y);
        this.nom=nom;
    }
    public void setPointNom(int x, int y, String nom) {
        super.deplace(x - getX(), y - getY());
        this.nom = nom;
    }

    private int getY() {return y;
    }

    private int getX() {
        return x;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnées : " + getX() + " " + getY() + ", Nom : " + nom);
    }

}
