
package MyInput;

import  java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
     
        Scanner  leer = new Scanner(System.in);
    
        System.out.println("Ingresa tu nombre");
        String nombre =  leer.nextLine();
       // leer.next(); //solo una palabra
       // leer.hasNextLine(); // toda una frase
        System.out.println("En que año naciste?");
        int anio = leer.nextInt();  leer.nextLine();
        int edad = 2021 - anio;
        
        System.out.println("ciudad:");
        String ciudad = leer.nextLine();
        
        System.out.println("Tienes internet?");
        boolean tieneInternet =leer.nextBoolean();
         
                
        System.out.println("Hola "+nombre);
        System.out.println("Tienes "+edad+" años!");
        System.out.println("Eres de  "+ciudad );
        
        if(tieneInternet){
            System.out.println("Si tienes internet");
        }else{
            System.out.println("No tiene internet");
        }
    
    
        
        
        
        
    }
    
}
