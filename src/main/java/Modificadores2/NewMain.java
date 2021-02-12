package Modificadores2;

import  Modificadores1.Dinosaurio;

public class NewMain {

    public static void main(String[] args) {
      Dinosaurio dino = new Dinosaurio("Dino", 5000000, "rojo","");
      System.out.println( dino.edad);  
      dino.comer();
        
    }
    
}
