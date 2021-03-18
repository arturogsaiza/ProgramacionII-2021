
package MyIterator;

import java.time.LocalDate;


public class Noticia {

    String titulo;
    String descripcion;
    LocalDate fecha;
    
    
    public Noticia(String titulo, String descripcion, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = LocalDate.parse(fecha);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    


    
 
    
    
}
