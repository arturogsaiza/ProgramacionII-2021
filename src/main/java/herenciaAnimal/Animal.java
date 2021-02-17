
package herenciaAnimal;

// Las clases Abstract no se pueden instanciar
public abstract class Animal {
    
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void expresarse(){
        System.out.println("ruidoss!!");
    }
    
}
