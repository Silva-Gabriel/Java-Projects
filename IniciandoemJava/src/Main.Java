import java.util.Objects;
import java.util.Scanner;
import static java.lang.Thread.sleep;

class Main {
    //Escopo de Jogadores Jogo da velha
    public static String J1;
    public static String J2;

    //Escopo de jogadores Joquempo
    public static String player2;
    public static String vencedor;

    //Símbolo de escolha do usuário
    public static String s1;
    public static String s2;

    public static String vencedorDoJogo = "";

    //Escopo de posições dos símbolos
    public static int position1;
    public static int position2;

    public static String VezJog1;
    public static String VezJog2;

    //Criação do ambiente com valores nulos
    public static String[][] jogoDaVelha = new String[3][3];

    //Declarando o método usado para entrada de dados
    public static Scanner entrada;
    static {
        entrada = new Scanner(System.in);
    }

    public static void main(String[] args) throws InterruptedException {
        MsgBoasVindas();
        //Definição dos jogadores
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

    public static void MsgBoasVindas() {
        System.out.println("| Sejam muito bem-vindos ao Jogo da velha 2021 |");
        System.out.println("A seguir vamos conhecer nossos jogadores...");
    }

    public static String DefinindoJogadores(String J1, String J2) {
        return "Olá, " + J1 + " e " + J2 + ",a próxima etapa antes de começarem o jogo é pedra,papel e tesoura para definir quem irá começar primeiro";
    }

    public static void Joquempo(String J1, String J2) throws InterruptedException {
        System.out.println("---------\n[1] Pedra\n[2] Papel\n[3] Tesoura\n---------");

        String resultado = "";

        int Jogador1;
        int Jogador2;

        while (!resultado.equals(J1 + " vencedor") && !resultado.equals(J2 + " vencedor")) {
            System.out.print("Jogador 1: ");
            Jogador1 = entrada.nextInt();

            //Validação jogador 1
            while (Jogador1 < 1 || Jogador1 > 3)
            {
                System.out.println("Opção inválida escolha uma das opções abaixo:");
                System.out.println("===========\n[1] Pedra\n[2] Papel\n[3] Tesoura\n===========");
                System.out.print("Jogador 1: ");
                Jogador1 = entrada.nextInt();
            }
            //Validação jogador 2
            System.out.print("Jogador 2: ");
            Jogador2 = entrada.nextInt();

            while (Jogador2 < 1 || Jogador2 > 3)
            {
                System.out.println("Opção inválida escolha uma das opções abaixo:");
                System.out.println("===========\n[1] Pedra\n[2] Papel\n[3] Tesoura\n===========");
                System.out.print("Jogador 2: ");
                Jogador2 = entrada.nextInt();
            }

            MsgJoquempo();

            if (Jogador1 == Jogador2) {
                System.out.println("Empate");
            } else if (Jogador1 == 1 && Jogador2 == 3) {
                resultado = J1 + " vencedor";
                player2 = J2;
                vencedor = J1;
            } else if (Jogador1 == 2 && Jogador2 == 1) {
                resultado = J1 + " vencedor";
                player2 = J2;
                vencedor = J1;
            } else if (Jogador1 == 3 && Jogador2 == 2) {
                resultado = J1 + " vencedor";
                player2 = J2;
                vencedor = J1;
            } else {
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
        for (int iteracoes = 0; iteracoes < 5; iteracoes++) {
            TabelaRepresentacao();
            RepresentacaoDoAmbiente();

            VezJog1 = "sua vez";
            VezJog2 = "aguarde a sua vez";

            System.out.println("Jogador 1 escolha uma posição: ");
            position1 = entrada.nextInt();

            VerificaPosicoes();

            //validação de posição
            while (position1 < 1 || position1 > 9) {
                System.out.print("Posição inválida");
                RepresentacaoDoAmbiente();
                System.out.print("Escolha outra: ");
                position1 = entrada.nextInt();
            }

            //Usando o mínimo de jogadas necessárias para poder ter um vencedor
            if (iteracoes == 3) {
                //vertical linha 1
                if (Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][0]) && Objects.equals(jogoDaVelha[1][0], jogoDaVelha[2][0])) {
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
                //vertical linha 2
                else if (Objects.equals(jogoDaVelha[0][1], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][1])) {
                    RepresentacaoDoAmbiente();
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
                //vertical linha 3
                else if (Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][2]) && Objects.equals(jogoDaVelha[1][2], jogoDaVelha[2][2])) {
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
                //horizontal linha 1
                else if (Objects.equals(jogoDaVelha[0][0], jogoDaVelha[0][1]) && Objects.equals(jogoDaVelha[0][1], jogoDaVelha[0][2])) {
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
                //horizontal linha 2
                else if (Objects.equals(jogoDaVelha[1][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[1][2])) {
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
                //horizontal linha 3
                else if (Objects.equals(jogoDaVelha[2][0], jogoDaVelha[2][1]) && Objects.equals(jogoDaVelha[2][1], jogoDaVelha[2][2])) {
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
                //diagonal 1
                else if (Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][2])) {
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
                //diagonal 2
                else if (Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][0])) {
                    vencedorDoJogo = J1;
                    FinalizaJogo();
                }
            }
            VerificaEmpate();

            TabelaRepresentacao();
            RepresentacaoDoAmbiente();

            VezJog1 = "aguarde a sua vez";
            VezJog2 = "sua vez";

            System.out.println("Jogador 2 escolha uma posição: ");
            position2 = entrada.nextInt();

            while (position2 < 1 || position2 > 9) {
                System.out.print("Posição inválida,escolha outra: ");
                position2 = entrada.nextInt();
            }

            VerificaPosicoes();

            if (iteracoes == 3) {
                if (Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][0]) && Objects.equals(jogoDaVelha[1][0], jogoDaVelha[2][0])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                } else if (Objects.equals(jogoDaVelha[0][1], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][1])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                } else if (Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][2]) && Objects.equals(jogoDaVelha[1][2], jogoDaVelha[2][2])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                } else if (Objects.equals(jogoDaVelha[0][0], jogoDaVelha[0][1]) && Objects.equals(jogoDaVelha[0][1], jogoDaVelha[0][2])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                } else if (Objects.equals(jogoDaVelha[1][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[1][2])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                } else if (Objects.equals(jogoDaVelha[2][0], jogoDaVelha[2][1]) && Objects.equals(jogoDaVelha[2][1], jogoDaVelha[2][2])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                } else if (Objects.equals(jogoDaVelha[0][0], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][2])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                } else if (Objects.equals(jogoDaVelha[0][2], jogoDaVelha[1][1]) && Objects.equals(jogoDaVelha[1][1], jogoDaVelha[2][0])) {
                    vencedorDoJogo = J2;
                    FinalizaJogo();
                }
            }
        }
    }

    private static void VerificaPosicoes()
    {
        if(VezJog1.equals("sua vez"))
        {
            int contador = 0;
            String StatusPosition = "vazia";

            while (StatusPosition.equals("vazia")) {
                if (contador == 1) {
                    System.out.println("Posição ocupada,escolha outra: ");
                    position1 = entrada.nextInt();
                }
                switch (position1) {
                    case 1:
                        if (Objects.equals(jogoDaVelha[0][0], null)) {
                            jogoDaVelha[0][0] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 2:
                        if (Objects.equals(jogoDaVelha[0][1], null)) {
                            jogoDaVelha[0][1] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 3:
                        if (Objects.equals(jogoDaVelha[0][2], null)) {
                            jogoDaVelha[0][2] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 4:
                        if (Objects.equals(jogoDaVelha[1][0], null)) {
                            jogoDaVelha[1][0] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 5:
                        if (Objects.equals(jogoDaVelha[1][1], null)) {
                            jogoDaVelha[1][1] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 6:
                        if (Objects.equals(jogoDaVelha[1][2], null)) {
                            jogoDaVelha[1][2] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 7:
                        if (Objects.equals(jogoDaVelha[2][0], null)) {
                            jogoDaVelha[2][0] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 8:
                        if (Objects.equals(jogoDaVelha[2][1], null)) {
                            jogoDaVelha[2][1] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                        break;
                    case 9:
                        if (Objects.equals(jogoDaVelha[2][2], null)) {
                            jogoDaVelha[2][2] = s1;
                            StatusPosition = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador++;
                        }
                }
            }
        }
        else if(VezJog2.equals("sua vez"))
        {
            int contador2 = 0;
            String StatusPosition2 = "vazia";

            while (StatusPosition2.equals("vazia")) {
                if (contador2 == 1) {
                    System.out.println("Posição ocupada,escolha outra: ");
                    position2 = entrada.nextInt();
                }
                switch (position2) {
                    case 1:
                        if (Objects.equals(jogoDaVelha[0][0], null)) {
                            jogoDaVelha[0][0] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 2:
                        if (Objects.equals(jogoDaVelha[0][1], null)) {
                            jogoDaVelha[0][1] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 3:
                        if (Objects.equals(jogoDaVelha[0][2], null)) {
                            jogoDaVelha[0][2] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 4:
                        if (Objects.equals(jogoDaVelha[1][0], null)) {
                            jogoDaVelha[1][0] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 5:
                        if (Objects.equals(jogoDaVelha[1][1], null)) {
                            jogoDaVelha[1][1] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 6:
                        if (Objects.equals(jogoDaVelha[1][2], null)) {
                            jogoDaVelha[1][2] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 7:
                        if (Objects.equals(jogoDaVelha[2][0], null)) {
                            jogoDaVelha[2][0] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 8:
                        if (Objects.equals(jogoDaVelha[2][1], null)) {
                            jogoDaVelha[2][1] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                        break;
                    case 9:
                        if (Objects.equals(jogoDaVelha[2][2], null)) {
                            jogoDaVelha[2][2] = s2;
                            StatusPosition2 = "ocupada";
                        } else {
                            System.out.println("Posição já ocupada!");
                            contador2++;
                        }
                }
            }
        }
    }

    private static void VerificaEmpate()
    {
        int arm = 0;
        for (int linha = 0; linha < 3; linha++)
            for (int coluna = 0; coluna < 3; coluna++) {
                if (jogoDaVelha[linha][coluna] != null) {
                    arm++;
                    if (arm == 9) {
                        System.out.println("EMPATE!");
                        System.exit(0);
                    }
                }
            }
    }

    private static void RepresentacaoDoAmbiente() {
        System.out.println("Posições do game: ");
        System.out.printf("  %s  |  %s  |  %s  \n", jogoDaVelha[0][0], jogoDaVelha[0][1], jogoDaVelha[0][2]);
        System.out.printf("  %s  |  %s  |  %s  \n", jogoDaVelha[1][0], jogoDaVelha[1][1], jogoDaVelha[1][2]);
        System.out.printf("  %s  |  %s  |  %s  \n", jogoDaVelha[2][0], jogoDaVelha[2][1], jogoDaVelha[2][2]);
    }

    private static void TabelaRepresentacao() {
        System.out.println("Representação das posições abaixo: ");
        System.out.println(" 1  |  2  |  3 ");
        System.out.println(" 4  |  5  |  6 ");
        System.out.println(" 7  |  8  |  9 ");
    }

    private static void MsgVencedorDoJogo() throws InterruptedException {
        System.out.print("Xéque mate");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.print(".");
        sleep(500);
        System.out.println(".");
        System.out.println("Ops,jogo errado,mas temos um vencedor,parabéns " + vencedorDoJogo);
    }

    private static void FinalizaJogo() throws InterruptedException {
        if(vencedorDoJogo.equals(J1))
        {
            RepresentacaoDoAmbiente();
            System.out.println("Jogador 1 vencedor do jogo!");
            MsgVencedorDoJogo();
            System.exit(0);
        }
        else if(vencedorDoJogo.equals(J2))
        {
            RepresentacaoDoAmbiente();
            System.out.println("Jogador 2 vencedor do jogo!");
            MsgVencedorDoJogo();
            System.exit(0);
        }
    }
}