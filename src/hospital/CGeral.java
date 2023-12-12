package hospital;

// Não pode ser herdada - Classe Folha
public final class CGeral extends Medico {
    private String outro;

    @Override
    public void realizarAtendimento() {
        System.out.println("Clinico Geral Atendendo");
    }

    public Medico repassarParaEspecialiasta() {
        return new Gastro();
    }
}
