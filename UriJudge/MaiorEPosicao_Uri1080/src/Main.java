import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = 100;
        int maior = 0;
        int posicaoMaior = 0;

        for(int tamanho = 0; tamanho < quantidade;tamanho++)
        {
            int valor = entrada.nextInt();
            if(valor > maior)
            {
                maior = valor;
                posicaoMaior = tamanho+1;
            }
        }
        System.out.println(maior);
        System.out.println(posicaoMaior);

    }
}
