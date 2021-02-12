package Modificadores1;

// public: acceso desde cualquier lugar (paquete o proyecto)
// dafault o package: acceso desde esta clase y otras clases del mismo paquete 
// protected: Des el misma clase o desde clases hijas
// private: acceso solo dentro de la misma clase (este archivo)

 public class Dinosaurio{

      String nombre;
      private  String apodo;
      public int edad;
      private String color;
      
      public Dinosaurio(){
      
      }

    public Dinosaurio(String nombre, int edad, String color, String apodo) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.apodo = apodo;
    }
    
    public String mostrarApodo(){
     return this.apodo;
    }
      
      public void comer(){
          System.out.println(nombre+" esta comiendo y es de color"+this.color); 
           this.dormir();
      }
      
      void correr(){
          System.out.println(nombre+" esta corriendo");
           this.dormir();
      }
 
      private void dormir(){
          System.out.println(nombre+" esta durmiendo");
      }
 
    
}
