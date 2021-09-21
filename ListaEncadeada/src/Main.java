import java.util.Scanner;
import java.util.Objects;
public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        GerenciadorLista gerenciador = new GerenciadorLista();
        System.out.println("O que deseja fazer?");
        System.out.println("\n[1] - Adicionar\n[2] - Remover\n[3] - Mostrar lista\n[4] - Consultar dado\n[5] - Sair");
        System.out.print("sua opcão: ");
        int opcao = entrada.nextInt();

        while(opcao != 5)
        {
            switch (opcao) {
                case 1 -> {
                    System.out.print("Qual item deseja adicionar?");
                    int valor = entrada.nextInt();
                    gerenciador.adicionar(valor);
                }
                case 2 -> gerenciador.remover();
                case 3 -> gerenciador.visualizarLista();
                case 4 -> {
                    System.out.print("Digite o valor a ser consultado na lista: ");
                    int valorConsulta = entrada.nextInt();
                    if(Objects.equals(gerenciador.Consultar(valorConsulta),true))
                        System.out.println("\nValor está contido na lista!");
                    else
                        System.out.println("\nValor não está contido na lista!");
                }
            }
            System.out.println("\nO que deseja fazer?");
            System.out.println("\n[1] - Adicionar\n[2] - Remover\n[3] - Mostrar lista\n[4] - Consultar dado\n[5] - Sair");
            System.out.print("sua opcão: ");
            opcao = entrada.nextInt();
        }
    }
}