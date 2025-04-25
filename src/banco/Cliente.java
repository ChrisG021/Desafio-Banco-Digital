package banco;

public class Cliente {
    private String nome;
    private static int sequencialCPF = 414443; // valor base
    private int cpf;

    public Cliente(String nome) {
        this.nome = nome;
        this.cpf = ++sequencialCPF; // gera um "CPF" incremental único
    }

    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return cpf;
    }
}
