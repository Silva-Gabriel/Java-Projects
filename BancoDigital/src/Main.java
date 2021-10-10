//Polimorfismo
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random numConta = new Random();
    public static int contadorContaPoupanca;
    public static int contadorContaCorrente;
    public static ArrayList<Contas> contaPoupanca = new ArrayList<>();
    public static ArrayList<Contas> contaCorrente = new ArrayList<>();
    public static Contas contaAtual;
    private static final String _senhaAdmin = "@H3LL0P3773R sDs";


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Contas inConta = new Contas();

        System.out.println("[1] - Criar conta poupança\n[2] - Criar conta corrente\n[3] - Sacar\n[4] - Transferir\n[5] - Depositar\n[6] - Verificar conta\n[7] - Obter acesso ADM\n[8] - Sair");
        System.out.println("O que deseja fazer?");
        System.out.print("Sua opcão: ");
        int escolha = entrada.nextInt();

        while(escolha != 8)
        {
            switch (escolha)
            {
                case 1 -> {
                    System.out.println(criarContaPoupanca());
                    contaAtual = contaPoupanca.get(contadorContaPoupanca-1);
                }

                case 2 -> {
                    System.out.println(criarContaCorrente());
                    contaAtual = contaCorrente.get(contadorContaCorrente-1);
                }

                case 3 -> {
                    System.out.print("Insira o valor a ser sacado: ");
                    double saque = entrada.nextDouble();
                    inConta.sacar(saque);
                }

                case 4 -> {
                    System.out.println("[1] - Conta poupança\n[2] - Conta corrente");
                    int OptConta = entrada.nextInt();
                    while(OptConta < 1 || OptConta > 2)
                    {
                        System.out.println("[1] - Conta poupança\n[2] - Conta corrente");
                        System.out.print("Opção: ");
                        OptConta = entrada.nextInt();
                    }
                    System.out.print("Insira a conta de destino: ");
                    int numContaDestino = entrada.nextInt();
                    System.out.println("Agora o valor a ser transferido: ");
                    double valor = entrada.nextDouble();
                    if(OptConta == 1){
                        inConta.transferirParaPoupanca(numContaDestino,valor);
                    }
                    else{
                        inConta.transferirParaCorrente(numContaDestino,valor);
                    }
                }
                case 5 -> {
                    System.out.print("Insira o valor a ser depositado: ");
                    double valor = entrada.nextDouble();
                    inConta.depositar(contaAtual.numero,valor);
                }

                case 6 -> {
                    System.out.println("[1] - Conta poupança\n[2] - Conta corrente");
                    System.out.print("Opção: ");
                    int OptConta = entrada.nextInt();
                    while(OptConta < 1 || OptConta > 2)
                    {
                        System.out.println("[1] - Conta poupança\n[2] - Conta corrente");
                        System.out.print("Opção: ");
                        OptConta = entrada.nextInt();
                    }
                    System.out.println("Digite o número da sua conta: ");
                    int numConta = entrada.nextInt();
                    if(OptConta == 1)
                    {
                        inConta.getContaPoupanca(numConta);
                    }
                    else{
                        inConta.getContaCorrente(numConta);
                    }
                }

                case 7 -> {
                    entrada.nextLine();
                    System.out.print("Digite a senha para obter acesso de administrador: ");
                    String senha = entrada.nextLine();
                    if(verificaSenhaAdmin(senha))
                    {
                        System.out.println("Contas Poupança" + contaPoupanca.toString());
                        System.out.println("Contas Corrente" + contaCorrente.toString());
                    }
                    else{
                        System.out.println("Senha incorreta! Acesso N E G A D O!!!");
                        System.exit(403);
                    }
                }
            }
            System.out.println("O que deseja fazer?");
            System.out.print("Sua opcão: ");
            escolha = entrada.nextInt();
        }
    }

    public static void setContadorContaPoupanca(int sequencial) {Main.contadorContaPoupanca = sequencial;}
    public static void setContadorContaCorrente(int sequencial) {Main.contadorContaCorrente = sequencial;}

    public static String criarContaPoupanca()
    {
        contaPoupanca.add(new Contas(numConta.nextInt(100)));
        String retorno = "Conta poupança criada com sucesso!\n"+"ContaPoupança{"+contaPoupanca.get(contadorContaPoupanca).toString()+"}";
        setContadorContaPoupanca(contadorContaPoupanca+1);
        return retorno;
    }

    public static String criarContaCorrente()
    {
        contaCorrente.add(new Contas(numConta.nextInt(100)));
        contaCorrente.get(contadorContaCorrente).saldo = 500.00;
        String retorno = "Conta corrente criada com sucesso!\n"+"ContaCorrente{"+contaCorrente.get(contadorContaCorrente).toString()+"}";
        setContadorContaCorrente(contadorContaCorrente+1);
        return retorno;
    }

    public static boolean verificaSenhaAdmin(String senha)
    {
        return senha.equals(_senhaAdmin);
    }
}
