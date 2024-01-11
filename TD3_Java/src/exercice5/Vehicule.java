package exercice5;

public class Vehicule {
    private int nbPassager;

    public Vehicule(int n, int i) {
        this.nbPassager = n;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }
}
