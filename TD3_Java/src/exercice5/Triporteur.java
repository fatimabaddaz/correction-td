package exercice5;

public class Triporteur extends Moto {
    private int capaciteCharge;
    public Triporteur(int n) {
        super(n);
    }

    public Triporteur(int n, int capaciteCharge) {
        super(n);
        this.capaciteCharge = capaciteCharge;
    }

    @Override
    public String toString() {
        return "Triporteur{" +
                "capaciteCharge=" + capaciteCharge +
                '}';
    }

}

