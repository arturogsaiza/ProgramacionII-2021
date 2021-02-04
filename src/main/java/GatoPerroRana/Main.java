package GatoPerroRana;

import MyClass.Estudiante;

public class Main {


    public static void main(String[] args) {
      
        Gato garfield = new Gato();
        Perro odie = new Perro();
        Rana rene = new Rana();
       // Estudiante luis = new Estudiante();
        
        garfield.color="Naranja";
        garfield.edad=10;
        garfield.patas="Cortas";
        garfield.pelaje="liso";
        garfield.raza="Desconocido";
        garfield.tamanio="md";
        
        odie.color="Amarillo";
        odie.edad=3;
        odie.patas="largas";
        odie.rasa="nose";
        odie.tamaño="chico";
        
        rene.color="verde";
        rene.especie="nose";
        rene.tamano="Grande";
        rene.texturaPiel="Peluche";
        rene.venenosa=true;
        
        garfield.maullar();
        System.out.println("\n garfield es de color "+garfield.color);
        garfield.seguidoresEnTikTok(999999);
        garfield.seguidoresEnTikTok(1000001);
        
        System.out.println("\n Oide es de patas "+odie.patas); 
        odie.ladrar();
        odie.nacimiento(2021); 
        odie.nacimiento(2022);  
        odie.nacimiento(2050); 
       
        System.out.println("\n La piel de la rana rene es de "+rene.texturaPiel);
        rene.croar();
        rene.brincar(1.5);
        rene.brincar(6.75);
    }
    
}
