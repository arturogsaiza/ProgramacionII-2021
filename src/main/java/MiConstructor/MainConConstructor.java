
package MiConstructor;

public class MainConConstructor {

    public static void main(String[] args) {
       
        Tripulante t1 = new Tripulante("Pepe","Rojo","Fiesta","Perrito",false, true);
        Tripulante t2 = new Tripulante("Jose","Verde","","Perrito",false, true);
        Tripulante t3 = new Tripulante("Juanita","Amarillo","Fiesta","",true, true);
     
        System.out.println("\n t1 se llama "+t1.nombre+" y es de color "+t1.color);
        System.out.println("t2 se llama "+t2.nombre+" y es de color "+t2.color);
        System.out.println("t3 se llama "+t3.nombre+" y es de color "+t3.color);
        
        t3.color="Azul";
        System.out.println("Ahora t3 es de color "+t3.color);
        
        
    }
    
}
