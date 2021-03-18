
package MyIterator;

import java.util.ArrayList;
import java.util.Iterator;


public class MAin {


    public static void main(String[] args) {
         String car="";
         
        ArrayList<String> listaCarros = new ArrayList<String>();
         listaCarros.add("Volvo");
         listaCarros.add("BMW");
         listaCarros.add("Ford");
         listaCarros.add("Mazda"); 
         
         for(String carro :listaCarros ){
             System.out.println("con for: "+carro);
         }
         
         Iterator<String> carroIterator =  listaCarros.iterator();
         
         car = carroIterator.next();
         System.out.println("con iterator "+car);
         
         car = carroIterator.next();
         System.out.println("con iterator "+car);
         
         car = carroIterator.next();
         System.out.println("con iterator "+car);
         
         car = carroIterator.next();
         System.out.println("con iterator "+car);
         
         
       
        
    }
    
}
