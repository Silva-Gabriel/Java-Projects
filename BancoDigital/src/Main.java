//Polimorfismo
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int SEQUENCIAL = 1;
    public static int contadorContaPoupanca;
    public static int contadorContaCorrente;
    public static ArrayList<Contas> contaPoupanca = new ArrayList<Contas>();


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("[1] - Criar conta corrente\n[2] - Criar conta poupança\n[3] - Transferir\n[4] - Sair");
        System.out.println("O que deseja fazer?");
        System.out.print("Sua opcão: ");
        int escolha = entrada.nextInt();

        while(escolha != 10)
        {
            switch (escolha)
            {
                case 1 -> {
                    criarContaPoupanca();
                    System.out.println(criarContaPoupanca());
                    System.out.println(criarContaPoupanca());
                }
            }
            System.out.println("O que deseja fazer?");
            System.out.print("Sua opcão: ");
            escolha = entrada.nextInt();
        }
    }

    public static void setSEQUENCIAL(int SEQUENCIAL) {
        Main.SEQUENCIAL = SEQUENCIAL;
    }

    public static String criarContaPoupanca()
    {
        Contas Conta = new Contas(SEQUENCIAL);
        contadorContaPoupanca = 0;
        contaPoupanca.add(Conta);
        String retorno = "Conta poupança criada com sucesso!\n"+"ContaPoupança{"+contaPoupanca.get(contadorContaPoupanca).toString();
        contadorContaPoupanca++;
        setSEQUENCIAL(SEQUENCIAL++);
        return retorno;
    }
}
