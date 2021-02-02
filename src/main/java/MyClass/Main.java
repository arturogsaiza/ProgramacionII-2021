package MyClass;

import MyClass.Tripulante;

public class Main {

 
    public static void main(String[] args) {
        
      String tripulante1 = "amongus 1";
      String tripulante2 = new String("tripulante 2");

       System.out.println("tripulantec1: "+tripulante1);
       System.out.println("tripulantec2: "+tripulante2);
       
       Tripulante tripulante3 = new Tripulante();       
        System.out.println(tripulante3);
        tripulante3.nombre="Juanito";
        tripulante3.color="Amarillo";
        tripulante3.impostor= false;
        tripulante3.mascota="perro";
        tripulante3.sombrero="casco astronauta";
        tripulante3.estado=true;
        
        System.out.println(tripulante3.nombre);
        System.out.println(tripulante3.color);
        System.out.println(tripulante3.mascota);
        
        if(tripulante3.impostor){
            System.out.println("Es el impostor");
        }else{
             System.out.println("Es tripulante");
        }
       //  Tripulante tripulante;
        
        
    }
    
}
