package banco.conta;

public interface Iconta {
    
    void sacar(double val);
    void depositar(double val);
    void transferir(double val , Conta contaDestino);
    void imprimirExtrato();
}
