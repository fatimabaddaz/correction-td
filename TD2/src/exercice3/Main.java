package exercice3;

public class Main {
    public static void main(String[] args) {
        // Création d'un livre avec le premier constructeur
        Livre livre1 = new Livre();
        
        // Affichage des détails du livre
        afficherDetailsLivre("Livre 1", livre1);

        // Création d'un livre avec le deuxième constructeur
        Livre livre2 = new Livre("Java Programming", "John Doe");
        
        // Affichage des détails du deuxième livre
        afficherDetailsLivre("Livre 2", livre2);

        // Création d'un livre avec le troisième constructeur
        Livre livre3 = new Livre("Design Patterns", "Gang of Four", 29.99);
        
        // Affichage des détails du troisième livre
        afficherDetailsLivre("Livre 3", livre3);

        // Création d'un livre avec le quatrième constructeur
        Livre livre4 = new Livre("Clean Code", "Robert C. Martin", 39.99, 2020);
        
        // Affichage des détails du quatrième livre
        afficherDetailsLivre("Livre 4", livre4);

        // Création d'un livre en utilisant le constructeur de copie
        Livre livreCopie = new Livre(livre4);

        // Affichage des détails du livre copié
        afficherDetailsLivre("Livre Copié", livreCopie);
    }

    // Méthode pour afficher les détails d'un livre
    private static void afficherDetailsLivre(String titre, Livre livre) {
        System.out.println(titre + ":");
        System.out.println("Titre: " + livre.getTitre());
        System.out.println("Auteur: " + livre.getAuteur());
        System.out.println("Prix: " + livre.getPrix());
        System.out.println("Année: " + livre.getAnnee());
        System.out.println();
    }
}

