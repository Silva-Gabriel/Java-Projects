import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        //Instância sem parâmetro
        Listas listaComPar = new Listas(10);

        listaComPar.opcoes();
        System.out.println("O que deseja fazer: ");
        int suaOpcao = entrada.nextInt();

        while(suaOpcao < 1 || suaOpcao > 6)
        {
            System.out.println("Opção inválida!");
            System.out.print("Sua opção: ");
            suaOpcao = entrada.nextInt();
        }

        while (true)
        {
            switch (suaOpcao)
            {
                case 1:
                    if(listaComPar.vazia())
                    {
                        //Cria lista
                        for(int i = 1;i <= listaComPar.capacidade;i++ )
                        {
                            System.out.printf("Digite o %d º filme: ",i);
                            listaComPar.filmes[i-1] = entrada.next();
                            listaComPar.tamanho++;
                        }
                    }
                    break;

                case 2:
                    listaComPar.mostraLista();
                    System.out.print("Qual filme deseja excluir?");
                    int ifilme = entrada.nextInt();
                    listaComPar.excluir(ifilme);
                    listaComPar.tamanho--;
                    break;

                case 3:
                    listaComPar.mostraLista();
                    System.out.print("Qual filme deseja atualizar: ");
                    int afilme = entrada.nextInt();
                    String nfilme = entrada.next();
                    listaComPar.atualizar(afilme,nfilme);
                    break;

                case 4:
                    listaComPar.mostraLista();
                    break;
                case 5:
                    listaComPar.esvaziaLista();
                    listaComPar.tamanho = 0;
                case 6:
                    System.exit(0);
            }
            sleep(500);
            System.out.print("O que deseja fazer: ");
            suaOpcao = entrada.nextInt();
        }
    }
}