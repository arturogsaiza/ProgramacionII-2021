
package myDate;

import java.time.LocalDate;


public class myLocalDate {
   
    public static void main(String [] args){
    
        LocalDate fecha1= LocalDate.of(1992, 2, 16); 
        System.out.println(fecha1);
        
        LocalDate fecha2= LocalDate.parse("1992-02-16");
        System.out.println(fecha2);
        System.out.println(fecha2.withYear(2021));
         
    
    
    
    }
    
}
