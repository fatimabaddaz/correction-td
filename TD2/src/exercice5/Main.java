package exercice5;

public class Main {
    
       
    	public static void main(String[] args) {
    		Rectangle rectangle = new Rectangle(5,7);
    		
    		rectangle.perimetre();
    		rectangle.aire();
    		rectangle.isCarre();
    		
    		System.out.println(rectangle);
    		System.out.println(rectangle.perimetre());
    		
    	}


    private static void afficherRectangle(String titre, Rectangle rectangle) {
        System.out.println(titre + ": " + rectangle);
    }}