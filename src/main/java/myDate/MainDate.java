package myDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class MainDate {
    
    public static void main(String [] args){
    
        LocalDate fecha = LocalDate.of(2002, 9, 10);
        LocalDate fecha2 = LocalDate.parse("2002-10-15");
        System.out.println(fecha);
        System.out.println(fecha2);
        
        System.out.println("dia del mes: "+ fecha.getDayOfMonth());
        System.out.println("dia de la semana: "+ fecha.getDayOfWeek());
        System.out.println("dia del año: "+ fecha.getDayOfYear());
        System.out.println("mes: "+ fecha.getMonth());
        System.out.println("mes: "+ fecha.getMonthValue());
        System.out.println("Año: "+ fecha.getYear());
        System.out.println("Año bis: "+ fecha.isLeapYear());
        
        if(fecha.isBefore(fecha2)){
            System.out.println("Fabian es más grande que Taisa");
        }else{
             System.out.println("Taisa es más grande que Fabian");
        }
        
        if(LocalDate.parse("2002-02-02").isAfter(LocalDate.parse("2010-02-02"))){
             System.out.println("es despues");
        }else{
             System.out.println("es antes");
        }
        
        System.out.println(fecha2+":  mas 25 dias: "+  fecha2.plusDays(25));
        System.out.println(fecha2+":  mas  20 semanas: "+  fecha2.plusWeeks(20));
        System.out.println(fecha2+":  mas  6 meses: "+  fecha2.plusMonths(6));
        System.out.println(fecha2+":  mas  5 años: "+  fecha2.plusYears(5));
        
        LocalDate fecha3 = fecha2.plusDays(25);
        fecha3 = fecha3.plusWeeks(20);
        fecha3 = fecha3.plusMonths(6);
        fecha3 = fecha3.plusYears(5);        
        System.out.println(fecha3);
        
        System.out.println("dias del mes: "+fecha3.lengthOfMonth());
        System.out.println("dias del mes: "+fecha3.lengthOfYear());
        
        

        System.out.println("--------------LOCAL TIME ----------------");
         
        LocalTime hora1 = LocalTime.now();
        System.out.println(hora1); 
        
         LocalTime hora2 = LocalTime.of(7,00);
         System.out.println(hora2);
         
         LocalTime hora3 = LocalTime.parse("08:00");
         System.out.println(hora3);
         
         if(hora3.isBefore(hora1)){
             System.out.println("Ya salimos");
         }else{
             System.out.println("Aun no salimos");
         }
         
         LocalTime horaRetardo = hora2.plusMinutes(15);
         if(hora1.isAfter(horaRetardo)){
             System.out.println("Llego tarde");
         }else{
             System.out.println("Llego a tiempo");
         }
        
         System.out.println(" -----------FECHA CON SCAENNER ----------------");
        
         Scanner leer = new Scanner(System.in);
         
         
        System.out.println("Ingresa tu fecha de nacimiento");
        System.out.println("dia:");
        int dia = Integer.parseInt(leer.next());
        
        System.out.println("Mes:");
        int mes = Integer.parseInt(leer.next());
        
        System.out.println("Año:");
        int anio = Integer.parseInt(leer.next());
        
        LocalDate fechaNacimiento =  LocalDate.of(anio,mes, dia);
        
        System.out.println("Naciste en: "+fechaNacimiento.getDayOfWeek());
        
        
         
         
        
    }
}
