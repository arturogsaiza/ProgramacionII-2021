package MyClass; // para poder utilizar la clase en otras clases
   
class Tripulante{
    String nombre;
    String color;
    String sombrero;
    String mascota;
    boolean impostor;
    boolean estado;
    
    void hacerTarea(){ }   
    void votar(){}  
    void matar(){}
    void reportarCuerpo(){}
    void esconderse(){}
    void sabotar(){}
    
    void verInfo(){
        System.out.println("\n Informacion de Tripulante");
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("sombrero: "+sombrero);
        System.out.println("mascota: "+mascota);
        System.out.println("impostor: "+impostor);
        System.out.println("estado: "+estado);
    }
   
}