import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Criando a estrutura de fila
        System.out.print("Qual a capacidade da fila? ");
        int f = entrada.nextInt();
        Filas fila = new Filas(f);

        System.out.println("\n[1] Adicionar à fila\n[2] remover da fila\n[3] Visualizar todos\n[4] sair\n");
        System.out.print("Sua escolha: ");
        byte option = entrada.nextByte();
        while(option < 1 || option > 4)
        {
            System.out.print("Por favor escolha uma opção valida\nSua opção: ");
            option = entrada.nextByte();
        }

        while(option != 4)
        {
            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = entrada.next();
                    fila.adicionar(nome);
                    break;
                case 2:
                    fila.remover();
                    break;
                case 3:
                    if(!fila.vazia())
                    {
                        System.out.println(fila);
                        fila.dadosOrdenados();
                    }
                    else
                        System.out.println("Sem dados para mostrar!");
                    break;
                default:
                    System.exit(0);
            }
            System.out.println("\n[1] Adicionar à fila\n[2] remover da fila\n[3] Visualizar todos\n[4] sair\n");
            System.out.print("Sua escolha: ");
            option = entrada.nextByte();
            while(option < 0 || option > 4)
            {
                System.out.print("Por favor escolha uma opção valida\nSua opção: ");
                option = entrada.nextByte();
            }
        }
    }
}