
package MiConstructor; 

    class Tripulante{
        String nombre;
        String color;
        String sombrero;
        String mascota;
        boolean impostor;
        boolean estado;
        
        Tripulante(String nombre, String color, String sombrero, String mascota, boolean impostor, boolean estado){
            this.color=color;
            this.estado= estado;
            this.impostor=impostor;
            this.mascota=mascota;
            this.nombre= nombre;
            this.sombrero= sombrero;  
            System.out.println("Construi el objeto de nombre "+nombre);
            
        }
        
         Tripulante(){
         
         }
        

        void hacerTarea(){
            System.out.println("Haciendo tarea");
        }   
        void votar(){
              System.out.println("votando");
        }  
        void matar(){
               System.out.println("matando");
        }
        void reportarCuerpo(){
              System.out.println("reportando cuerpo");
        }
        void esconderse(){ 
        }
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
