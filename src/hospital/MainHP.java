package hospital;

public class MainHP {
    // Padrões de projeto - Abstract Factory
    // https://refactoring.guru/pt-br/design-patterns

    public static void main(String[] args) {
        Medico medico = selecionarEspecialidade(new String[]{"a"});
        medico.realizarAtendimento();
    }

    public static Medico selecionarEspecialidade(String[] sintomas) {
        if(sintomas.length == 1) {
            return new CGeral();
        } else if(sintomas.length == 2) {
            return new Gastro();
        } else if(sintomas.length == 3) {
            return new Derma();
        } else {
            return new Neuro();
        }
    }
}
