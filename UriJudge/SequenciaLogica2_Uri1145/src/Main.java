import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int contaLinhas = 0;

        for(int i = 1;i <= y;++i)
        {
            System.out.printf("%d",i);
            contaLinhas += 1;
            if(contaLinhas == x)
            {
                System.out.println();
                contaLinhas = 0;
            }
            else
                System.out.print(" ");
        }
    }
}
