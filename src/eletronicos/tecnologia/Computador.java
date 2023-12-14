package eletronicos.tecnologia;

import eletronicos.Eletronico;

public class Computador extends Eletronico {

    private String modelo;

    public Computador() {
    }

    public Computador(String nome, Integer ano, String modelo) {
        super(nome, ano);
        this.modelo = modelo;
    }

    public void testeAcesso() {
        super.testMetodoProtected();
    }
}
