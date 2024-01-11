package exercice3;

public class Centre extends Point{
    private String nom;
    public Centre(int x, int y,String nom) {
        super(x, y);
        this.nom=nom;
    }
    public void affNom(){
        System.out.println("le nom est" +nom);
    }
    public void affiche(){
        System.out.println("le nom de centre est :"+nom );


    }

}

