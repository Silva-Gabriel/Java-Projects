import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Criando a estrutura de fila
        System.out.print("Qual a capacidade da fila? ");
        short f = entrada.nextShort();
        Filas fila = new Filas(f);

        System.out.println("[1] Adicionar à fila\n[2] remover da fila\n[3] Visualizar todos\n[4] sair\n");
        System.out.print("Sua escolha: ");
        byte option = entrada.nextByte();

        while(option != 4)
        {
            switch (option) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = entrada.next();
                    fila.adicionar(nome);
                }
                case 2 -> {
                    fila.remover();
                }
                case 3 ->{
                    for(byte i = 0;i < fila.capacidade;i++)
                        System.out.println(fila.dados[i]);
                }
            }
            System.out.println("[1] Adicionar à fila\n[2] remover da fila\n[3] Visualizar todos\n[4] sair\n");
            System.out.print("Sua escolha: ");
            option = entrada.nextByte();
        }
    }
}