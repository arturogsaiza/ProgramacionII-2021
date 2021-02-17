
package herenciaAnimal;


public class Main {


    public static void main(String[] args) {
    
       // Animal animal = new Animal("asdsa");
        
        Perro scooby = new Perro("corto","grande","Cafe","Scooby Doo");
        
        System.out.println(scooby.getNombre());
        scooby.expresarse();
        
        Chihuahua  kevin = new Chihuahua("iphone", "Chakira", "fino", "chico", "miel", "El kevin");
        
        System.out.println(kevin.getNombre());
        kevin.expresarse();
        
        
    }
    
}
