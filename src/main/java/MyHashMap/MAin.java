
package MyHashMap;

import java.util.ArrayList;
import java.util.HashMap;


public class MAin {


    public static void main(String[] args){
    
        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Fabian");
        listaNombres.add("Axel");
        listaNombres.add("Luis");
        System.out.println(listaNombres);
        listaNombres.set(1, "Gerardo");
        System.out.println(listaNombres);
        listaNombres.remove(2);
        System.out.println(listaNombres);
        System.out.println(listaNombres.get(0));
        
        
        HashMap<String,String> listaCapitales = new  HashMap<String, String>();
        
        listaCapitales.put("Sonora","Hermosillo");
        listaCapitales.put("BC","Mexicali");
        listaCapitales.put("Chihuahua","Chihuahua");
        listaCapitales.put("NuevoLeon", "Monterrey");
        
        System.out.println(listaCapitales);
        System.out.println(listaCapitales.get("Sonora"));
        listaCapitales.remove("Chihuahua");
         System.out.println(listaCapitales);
        
         listaCapitales.clear();
         System.out.println(listaCapitales);
         
    }
    
}
