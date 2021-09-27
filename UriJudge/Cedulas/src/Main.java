import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        float valor = entrada.nextFloat();

        System.out.println((int)valor);
        int numNotas = (int)(valor / 100);
        valor %= 100;
        System.out.printf("%d nota(s) de R$ 100,00",numNotas );

        numNotas = (int)(valor / 50);
        valor %= 50;
        System.out.printf("\n%d nota(s) de R$ 50,00",numNotas );

        numNotas = (int)(valor / 20);
        valor %= 20;
        System.out.printf("\n%d nota(s) de R$ 20,00",numNotas );

        numNotas = (int)(valor / 10);
        valor %= 10;
        System.out.printf("\n%d nota(s) de R$ 10,00",numNotas );

        numNotas = (int)(valor / 5);
        valor %= 5;
        System.out.printf("\n%d nota(s) de R$ 5,00",numNotas );

        numNotas = (int)(valor / 2);
        valor %= 2;
        System.out.printf("\n%d nota(s) de R$ 2,00",numNotas );
        numNotas = (int)valor;
        System.out.printf("\n%d nota(s) de R$ 1,00\n",numNotas );
    }
}
