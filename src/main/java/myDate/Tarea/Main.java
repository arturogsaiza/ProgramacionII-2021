
package myDate.Tarea;

 


public class Main {


    public static void main(String[] args) {
      
        
    Persona CarlosDavid = new Persona("Carlos David", "2000-03-08");
    Persona Xochitl = new Persona("Xochilt Guadalupe","2002-12-09"); 
    Persona personaMayor;
   
        System.out.println( CarlosDavid.getNombre()+" --- "+CarlosDavid.getFechaNacimiento());
        System.out.println( Xochitl.getNombre()+" --- "+Xochitl.getFechaNacimiento());
    
    if(CarlosDavid.getFechaNacimiento().isBefore(Xochitl.getFechaNacimiento())){
        personaMayor= CarlosDavid;
        /*  System.out.println(CarlosDavid.getNombre()+" es mayor. ");
        
        if(CarlosDavid.getFechaNacimiento().isLeapYear()){
            System.out.println("Nacio en año bisiesto!!");
        }
      */  
        
    }else{
        personaMayor = Xochitl;
    /*    System.out.println(Xochitl.getNombre()+" es mayor. ");
   
        if(Xochitl.getFechaNacimiento().isLeapYear()){
            System.out.println("Nacio en año bisiesto!!");
        }
    */
    }
    
     System.out.println(personaMayor.getNombre()+" es mayor. ");
        
    if(personaMayor.getFechaNacimiento().isLeapYear()){
        System.out.println("Nacio en año bisiesto!!");
    }
    
    
    
    
    
    }
    
}
