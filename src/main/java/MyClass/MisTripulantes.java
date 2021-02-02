package MyClass;

import MyClass.Tripulante;
import MyClass.Partida;

public class MisTripulantes {
    
    public static void main(String[] args) {
    
        //  instanciar objeto  - declarar variable
        Tripulante tAmarillo;
        Tripulante tNaranja; 
               
        // inicializar objetos
        tAmarillo = new Tripulante();
        tNaranja = new Tripulante();
       
        //objeto instanciado e inicializado al mismo tiempo
        Tripulante tCian = new Tripulante(); 
        
        tAmarillo.nombre= "Juanito";
        tAmarillo.color="Amarillo";
        tAmarillo.sombrero="Mini tripulante";
        tAmarillo.mascota="ninguno";
        tAmarillo.impostor=false;
        
        tNaranja.nombre="Nick";
        tNaranja.color="naranja";
        tNaranja.sombrero = "Cowboy";
        tNaranja.mascota="Perrito";
        tNaranja.impostor= true;
        
        tCian.nombre="Pancho";
        tCian.color="Cian";
        tCian.sombrero="Huevito";
        tCian.mascota="Hamster";
        tCian.impostor= true;
        
        /*
        tAmarillo.verInfo();
        tNaranja.verInfo();
        tCian.verInfo();
        */
        
        //Este es un comentario
        
        Mapa mapa1 = new Mapa();
        mapa1.nombre="Polus";
        
       /*  Partida   */
       Partida p1 = new Partida();
       
   
       p1.velocidad= 105.0;
       p1.tiempoVoto=40;
       p1.numeroTareas=5;
       p1.servidor="America";
       p1.rangoVision=1.0;
       p1.privado= true;
       p1.codigo="BDSFW";
       p1.mapa = mapa1;
       
       
        
        
        
        
        
       
        
    }
    
}
