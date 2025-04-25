package banco.conta;
import banco.Cliente;
public abstract class Conta implements Iconta {
    private static final int AGENCIA_PADRAO = 1;
    private Cliente titular;


    private static int SEQUENCIAL = 1;
    private int agencia;
    private  int numeroConta;
    private double saldo;

    public Conta(String cliente) {//n precisa passar parametros e ela ira implementar esse construtor direto
        this.titular = new Cliente(cliente);
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }
    
    public Cliente getTitular() {
        return titular;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double val) {
        saldo -= val;
    }

    @Override
    public void depositar(double val) {
        saldo+= val;
    }

    @Override
    public void transferir(double val, Conta contaDestino) {
        this.sacar(val);
        contaDestino.depositar(val);
    }
    
    protected void imprimirInfosComuns(){
        System.out.printf("Titular:  %s\n",this.titular.getNome());
        System.out.printf("Agencia:  %s\n",this.agencia);
        System.out.printf("Número:   %d\n",this.numeroConta);
        System.out.printf("Saldo:   %.2f\n",this.saldo);

    }
}
