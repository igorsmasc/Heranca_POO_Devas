import petshot.Animal;
import petshot.Cachorro;
import petshot.Gato;

public class Main {
    public static void main(String[] args) {

        /**
         *
         * 1 - Abstração
         * - Tem o objetivo de reunir todos os métodos e atributos em uma só classe e esconder a sua implementação e complexidade dos usuários e mostrar somente informação relevante e conveniente.
         *
         * 2 - Encapsulamento
         * - Está ligado à proteção dos dados da classe, permite proteger os dados de uma classe para que não sejam usados indevidamente dentro do sistema.
         *
         * 3 - Herança
         * - Garante a reutilização de código, como uma classe filha recebe os métodos e atributos da classe pai
         *
         * 4 - Polimorfismo (poli - muitas | morfo - forma)
         * - Nos dá a habilidade de fazer as ações de formas diferentes um exemplo seria usando sobrescrita e/ou sobrecarga de métodos
         *
         *
         */

        // Polimorfismo - sobrescrita
        // Ocorre na heranca
        // Mesma assinatura (diferentes classes)

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.fazerBarulho();
        gato.fazerBarulho();

        Animal animal = retornaUmAnimal();
        animal.fazerBarulho();



        // Polimorfismo - sobrecarga
        // Ocorre na mesma classe de declaracao do metodo (NÃO PRECISA DE HERANCA)
        // Diferentes assinaturas (mesma classe)

    }

    public static Animal retornaUmAnimal() {
        return new Cachorro();
    }
}
