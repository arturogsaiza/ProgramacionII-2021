
package herenciaAnimal;


// Las clases final no se pueden utilizar como herencia
public final class Chihuahua extends  Perro{
    
    private String juguete;
    private String estilista;

    public Chihuahua(String juguete, String estilista, String pelaje, String tamaño, String color, String nombre) {
        super(pelaje, tamaño, color, nombre);
        this.juguete = juguete;
        this.estilista = estilista;
    }

    public String getJuguete() {
        return juguete;
    }

    public void setJuguete(String juguete) {
        this.juguete = juguete;
    }

    public String getEstilista() {
        return estilista;
    }

    public void setEstilista(String estilista) {
        this.estilista = estilista;
    }
   
    
   
    
    public void enfadar(){
        System.out.println("chihuahua engfadando");
    }

    @Override
    public void expresarse() {
        System.out.println("grrrrrrr!");
          //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
