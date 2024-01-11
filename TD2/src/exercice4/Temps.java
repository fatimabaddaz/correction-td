package exercice4;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    // Partie constructeurs 
    public Temps() {
        
    }
 public Temps(int heures) {
        this.heures = heures;
       
    }
  public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
        
    }
  public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }  public Temps(Temps autreTemps) {
        this.heures = autreTemps.heures;
        this.minutes = autreTemps.minutes;
        this.secondes = autreTemps.secondes;
    }

    //  Partie Accesseurs et mutateurs
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    // Méthodes pour ajouter heures, minutes et secondes
    public void ajouterHeures(int heures) {
        this.heures += heures;
        this.heures %= 24; // Assurer que les heures restent dans la plage de 0 à 23
    }

    public void ajouterMinutes(int minutes) {
        this.minutes += minutes;
        this.heures += this.minutes / 60;
        this.minutes %= 60;
        this.heures %= 24;
    }

    public void ajouterSecondes(int secondes) {
        this.secondes += secondes;
        this.minutes += this.secondes / 60;
        this.secondes %= 60;
        this.heures += this.minutes / 60;
        this.minutes %= 60;
        this.heures %= 24;
    }

    // Méthode Tosrting
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }
}

