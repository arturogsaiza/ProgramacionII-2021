
package Encapsulamiento;


public class MainCar {


    public static void main(String[] args) {
        
        Carro aveo =  new Carro("Ford","Aveo", 2020);
       
        System.out.println(aveo.getMarca());
        aveo.setMarca("VW");
        System.out.println(aveo.getMarca());
        
        System.out.println(aveo.getModelo());
        aveo.setModelo("Jetta");
        System.out.println(aveo.getModelo());
        
        System.out.println(aveo.getAnio());
        aveo.setAnio(2021);
        System.out.println(aveo.getAnio());
        
    }
    
}
