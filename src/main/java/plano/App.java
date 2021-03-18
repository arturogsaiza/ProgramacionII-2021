package plano;

 

/**
 * User: gustavomaedo
 * Date: 4/11/20
 * Time: 5:59 PM
 */
public class App {
    Smile smile = new Smile();

    void initApp() {
        smile.setSize(15,15);
        smile.setIcon("B");
        smile.setEmptyIcon(".");
        addCoordinates();
        smile.createImage();
        smile.printImage();
    }

    private void addCoordinates(){
        // y = 0
        smile.addCoordinate(0,0);
        smile.addCoordinate(1,1);
        smile.addCoordinate(2,2);
        smile.addCoordinate(3,3);
 
    }
}
