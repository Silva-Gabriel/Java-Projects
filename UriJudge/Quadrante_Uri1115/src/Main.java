import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true)
        {
            int x = entrada.nextInt();
            int y = entrada.nextInt();

            if(x == 0 || y == 0)
                break;

            if(x > 0 && y > 0)
                System.out.println("primeiro");
            else if(x > 0)
                System.out.println("quarto");
            else if(y < 0)
                System.out.println("terceiro");
            else
                System.out.println("segundo");
        }
    }
}
