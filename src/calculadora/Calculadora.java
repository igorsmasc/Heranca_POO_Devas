package calculadora;

public abstract class Calculadora {

    public abstract void somar(int a, int b);

    // public abstract void somar(int aa, int bb);

    public abstract void somar(int a, int b, int c);

    public void maiorValorEntre(int a, int b) {
    }

    public void maiorValorEntre(int[] numeros) {
    }

    public void test() {
        maiorValorEntre(1, 2); // maiorValorEntre(int, int)
        maiorValorEntre(new int[]{1, 2}); // maiorValorEntre(int[])
    }

}
