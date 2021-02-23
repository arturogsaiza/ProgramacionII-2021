package MyInterface;

public class Cochi implements Animal{

    @Override
    public void hacerRuido() {
        System.out.println("oing");
    }

    @Override
    public void cazar() {
        System.out.println("comiendo purina");
    }

    @Override
    public void dormir() {
        System.out.println("durmiendo en el lodo");
    }
    
}
