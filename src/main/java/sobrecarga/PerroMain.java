
package sobrecarga;

public class PerroMain {

    
    public static void main(String[] args) {
       
        Perro perro1= new Perro();
        Perro perro2= new Perro("Roki","Chihuhua", "Jose");
        
        System.out.println(perro1.nombre); //nombre ess nullo
        System.out.println(perro2.nombre); // nombre es roki
        
        perro1.nombre="Pancracio";
        System.out.println(perro1.nombre);
        
        
        Perro perro3 = new Perro("Roki","Chihuhua");
        
         
        
        
    }
    
}
