
package herencia;


public class Main {

  
    public static void main(String[] args) {
        
        Alumno  ramon = new Alumno();
        
        ramon.setNombre("Ramon");
        ramon.setEdad(18);
        ramon.setEscuela("ITSON");
        ramon.setCarrera("ISW");
        ramon.setCiudad("Guaymas"); 
        System.out.println(ramon.getNombre()+" estudia en "+ramon.getEscuela()+" la carrera de "+ramon.getCarrera()+" en "+ramon.getCiudad());
        ramon.caminar();
        ramon.dormir();
        ramon.estudiar();
        ramon.hacerTarea();
        
        
        Doctor DrHouse =  new Doctor(
                5,
                "General",
                "IMSS las Villas",
                90476,
                "Dr. Manuel",
                "Gonzalez",
                "Marin",
                "2000-08-28",
                1249,
                21,
                "Guaymas",
                "Cholinas");
        
        
        
    }
    
}
