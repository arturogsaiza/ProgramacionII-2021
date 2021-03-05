
package MyInput;

import java.util.Scanner;

public class MainC {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Nombre:");
        String nombre =  leer.nextLine();
        
        System.out.println("Año de nacimiento:");
        int anioNacimiento = Integer.parseInt(leer.nextLine());
       
        System.out.println("Tienes Internet?");
        boolean tienesInternet = Boolean.parseBoolean(leer.nextLine());
        
        System.out.println("Ciudad:");
        String ciudad = leer.nextLine();
        
        System.out.println(" - -- - -- - - - - -  -");
        System.out.println("Hola "+nombre);
        System.out.println("Tienes "+(2021-anioNacimiento)+" años");
        System.out.println("Eres de "+ciudad);
        if(tienesInternet){
            System.out.println("Tienes internet!");
        }else{
            System.out.println("No tienes internet!");
        }
    }
    
}
