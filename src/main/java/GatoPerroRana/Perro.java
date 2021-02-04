package GatoPerroRana;

public class Perro {
   String patas;
   String tamaño;
   String color;
   String rasa;
   int edad;
   
   //Metodos 
   
   void ladrar (){
       System.out.println("ladrando");
   }
   void correr (){
       System.out.println("corriendo");
   }
   void olfatear (){
       System.out.println("Olfateando");
   }
   void brincar (){
       System.out.println("Brincando");
   }
   
   void  nacimiento(int anio){
       int anioNacimiento = anio - this.edad;
       System.out.println("Este perro nacio en el año "+anioNacimiento);
   }

}
