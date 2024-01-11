package exercice1;

import exercice1.Point;

public class Main {
 public static void main(String[] args) {
        Point point=new Point('B',2.3);



     System.out.println("Caractéristiques du point initial :");
        point.Affiche();
        point.Translation(2);
     System.out.println("Caractéristiques du point final:");
        point.Affiche();

 }}
