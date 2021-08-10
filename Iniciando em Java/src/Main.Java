import java.util.Scanner;
import static java.lang.Thread.sleep;

class Main
{
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        MsgBoasVindas();
        //Definição dos jogadores
        String J1;
        String J2;
        System.out.print("Jogador nº1: ");
        J1 = entrada.nextLine();
        System.out.print("Jogador nº2: ");
        J2 = entrada.nextLine();
        String DefineJogadores = DefinindoJogadores(J1, J2);
        System.out.println(DefineJogadores);
        //Definição da ordem de jogada
        Joquempo(J1, J2);
        System.out.println(vencedor);

    }

    public static void MsgBoasVindas()
    {
        System.out.println("| Sejam muito bem-vindos ao Jogo da velha 2021 |");
        System.out.println("A seguir vamos conhecer nossos jogadores...");
    }

    public static String DefinindoJogadores(String J1, String J2)
    {
        return "Olá, " + J1 + " e " + J2 + ",a próxima etapa antes de começarem o jogo é pedra,papel e tesoura para definir quem irá começar primeiro";
    }


    public static String vencedor;
    public static void Joquempo(String J1, String J2) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("---------\n[1] Pedra\n[2] Papel\n[3] Tesoura\n---------");

        String resultado = "";


        int Jogador1;
        int Jogador2;

        while (!resultado.equals(J1 + " vencedor") && !resultado.equals(J2 + " vencedor")) {
            System.out.print("Jogador 1: ");
            Jogador1 = entrada.nextInt();

            //Validação jogador 1
            while (Jogador1 < 1 || Jogador1 > 3) {
                System.out.println("---------\n[1] Pedra\n[2] Papel\n[3] Tesoura\n---------");
                System.out.print("Jogador 1: ");
                Jogador1 = entrada.nextInt();
            }
            //Validação jogador 2
            System.out.print("Jogador 2: ");
            Jogador2 = entrada.nextInt();

            while (Jogador2 < 1 || Jogador2 > 3) {
                System.out.println("---------\n[1] Pedra\n[2] Papel\n[3] Tesoura\n---------");
                System.out.print("Jogador 2: ");
                Jogador2 = entrada.nextInt();
            }

            MsgJoquempo();

            if (Jogador1 == Jogador2)
            {
                System.out.println("Empate");
            }
            else if (Jogador1 == 1 && Jogador2 == 3)
            {
                resultado = J1 + " vencedor";
                vencedor = J1;
            }
            else if (Jogador1 == 2 && Jogador2 == 1)
            {
                resultado = J1 + " vencedor";
                vencedor = J1;
            }
            else if (Jogador1 == 3 && Jogador2 == 2)
            {
                resultado = J1 + " vencedor";
                vencedor = J1;
            }
            else
            {
                resultado = J2 + " vencedor";
                vencedor = J2;
            }
        }
        System.out.println(resultado);
    }
        public static void MsgJoquempo() throws InterruptedException {
        System.out.print("Joquempôôô");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.println(".");
    }
}