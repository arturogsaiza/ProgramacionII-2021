
package Modificadores2;

import Modificadores1.Dinosaurio;


public class Main2 {

    
    public static void main(String[] args) {
        
        Dinosaurio d1 = new Dinosaurio("Barnie", 50, "morado", "el moradillo");
   
           int edad = d1.edad;
           System.out.println(edad);
            
           System.out.println(d1.mostrarApodo());
            
           
    
    }
    
}
