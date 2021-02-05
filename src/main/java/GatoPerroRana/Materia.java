
package GatoPerroRana;


public class Materia {
    String nombre;
    
    double calificacion(double p1, double p2, double p3){
           double promedio = (p1+p2+p3)/3;
           System.out.println("La calificacion en "+nombre+" es: "+promedio);
           return promedio;
    }
    
    void  aprobo(double promedio){
        if(promedio>=7){
            System.out.println("Aprobo la materia (= ");
        }else{
            System.out.println("Reprobo la materia |= ");
        } 
    }
         
    void sumar(int n1, int n2, int n3, int n4){
        int suma = n1+n2+n3+n4;
        System.out.println("\n \n  Suma: "+suma);
    }
    
    void sumarInfinito(int... numeros){
        int suma=0;
         for(int i=0; i< numeros.length; i++)
            suma=suma+ numeros[i]; // suma+= numeros[i];
         
         System.out.println("Suma infinita: "+suma);
    }
    
}
