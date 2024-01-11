package exercice5;

public class Rectangle {
    private double longueur;
    private double largeur;

    
    public Rectangle() {
      
    }

   
    public Rectangle(double longueur, double largeur) {
        this.setLongueur(longueur);
        this.setLargeur(largeur);
    }

  
    public Rectangle(Rectangle autreRectangle) {
        this.longueur = autreRectangle.longueur;
        this.largeur = autreRectangle.largeur;
    }

    
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("La longueur doit être positive. La valeur par défaut (0) a été attribuée.");
            this.longueur = 0;
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("La largeur doit être positive. La valeur par défaut (0) a été attribuée.");
            this.largeur = 0;
        }
    }

    
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

   
    public double aire() {
        return longueur * largeur;
    }

   
    public boolean isCarre() {
        return longueur == largeur;
    }

   
    @Override
    public String toString() {
        return String.format("Rectangle [Longueur=%.2f, Largeur=%.2f]", longueur, largeur);
    }
}
