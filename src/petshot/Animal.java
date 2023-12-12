package petshot;// Uma classe abstrata não pode ser instanciada
// Porém serve como classe Mãe e suas caracteristicas podem ser herdadas

public abstract class Animal {
    // Atributos
    private String cor;
    private String especie;
    private int idade;

    public void comer() {
        System.out.println("Comendo");
    }

//    public petshot.Animal(String cor, String especie) {
//        this.cor = cor;
//        this.especie = especie;
//    }

    // Método abstrado
    // - Declarado mas não implementado.
    // - So podemos ter esse método em classes abstratas
    public abstract void fazerBarulho();

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
