package Modificadores1;

public class Main {

    public static void main(String[] args) {
      Dinosaurio dino = new Dinosaurio("Dino", 5000000, "rojo","sd");
        //default se pueden acceder porque estan dentro del mismo paquete
        System.out.println( dino.nombre);
        dino.correr();
        
        //public: se pueden acceder desde cualquier lugar
        System.out.println(dino.edad);
        dino.comer();
        
        
        
    }
    
}
