import java.util.List;

import banco.Banco;
import banco.conta.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Banco bb = new Banco();
        Conta conta1 = new ContaCorrente("Chris");
        Conta conta2 = new ContaCorrente("Maicon");
        Conta conta3 = new ContaPoupanca("Maicon");


        bb.adicionarContaCorrente(conta1);
        bb.adicionarContaCorrente(conta2);
        bb.adicionarContaPoupanca(conta3);

        conta1.depositar(1000);
        conta2.depositar(7000);

        conta2.transferir(5223, conta3);

        bb.mostrarContasVigentes();

        Conta contaBuscada = bb.buscarPorNumero(conta1.getNumeroConta());
        if (contaBuscada != null) {
            System.out.println("Conta Encontrada");
            System.out.printf("titular         %s\n", contaBuscada.getTitular().getNome());
            System.out.printf("Saldo           %.2f\n",contaBuscada.getSaldo());
        }

        List<Conta> contasMaicon = bb.buscarPorNomeTitular("maicon");
        System.out.println("=== Contas do maicon ===");
        for (Conta c : contasMaicon) {
            c.imprimirExtrato();
            
        }
    }
}
