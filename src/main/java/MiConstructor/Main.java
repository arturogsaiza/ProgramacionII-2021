package MiConstructor;

public class Main {

    public static void main(String[] args) {
      Tripulante t1= new Tripulante(); 
      t1.color="Amarillo";
      t1.estado=true;
      t1.impostor= true;
      t1.mascota="Mini Tripulante";
      t1.nombre="Juanita";
      t1.sombrero="Fiesta";
      
      Tripulante t2= new Tripulante(); 
      t2.color="Verde";
      t2.estado=true;
      t2.impostor= false;
      t2.mascota="Perrito";
      t2.nombre="Jose";
      t2.sombrero="ninguno";
      
      Tripulante t3 = new Tripulante(); 
      t3.color="Rojo";
      t3.estado=true;
      t3.impostor= false;
      t3.mascota="Perrito";
      t3.nombre="Pepe";
      t3.sombrero="ninguno";
      
      t3.hacerTarea();
      
      
        
    }
    
}
