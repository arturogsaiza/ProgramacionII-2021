
package MyEnum;

public class Main {

    public static void main(String[] args) {
        
    Ciudad   ciudad = Ciudad.CAJEME;  
    
    
    System.out.println(ciudad);
     
    switch(ciudad){
        case GUAYMAS: System.out.println("Te recomendamos ir a los mortales! "); break;
        case HERMOSILLO: System.out.println("Te recomendamos no ir a los hotdogs de la unison! ") ; break;
        case CAJEME: System.out.println("Te recomendamos ir itson! ") ; break;
    }
    
    /*
     for(Ciudad c :  Ciudad.values()){
           System.out.println("Ciudad: "+c); 
     }
     */
     
     
     
        
        
    }
    
}
