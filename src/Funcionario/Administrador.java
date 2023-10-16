package Funcionario;

public class Administrador extends Funcionario implements Autenticavel {

    private AutenticavelUtils autenticador;

    public Administrador() {
        this.autenticador = new AutenticavelUtils();
    }

    public double getBonificacao() {
        return 1000;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
