package GatoPerroRana;

public class Gato {
    String pelaje;
    String color;
    String tamanio;
    int edad;
    String patas;
    String raza;
    
    public void maullar () {
        System.out.println("Miau");
        
        
    }
    
    public void ronronear () {
        System.out.println("****");
    }
    
    public void saltar () {
        System.out.println("Salta");
    }
    
    public void correr () {
        System.out.println("Corre");
    }
    
    public void seguidoresEnTikTok(int seguidores) { 
        System.out.println("Tiene "+seguidores+" en tiktok!");
        if(seguidores > 1000000){
            System.out.println("El gato es famoso!");
        }else{
             System.out.println("El gato aun no es famoso!");
        }
        
        
    }
        
        
}
