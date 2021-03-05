
package MyArrayList;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayListInt {


    public static void main(String[] args) {
      
        ArrayList <Integer> numeros =  new ArrayList<Integer>();
        
        numeros.add(5);
        numeros.add(-21);
        numeros.add(-2);
        numeros.add(1);
        numeros.add(66);
        numeros.add(-9);
        numeros.add(100);
        numeros.add(0);
        
        
        
        System.out.println(numeros);
        
        numeros.set(1, 8);
        
        
        System.out.println(numeros);
        
         Collections.sort(numeros); 
         
         System.out.println(numeros);
        
        
        
    }
    
}
