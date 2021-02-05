package GatoPerroRana;

import MyClass.Estudiante;

public class Main {


    public static void main(String[] args) {
      
        Gato garfield = new Gato();
        Perro odie = new Perro();
        Rana rene = new Rana();
        Estudiante juanita = new Estudiante();
        
        
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
        
        juanita.nombre="juanita";
        juanita.apellido="Perez";
        juanita.anionacimiento=2002;
        juanita.carrera="Ingenieria en Software";
        
        juanita.saludo("Pepe");
        juanita.saludo("Ramon");
        juanita.saludo("Luis");
        juanita.saludo("Fabian");
        juanita.saludo("Jesus");
        juanita.saludo("Taisa");
        
        
        Materia  m1 = new Materia();
        m1.nombre="\n Estructura de Datos";
        double promedio = m1.calificacion(9, 7.5, 8);
        m1.aprobo(promedio);
        
        Materia  m2 = new Materia();
        m2.nombre="Programación 2";
        promedio = m2.calificacion(5, 6, 4.5);
        m2.aprobo(promedio);
        
        m2.sumar(5, 5,4,4);
        m2.sumarInfinito(2,6,8,10,12,14,6,1,2,3,4,5,666);
       
       
        
        
    }
    
}
