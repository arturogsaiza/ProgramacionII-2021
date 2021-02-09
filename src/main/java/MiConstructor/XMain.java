
package MiConstructor;


public class XMain {

    
    public static void main(String[] args) {
     
        MyX miX = new MyX(-25); 
        //System.out.println(miX.x);
        
        Carro aveo = new Carro(2009, "Aveo", 200000);
        Carro jetta = new Carro(2010, "Jetta",250000);
        Carro estratus = new Carro(2005, "Estratus",45000);
        
        int mensualidades = 12;
        
        System.out.println("\n"+aveo.modelo+" - "+aveo.anio);
        double MensualidadAveo = aveo.mensualidades(mensualidades);
        double interesAveo= Carro.interes(MensualidadAveo);
        System.out.println(mensualidades+" meses de $"+(MensualidadAveo+interesAveo)+" con intereses del 8% Mensual");

         
         
         
        System.out.println("\n"+jetta.modelo+" - "+jetta.anio);
        
        System.out.println("\n"+estratus.modelo+" - "+estratus.anio);
        
        
    }
    
}
