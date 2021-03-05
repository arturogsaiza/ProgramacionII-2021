
package MyEnum;


public class Main2 { 
    
    public static void main(String[] args) {
      
        Semestre semestreAcual = Semestre.TERCERO;
        
        switch(semestreAcual){
            case  PRIMERO: System.out.println("ProgramacionI \n Ingenieria en Software \n Arquitectura de Computadoras"); break;
            case SEGUNDO: 
                 System.out.println("Programacion 2 \n Sistemas Operativos \n Calculo I \n Matematicas Computacionales");
                break;
            case TERCERO: System.out.println("Programacion 3");   break;
            case CUARTO: System.out.println("Ingles 3");  break;
            case QUINTO: System.out.println("Aplicaciones web");  break;
            case SEXTO: System.out.println("Practicas I");  break;  
        }
        
        
    }
    
    
    public enum Semestre{
        PRIMERO,
        SEGUNDO,
        TERCERO,
        CUARTO,
        QUINTO,
        SEXTO
    } 
}
