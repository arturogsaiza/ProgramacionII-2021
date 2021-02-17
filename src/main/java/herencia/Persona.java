
package herencia;


public class Persona {
  protected String nombre;
  protected String apellidoUno;
  protected String apellidoDos;
  protected String fechaNacimiento;
  protected int telefono;
  protected int edad;
  protected String ciudad;
  protected String colonia;

    public Persona(String nombre, String apellidoUno, String apellidoDos, String fechaNacimiento, int telefono, int edad, String ciudad, String colonia) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.edad = edad;
        this.ciudad = ciudad;
        this.colonia = colonia;
    }
    
    public Persona(){}
  
  public void comer(){
      System.out.println(this.nombre+" come!");
  }
  
    public void dormir(){
      System.out.println(this.nombre+" duerme!");
  }
    
  public void caminar(){
      System.out.println(this.nombre+" camina");
  }
  
  public String getNombre(){
      return this.nombre;
  }
  
  public void setNombre(String nombre){
  this.nombre = nombre;
  }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int  getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }  
  
  
  
  
    
    
}
