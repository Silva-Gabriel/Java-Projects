import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();

        for(int i = 0 ; i < casos;i++)
        {
            int jogador1 = entrada.nextInt();
            int jogador2 = entrada.nextInt();
            System.out.println(mdc(jogador1,jogador2));

        }
    }
    public static int mdc(int num1,int num2)
    {
        int resto;
        while(num2 != 0)
        {
            resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }
        return num1;
    }
}
