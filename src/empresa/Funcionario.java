package empresa;

public abstract class Funcionario {
    private String nome;
    private String matricula;
    private String horasTrabalhadas;

    public abstract Double calcularSalarioDoMes();
}
