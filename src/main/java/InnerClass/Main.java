package InnerClass;

public class Main {

    
    public static void main(String[] args) {
      
        ClaseExterna ce = new ClaseExterna();        
        System.out.println(ce.name);
        
        ClaseExterna.ClaseInterna ci =  ce.new ClaseInterna();        
        System.out.println(ci.name);
        
        ClaseExterna.ClaseInterna.ClaseMasInterna cim = ci.new ClaseMasInterna();
        System.out.println(cim.nombre);
        
        
        ClaseExterna.ClaseInterna.ClaseMasInterna.ClaseAunMasInterna cami = cim.new ClaseAunMasInterna();
        
        System.out.println( cami.nombre);
        
        
    }
    
}
