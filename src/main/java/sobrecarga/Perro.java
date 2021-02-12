
package sobrecarga;

 
public class Perro {
   
   String nombre;
   String raza;
   String dueno;
   
   Perro(){
       System.out.println("Construyendo el objeto perro");
   }
   
   Perro(String nombre, String raza, String dueno){
       System.out.println("Construyendo el objeto perro e inicializando sus atributos");
       this.nombre= nombre;
       this.raza= raza;
       this.dueno= dueno;
   }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
   
    
   
   
   
   
   
   
   
   
   
   
   
}
