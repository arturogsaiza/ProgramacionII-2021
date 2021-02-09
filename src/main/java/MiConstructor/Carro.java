
package MiConstructor;

public class Carro {
   int anio;
   String modelo;
   double precio;
   
   Carro(int elAnio, String elModelo, double elPrecio){
      this.anio =  elAnio;
      this.modelo = elModelo; 
      this.precio = elPrecio;
   }
  
   
   double mensualidades(int meses){
    return this.precio / meses;
   }
   
   static double interes(double mensualidad){
       return  mensualidad*0.8;
   }
   
   
   
   
   
}
