package Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente vapo = new Gerente();
        vapo.setNome("vapo salveson");
        vapo.setCpf("213355656-9");
        vapo.setSalario(2500.80);

        System.out.println(vapo.getNome());
        System.out.println(vapo.getBonificacao());
    }

}
