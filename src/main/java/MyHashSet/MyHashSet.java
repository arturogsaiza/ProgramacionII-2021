 
package MyHashSet;

import java.util.HashSet;

 
public class MyHashSet {

   
    public static void main(String[] args) {
     
         HashSet<String> ListaCarros = new HashSet<String>();
         ListaCarros.add("Volvo");
         ListaCarros.add("BMW");
         ListaCarros.add("Ford");
         ListaCarros.add("Mazda"); 
         
         System.out.println(ListaCarros);
         
         System.out.println(ListaCarros.contains("Mazda"));
         System.out.println(ListaCarros.contains("BOCHO"));
         
         ListaCarros.remove("BMW");
          System.out.println(ListaCarros);
          
          
         // ListaCarros.clear();
         //   System.out.println(ListaCarros);
         
         System.out.println(ListaCarros.size());
         
         for(String c : ListaCarros){
         
             System.out.println("carro: "+c);
         
         }
         
         
        
    }
    
}
