import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double numIntervalo = entrada.nextDouble();

        if(numIntervalo >= 0.00 && numIntervalo <= 25.00)
        {
            System.out.println("Intervalo [0,25]");
        }
        else if(numIntervalo >= 25.00 && numIntervalo <= 50.00)
        {
            System.out.println("Intervalo (25,50]");
        }
        else if(numIntervalo >= 50.00 && numIntervalo <= 75.00)
        {
            System.out.println("Intervalo (50,75]");
        }
        else if(numIntervalo >= 75.00 && numIntervalo <= 100.00)
        {
            System.out.println("Intervalo (75,100]");
        }
        else
        {
            System.out.println("Fora de intervalo");
        }
    }
}
