
package MyArrayList;

import java.util.ArrayList;


public class MainPersona {

    public static void main(String[] args) {
      
        ArrayList <Persona> listaPersonas = new ArrayList<Persona>();
    
        Persona p1 = new Persona("Paulina",18,"622123");
        listaPersonas.add(p1);
        
        Persona p2 = new Persona("Damian",18,"622124"); 
        listaPersonas.add(p2);
         
        listaPersonas.add( new Persona("Ramon",18,"622124"));
        listaPersonas.add( new Persona("Daniel",18,"622125"));
                  
        for(Persona p :listaPersonas ){
             System.out.println(p.getNombre()+" | "+p.getEdad());
        }
        
        
        
    }
    
}
