package petshot;// Uma classe abstrata não pode ser instanciada
// Porém serve como classe Mãe e suas caracteristicas podem ser herdadas

public class Animal {
    // Atributos
    private String cor;
    private String especie;
    private int idade;

    // Assinatura de um método


    public void comer() { // assinatura = comer()
        System.out.println("Comendo");
    }

    public void comer(String racao) { // assinatura = comer(String)
        System.out.println("Comendo " + racao);
    }

    public void comer(String racao, Double quantidade) { // assinatura = comer(String, Double)
        System.out.println("Comendo " + racao);
    }





    // Método abstrado
    // - Declarado mas não implementado.
    // - So podemos ter esse método em classes abstratas
    public void fazerBarulho()  {

    };

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
