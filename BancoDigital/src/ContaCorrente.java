public class ContaCorrente extends Contas {

    public ContaCorrente(int numSeq) {
        super(numSeq);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}


