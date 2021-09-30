import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorValores = new int[10];
        int valor = entrada.nextInt();

        for(int i = 0;i < 10;i++)
        {
            if(i == 0)
                vetorValores[i] = valor;
            else
            {
                valor += valor;
                vetorValores[i] = valor;
            }
        }
        for(int i = 0;i < 10;i++)
        {
            System.out.println("N["+i+"]"+" = "+vetorValores[i]);
        }
    }
}
