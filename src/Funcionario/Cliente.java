package Funcionario;

public class Cliente implements Autenticavel {

    private AutenticavelUtils autenticador;

    public Cliente() {
        this.autenticador = new AutenticavelUtils();
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
