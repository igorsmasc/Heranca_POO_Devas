package hospital;

public abstract class Medico {
    String crm;

    // O método final não pode ser sobrescrito ou alterado nas suas classes filhas.
    public final void baterOPonto() {
        System.out.println("Batendo o ponto");
    }

    public abstract void realizarAtendimento();
}
