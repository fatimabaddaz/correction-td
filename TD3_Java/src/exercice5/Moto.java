package exercice5;

public class Moto extends Vehicule{
	   private int nbRoues=2;
	    public Moto(int n) {
	        super(n, 2);
	    }

	    @Override
	    public String toString() {
	        return "Moto{" +
	                "nbRoues=" + nbRoues +
	                '}';
	    }
	}

