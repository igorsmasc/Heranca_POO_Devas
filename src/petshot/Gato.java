package petshot;

public class Gato extends Animal {
    // Override - Sobrescrever

    @Override
    public void fazerBarulho() {
        System.out.println("Miau");
    }

    public void coisaDeGato() {

    }

    @Override
    public void comer() {
        System.out.println("Gato comendo");
    }
}
