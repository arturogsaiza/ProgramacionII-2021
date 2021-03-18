
package MySwing.formulario;

public class Mascota {
    
    private String Nombre;
    private String tipo;
    private String dueno;
    private String color;
    private String sexo;
    private int edad;

    public Mascota(String Nombre, String tipo, String dueno, String color, String sexo, int edad) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.dueno = dueno;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" + "Nombre=" + Nombre + ", tipo=" + tipo + ", dueno=" + dueno + ", color=" + color + ", sexo=" + sexo + ", edad=" + edad + '}';
    }

    
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
