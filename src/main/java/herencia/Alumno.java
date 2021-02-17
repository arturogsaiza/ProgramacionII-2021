
package herencia;


public class Alumno extends Persona{    

    private String escuela;
    private String id;
    private String grado;
    private String carrera;
    
    public void estudiar(){
        System.out.println( this.nombre+" esta estudiando ");
    }
    
    public void hacerTarea(){
        System.out.println( this.nombre+" esta haciendo tarea ");
    }
    
    
    
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    
    
}
