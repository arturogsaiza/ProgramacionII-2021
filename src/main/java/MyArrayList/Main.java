
package MyArrayList;

import java.util.ArrayList; 
import java.util.Collections;


public class Main {


    public static void main(String[] args) {
       
        ArrayList<String> carros = new ArrayList<String>();
        
        
        carros.add("Mazda");
        carros.add("BMW"); 
        carros.add("Ford");
        
        System.out.println(carros);
        
        System.out.println(carros.get(1));
        
        carros.set(1,"Ferrari");
        System.out.println(carros);
        
        //carros.remove(1);
        System.out.println(carros);
        
        //carros.clear();
        System.out.println(carros);
        
         System.out.println("----   for  -----");
        for(int i=0; i <carros.size(); i++){
            System.out.println(carros.get(i));
        }
        
        System.out.println("----   for each -----");
        for(String  car : carros ){
            System.out.println(car);
        }
        
        System.out.println(carros);
        Collections.sort(carros);        
        System.out.println(carros);
        
        
        
        
    }
    
}
