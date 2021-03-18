 
package MySwing.comboBox;

 
public class Persona {
    
    String nombre;
    String apellidos;
    String colonia;

    public Persona(String nombre, String apellidos, String colonia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.colonia = colonia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return colonia;
    }

    public void setCiudad(String colonia) {
        this.colonia = colonia;
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.apellidos;
    }
    
    
    
    
}
