import java.util.ArrayList;

public class Contas {
    protected int agencia;
    protected int numero;
    protected double saldo;
    public static final int AGENCIA_PADRAO = 1;

    public Contas(int numSeq)
    {
        this.agencia = AGENCIA_PADRAO;
        this.saldo = 0.00;
        this.numero = numSeq;
    }

    public void sacar(double valor)
    {
        this.saldo -= valor;
    }

    public void depositar(double valor)
    {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    public void transferir(Contas contaDestino, double valor)
    {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
}
