package formas;

import java.util.Random;

public class Quadrado extends FormaGeometrica {
    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println(lado*lado);
    }

    public Double getLado() {
        return lado;
    }
}
