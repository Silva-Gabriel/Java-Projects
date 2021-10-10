public class ContaPoupanca extends Contas{

    public ContaPoupanca(int numSeq) {
        super(numSeq);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
