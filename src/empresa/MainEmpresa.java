package empresa;

import empresa.Atendente;
import empresa.Funcionario;
import empresa.Gerente;
import empresa.Programador;

public class MainEmpresa {
    public static void main(String[] args) {

        // Empresa
        // classes - Funcionario - Atendente - Programador - Gerente

        Funcionario atendente = new Atendente();
        Funcionario programador = new Programador();
        Gerente gerente = new Gerente();

        Funcionario[] funcionarios = new Funcionario[]{atendente, programador, gerente};

        Double salariosDoMes = 0.0;
        for(Funcionario funcionario: funcionarios) {
            salariosDoMes += funcionario.calcularSalarioDoMes();
        }

        System.out.println(salariosDoMes);


    }
}
