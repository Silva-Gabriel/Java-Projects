import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.Thread.sleep;

class Main
{
    public static void main(String[] args) throws InterruptedException {
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

        CriaJogoDaVelha();
    }

    public static Scanner entrada;

    static {
        entrada = new Scanner(System.in);
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
    //Escopo de jogadores
    public static String player2;
    public static String vencedor;

    //Guardando o simbolo de escolha do usuário
    public static String s1;
    public static String s2;

    //Variável para armazenar o vencedor do jogo
    public static String vencedorDoJogo = "";

    public static void Joquempo(String J1, String J2) throws InterruptedException
    {
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
                player2 = J2;
                vencedor = J1;
            }
            else if (Jogador1 == 2 && Jogador2 == 1)
            {
                resultado = J1 + " vencedor";
                player2 = J2;
                vencedor = J1;
            }
            else if (Jogador1 == 3 && Jogador2 == 2)
            {
                resultado = J1 + " vencedor";
                player2 = J2;
                vencedor = J1;
            }
            else
            {
                resultado = J2 + " vencedor";
                player2 = J1;
                vencedor = J2;
            }
        }
        System.out.println(resultado);
        //Escolha da representação simbólica
        System.out.println("Escolha o símbolo que te representará nesta rodada...");
        s1 = entrada.next();
        System.out.println("Agora o jogador 2...");
        s2 = entrada.next();

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

    public static void CriaJogoDaVelha() throws InterruptedException {
        //Criação do ambiente do jogo
        String[][] jogoDaVelha = new String[3][3];
        for(int linha = 0;linha < 3;linha++)
            for(int coluna = 0;coluna < 3;coluna++)
            {
                System.out.println("Jogador 1 escolha uma posição: ");
                System.out.println("Dica:Pressione Q para ver a representação gráfica das posições");
                String position1 = entrada.nextLine().toUpperCase(Locale.ROOT);
                while(Objects.equals(position1,"Q"))
                {
                    switch (position1)
                    {
                        case "Q":
                            RepresentacaoDoAmbiente();
                        case "1":
                            jogoDaVelha[0][0] = s1;
                            break;
                        case "2":
                            jogoDaVelha[0][1] = s1;
                            break;
                        case "3":
                            jogoDaVelha[0][2] = s1;
                            break;
                        case "4":
                            jogoDaVelha[1][0] = s1;
                            break;
                        case "5":
                            jogoDaVelha[1][1] = s1;
                            break;
                        case "6":
                            jogoDaVelha[1][2] = s1;
                            break;
                        case "7":
                            jogoDaVelha[2][0] = s1;
                        case "8":
                            jogoDaVelha[2][1] = s1;
                        case "9":
                            jogoDaVelha[2][2] = s1;
                    }
                    System.out.println("Jogador 1 escolha uma posição: ");
                    position1 = entrada.next().toUpperCase(Locale.ROOT);

                }
                MsgVencedorDoJogo();
                //Usando o mínimo de jogadas necessárias para poder ter um vencedor
                if(linha == 1 && coluna == 1)
                {
                   if(Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][0]) && Objects.equals(jogoDaVelha[1][0], jogoDaVelha[2][0]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else if(Objects.equals(jogoDaVelha[0][1], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][1]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else if(Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][2]) && Objects.equals(jogoDaVelha[1][2], jogoDaVelha[2][2]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else if(Objects.equals(jogoDaVelha[0][0], jogoDaVelha[0][1]) && Objects.equals(jogoDaVelha[0][1], jogoDaVelha[0][2]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else if(Objects.equals(jogoDaVelha[1][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[1][2]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else if(Objects.equals(jogoDaVelha[2][0], jogoDaVelha[2][1]) && Objects.equals(jogoDaVelha[2][1], jogoDaVelha[2][2]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else if(Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][2]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else if(Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][0]))
                   {
                       System.out.println("Jogador 1 vencedor do jogo!");
                   }
                   else
                       System.exit(0);
                }

                System.out.println("Jogador 1 escolha uma posição: ");
                System.out.println("Dica:Pressione Q para ver a representação gráfica das posições");
                String position2 = entrada.nextLine().toUpperCase(Locale.ROOT);
                while(Objects.equals(position1, "Q"))
                {
                    switch (position2)
                    {
                        case "Q":
                            RepresentacaoDoAmbiente();
                        case "1":
                            jogoDaVelha[0][0] = s1;
                            break;
                        case "2":
                            jogoDaVelha[0][1] = s1;
                            break;
                        case "3":
                            jogoDaVelha[0][2] = s1;
                            break;
                        case "4":
                            jogoDaVelha[1][0] = s1;
                            break;
                        case "5":
                            jogoDaVelha[1][1] = s1;
                            break;
                        case "6":
                            jogoDaVelha[1][2] = s1;
                            break;
                        case "7":
                            jogoDaVelha[2][0] = s1;
                        case "8":
                            jogoDaVelha[2][1] = s1;
                        case "9":
                            jogoDaVelha[2][2] = s1;
                    }
                    System.out.println("Jogador 1 escolha uma posição: ");
                    position2 = entrada.next().toUpperCase(Locale.ROOT);
                }
                if(linha == 1 && coluna == 1)
                {
                    if(Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][0]) && Objects.equals(jogoDaVelha[1][0], jogoDaVelha[2][0]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else if(Objects.equals(jogoDaVelha[0][1], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][1]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else if(Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][2]) && Objects.equals(jogoDaVelha[1][2], jogoDaVelha[2][2]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else if(Objects.equals(jogoDaVelha[0][0], jogoDaVelha[0][1]) && Objects.equals(jogoDaVelha[0][1], jogoDaVelha[0][2]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else if(Objects.equals(jogoDaVelha[1][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[1][2]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else if(Objects.equals(jogoDaVelha[2][0], jogoDaVelha[2][1]) && Objects.equals(jogoDaVelha[2][1], jogoDaVelha[2][2]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else if(Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][2]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else if(Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][0]))
                    {
                        System.out.println("Jogador 1 vencedor do jogo!");
                    }
                    else
                        System.exit(0);
                }
                MsgVencedorDoJogo();
                if(linha == 2 && coluna == 2)
                    System.out.println("EMPATE!");
            }
    }

    public static void RepresentacaoDoAmbiente()
    {
        System.out.println("Posições do game: \n");
        System.out.println("__1__|__2__|__3__");
        System.out.println("__4__|__5__|__6__");
        System.out.println("__7__|__8__|__9__");
    }

    public static void MsgVencedorDoJogo() throws InterruptedException
    {
        if(vencedorDoJogo.equals(vencedor) || vencedorDoJogo.equals(player2))
        {
            System.out.println("Xéque mate");
            sleep(500);
            System.out.println(".");
            sleep(500);
            System.out.println(".");
            sleep(500);
            System.out.println(".");
            System.out.println("Ops,jogo errado,mas temos um vencedor,parabéns " + vencedorDoJogo);
        }
    }
}