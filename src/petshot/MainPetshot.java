package petshot;

public class MainPetshot {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Animal a = new Gato();
        Gato b = new Gato();

        Gato c = (Gato) new Animal();
        c.coisaDeGato();
    }

    public void teste() {
        Animal animal = new Leao();

        iniciarAtendimento(animal);
    }

    public void iniciarAtendimento(Animal animal) {
        kitCompleto(animal);
    }

    public void kitCompleto(Animal animal) {
        consulta(animal);
        tosa(animal);
        darBanho(animal);
    }

    public void consulta(Animal animal) {

    }

    public void tosa(Animal animal) {

    }

    public void darBanho(Animal animal) {

    }
}
