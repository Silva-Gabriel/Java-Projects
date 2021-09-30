import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idades = 0;
        double total = 0;
        int count = 0;

        while(idades >= 0)
        {
            idades = entrada.nextInt();
            if(idades > 0)
            {
                count++;
                total += idades;
            }
        }
        total = total/count;
        System.out.printf("%.2f\n",total);
    }
}
