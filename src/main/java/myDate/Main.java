package myDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String[] args) {
     
        LocalDate fecha =  LocalDate.now();        
        System.out.println(fecha);
    
        LocalTime hora = LocalTime.now();        
        System.out.println(hora);
        
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);
        
        // DateTimeFormatter formato =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formato =  DateTimeFormatter.ofPattern("  E dd/MM/yyyy");
        
        String fechaFormateada = formato.format(fechaHora);
         
        System.out.println("Hoy es: "+fechaFormateada);
        
        
        
        
    }
    
}
