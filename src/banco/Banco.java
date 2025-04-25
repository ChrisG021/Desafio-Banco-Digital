package banco;
import java.util.ArrayList;
import java.util.List;

import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarContaCorrente(Conta conta) {
        contas.add(conta);
    }

    public void adicionarContaPoupanca(Conta conta) {
        contas.add(conta);
    }

    public void mostrarContasVigentes() {
        for (Conta conta : contas) {
            if (conta instanceof ContaCorrente) {
                System.out.println("=== conta corrente ===");
            }else if(conta instanceof ContaPoupanca)  System.out.println("=== Conta Poupanca ===");
            System.out.printf("Nome titular   %s\n",conta.getTitular().getNome());
            System.out.printf("numero conta   %d\n",conta.getNumeroConta());
            System.out.println("----------------------------");
        }
    }

    public Conta buscarPorNumero(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> buscarPorNomeTitular(String nome) {
        List<Conta> encontradas = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getTitular().getNome().equalsIgnoreCase(nome)) {
                encontradas.add(conta);
            }
        }
        return encontradas;
    }

    public List<Conta> getTodasAsContas() {
        return contas;
    }
}
