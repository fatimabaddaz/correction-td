package exercice4;

public class Main {
    public static void main(String[] args) {
        // Test des constructeurs
        Temps temps1 = new Temps(); // 00:00:00
        Temps temps2 = new Temps(10); // 10:00:00
        Temps temps3 = new Temps(5, 30); // 05:30:00
        Temps temps4 = new Temps(2, 45, 15); // 02:45:15
        Temps temps5 = new Temps(temps4); // Copie de temps4

        // Affichage des temps
        afficherTemps("Temps 1", temps1);
        afficherTemps("Temps 2", temps2);
        afficherTemps("Temps 3", temps3);
        afficherTemps("Temps 4", temps4);
        afficherTemps("Temps 5 (copie de temps4)", temps5);

        // Test des méthodes pour ajouter heures, minutes et secondes
        temps1.ajouterHeures(3);
        temps2.ajouterMinutes(75);
        temps3.ajouterSecondes(120);

        // Affichage des temps après les modifications
        afficherTemps("Temps 1 après ajout de 3 heures", temps1);
        afficherTemps("Temps 2 après ajout de 75 minutes", temps2);
        afficherTemps("Temps 3 après ajout de 120 secondes", temps3);
    }

    // Méthode pour afficher les détails d'un temps
    private static void afficherTemps(String titre, Temps temps) {
        System.out.println(titre + ": " + temps);
    }
}

