package exercice2;

public class Main {
    public static void main(String[] args) {
        PointNom pointNom = new PointNom(3, 5, "Point A");
        pointNom.affCoordNom();

        // Modification des coordonnées et du nom
        pointNom.setPointNom(7, 9, "Point B");
        pointNom.affCoordNom();

        // Modification uniquement du nom
        pointNom.setNom("Point C");
        pointNom.affCoordNom();
    }
}
