import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a capacidade da pilha? ");
        int p = entrada.nextInt();
        Pilhas pilhas = new Pilhas(p);

        //Usuário decide se quer empilhar
        System.out.println("\n[1] Empilhar\n[2] Desempilhar\n[3] Visualizar\n[4] Sair");
        System.out.print("O que deseja fazer: ");
        int escolha = entrada.nextInt();
        while(escolha != 4)
        {
            switch (escolha) {
                case 1 -> {
                    System.out.println("Qual número deseja empilhar? ");
                    int num = entrada.nextInt();
                    pilhas.empilha(num);
                }
                case 2 -> {
                    pilhas.desempilha();
                    System.out.println(pilhas.item+" foi removido da pilha!");
                }
                case 3 -> {
                    if (pilhas.pilhaVazia())
                        System.out.println("Pilha vazia!");
                    else {
                        System.out.println("Itens da pilha: ");
                        for (int i = 0; i < pilhas.capacidadePilha; i++)
                            System.out.print(pilhas.pilha[i] + " ");
                    }
                    pilhas.dadosOrdenados();
                }
            }
            System.out.println("\n[1] Empilhar\n[2] Desempilhar\n[3] Visualizar\n[4] Sair");
            System.out.print("O que deseja fazer: ");
            escolha = entrada.nextInt();
        }
    }
}
