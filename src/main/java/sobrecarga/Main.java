
package sobrecarga;


public class Main {


    public static void main(String[] args) {
      
      MiSobrecarga sobrecarga = new MiSobrecarga();
        
      sobrecarga.imprimir("hola");
      sobrecarga.imprimir(5);
      sobrecarga.imprimir('a'); 
      sobrecarga.imprimir("hola", "mundo");
      sobrecarga.imprimir(5,6);
      sobrecarga.imprimir("Alma",18);
      sobrecarga.imprimir("Muchos Numeros",18,10,45,55,80,4,5,41,-20,-8);
        
    }
    
}
