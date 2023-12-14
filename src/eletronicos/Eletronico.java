package eletronicos;

// public - TODOS PODEM ACESSAR

public class Eletronico {
//    public String testAtributoPublic;
//    protected String testAtributoProtected;
//    String testAtributoDefault;
//    private String getTestAtributoPrivate;

    private String nome;
    private Integer ano;

    public Eletronico() {

    }

    public Eletronico(String nome) {
        this.nome = nome;
    }

    public Eletronico(String nome, Integer ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public void testMetodoPublic() {
    }

    protected void testMetodoProtected() {
    }

    void testMetodoDefault() {
    }

    private void testMetodoPrivate() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
