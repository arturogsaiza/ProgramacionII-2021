
package sobrecarga;

public class MiSobrecarga {
    
    
    void imprimir(String dato){   
        System.out.println("Estamos imprimiendo el siguiente String: "+dato); 
    }
    
    void imprimir(int dato){   
        System.out.println("Estamos imprimiendo el siguiente Numero Entero: "+dato); 
    }
    
    void imprimir(char dato){   
        System.out.println("Estamos imprimiendo el siguiente caracter: "+dato); 
    }
    
    void imprimir(String dato, String dato2){   
        System.out.println("Estamos imprimiendo los siguiente String: "+dato+" y "+dato2); 
    }
    
    void imprimir(int dato, int dato2){   
        System.out.println("Estamos imprimiendo los siguiente Numeros Enteros: "+dato+" y "+dato2+" y suman: "+(dato+dato2)); 
    } 
    
   void imprimir(String nombre, int edad){   
        System.out.println("hola "+nombre+" tienes "+edad+" años "); 
    }
   
     void imprimir(String dato, int ... numeros){   
         System.out.println("Imprimiendo el string: "+dato);
         
         for (int j = 0; j < numeros.length; j++) {
              System.out.print(numeros[j]+" ");
         }
    }
    
     
}
