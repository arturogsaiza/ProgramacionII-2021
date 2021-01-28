package MyClass;

import MyClass.Tripulante;

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
        tCian.impostor= false;
        
        tAmarillo.verInfo();
        tNaranja.verInfo();
        tCian.verInfo();
        
        
       
        
    }
    
}
