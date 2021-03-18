package plano;

/**
 * User: gustavomaedo Date: 4/11/20 Time: 4:56 PM
 */
public class Main {

    static Smile smile = new Smile();

  public   static void main(String[] args) {

        smile.setSize(15, 15);
        smile.setIcon("B");
        smile.setEmptyIcon(".");
        addCoordinates();
        smile.createImage();
        smile.printImage();

    }

    static void addCoordinates() {
        // y = 0
        smile.addCoordinate(0, 0);
        smile.addCoordinate(1, 1);
        smile.addCoordinate(2, 2);
        smile.addCoordinate(3, 3);

    }
}
