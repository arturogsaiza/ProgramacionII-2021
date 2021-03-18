
package MyIterator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;


public class NoticiasMain {


    public static void main(String[] args) {
       
        ArrayList<Noticia> listaNoticias = new ArrayList<Noticia>();
        
        listaNoticias.add(
                new Noticia(
                        "Félix Salgado Macedonio: el candidato de Morena divide a mujeres", 
                        "La polémica en torno al senador con licencia, ha movido a mujeres de su partido para apoyarlo, pese a los señalamientos de violación y acoso sexual en su contra, en tanto otras repudian su aspiración a ser Gobernador de Guerrero.", 
                        "2021-03-09"
                )
        );
        
                
        listaNoticias.add(
                new Noticia(
                        "Resisten la crisis en la tienda de la esquina", 
                        " ", 
                        "2021-03-08"
                )
        );
         
     listaNoticias.add(
                new Noticia(
                        "¡Coyotas de Villa de Seris en tamaño \"\"jumbo\"!a", 
                        " ", 
                        "2021-03-08"
                )
        );
         
          listaNoticias.add(
                new Noticia(
                        "Líder petrolero se va de \"vacaciones\" y AMLO pide investigar", 
                        " ", 
                        "2021-03-06"
                )
        );
         
               listaNoticias.add(
                new Noticia(
                        "Salvar la vida de su mentor fue una prueba superada", 
                        " ", 
                        "2021-03-06"
                )
        );
         
                    listaNoticias.add(
                new Noticia(
                        "Resisten la crisis en la tienda de la esquina", 
                        " ", 
                        "2021-03-08"
                )
        );
        
    Iterator<Noticia> itNoticia =  listaNoticias.iterator();
    Noticia noticiaUno =  itNoticia.next();
    
        System.out.println(":::::::::::::::::::PRIMERA PLANA:::::::::::::::::::::::::");
        System.out.println(noticiaUno.titulo.toUpperCase()); 
         System.out.println(noticiaUno.descripcion); 
         System.out.println(noticiaUno.fecha); 
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
    
        for(Noticia n : listaNoticias){
            System.out.println("-----------------");
            System.out.println("Titulo: "+n.titulo);
            System.out.println("fecha: "+n.fecha);
        }
         
        
    }
    
}
