import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int soma = 0;


        if(x >= y)
        {
            for(int i = y;i <= x;i++)
            {
                if(i % 13 != 0)
                {
                    soma += i;
                }
            }
        }
        else
        {
            for(int i = x;i <= y;i++)
            {
                if(i % 13 != 0)
                {
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}
