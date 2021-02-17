
package herenciaAnimal;

//Clase normal pude instanciarce y tambien puede utlizarce cmo herencia
public class Perro extends Animal{
    
    private String pelaje;
    private String tamaño;
    private String color;

    public Perro(String pelaje, String tamaño, String color, String nombre) {
        super(nombre);
        this.pelaje = pelaje;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    

    
    @Override
    public void expresarse(){
        System.out.println("Guau Guau!!");
    }
    
    
    
    
}
