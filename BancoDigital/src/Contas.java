public class Contas {
    protected int agencia;
    protected int numero;
    protected double saldo;
    Contas auxConta;

    public static final int AGENCIA_PADRAO = 1;

    public Contas(int numSeq)
    {
        this.agencia = AGENCIA_PADRAO;
        this.saldo = 0.00;
        this.numero = numSeq;
    }

    public Contas(){}

    public Contas getContaPoupanca(int numeroConta)
    {
        if(contaPoupancaExists(numeroConta))
        {
            for(int i = 0; i < Main.contaPoupanca.size();i++)
            {
                if(Main.contaPoupanca.get(i).numero == numeroConta)
                    auxConta = Main.contaPoupanca.get(i);
            }
        }
        else
            System.out.println("Conta inexistente!");
        return auxConta;
    }

    public Contas getContaCorrente(int numeroConta)
    {
        if(contaCorrenteExists(numeroConta))
        {
            for(int i = 0; i < Main.contaCorrente.size();i++)
            {
                if(Main.contaCorrente.get(i).numero == numeroConta)
                    auxConta = Main.contaCorrente.get(i);
            }
        }
        else
            System.out.println("Conta inexistente!");
        return auxConta;
    }


    public boolean contaPoupancaExists(int numeroConta)
    {
        for(int i = 0; i < Main.contaPoupanca.size();i++)
        {
            if(Main.contaPoupanca.get(i).numero == numeroConta)
                return true;
        }
        return false;
    }

    public boolean contaCorrenteExists(int numeroConta)
    {
        for(int i = 0; i < Main.contaPoupanca.size();i++)
        {
            if(Main.contaCorrente.get(i).numero == numeroConta)
                return true;
        }
        return false;
    }


    public void sacar(double valor)
    {
        if(validarSaldoConta(valor))
            Main.contaAtual.saldo -= valor;
        else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    public boolean validarSaldoConta(double valor)
    {
        return  Main.contaAtual.saldo >= valor;
    }

    public void depositar(int numContaDestino,double valor)
    {
        getContaPoupanca(numContaDestino).saldo += valor;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    public void transferirParaPoupanca(int numContaDestino, double valor)
    {
        Main.contaAtual.sacar(valor);
        auxConta = getContaPoupanca(numContaDestino);
        depositar(numContaDestino, valor);
    }

    public void transferirParaCorrente(int numContaDestino, double valor)
    {
        Main.contaAtual.sacar(valor);
        depositar(numContaDestino, valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
}
