/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySwing.enviarinfo;

/**
 *
 * @author Arturo
 */
public class Alumno {
    
    private String nombre;
    private String apellido;
    private String apodo;

    public Alumno(String nombre, String apellido, String apodo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
    }

    
    
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

  

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
