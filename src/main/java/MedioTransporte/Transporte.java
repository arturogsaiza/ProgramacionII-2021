
package MedioTransporte;


public abstract class Transporte {
    
    private String nombre;
    private String dueno;

    public Transporte(String nombre, String dueno) {
        this.nombre = nombre;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
    
    public void avanzar(){
        System.out.println("Avanzando");
    }
    
    public void frenar(){
      System.out.println("frenar");
    }
}
