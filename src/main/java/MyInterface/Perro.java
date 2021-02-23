
package MyInterface;
public class Perro  implements Animal{

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }

    @Override
    public void cazar() {
        System.err.println("comiendo croquetas");
    }

    @Override
    public void dormir() {
         System.out.println("durmiendo");
    }


    
}
