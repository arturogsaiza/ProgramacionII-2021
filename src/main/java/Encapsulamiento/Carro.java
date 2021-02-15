
package Encapsulamiento;


public class Carro {
   
   private  String marca;
   private  String modelo;
   private int anio;
   
    public Carro(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
   
   // Get y Set
   // GET:  Consultar informacion de un atributo
   // SET: Asignar un valor a un atributo
    
    public String getMarca(){
         return this.marca;
    }
    
    public void setMarca(String newMarca){
        this.marca = newMarca;
    }
    
    public String getModelo(){
     return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    

  
   
   
   
    
}
