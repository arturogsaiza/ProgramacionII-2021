
package GatoPerroRana;

public class Rana {
    
    String color;
    String tamano;
    Boolean venenosa;
    String especie;
    String texturaPiel;

    void brincar(double metros) {
        System.out.println("Esta rana brinco "+metros+" metros!");
        if(metros >= 5){
            System.out.println("Fue un gran salto!");
        }else{
            System.out.println("Fue un mal salto!  buu!");
        }
    }

    void nadar() {
        System.out.println("La rana está nadando");
    }

    void comer() {
        System.out.println("La rana está comiendo");
    }

    void croar() {
        System.out.println("La rana está croando");
    }
}
