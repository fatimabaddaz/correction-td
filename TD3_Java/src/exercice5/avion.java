package exercice5;

public class avion extends Vehicule {
    private int nbMoteur;
    public avion(int nbP) {
        super(nbP,2);
    }

    public avion(int nbP, int nbM) {
        super(nbP, 2);
        this.nbMoteur = nbM;
    }

    @Override
    public String toString() {
        return "avion{" +
                "nbMoteur=" + nbMoteur +
                '}';
    }
}

