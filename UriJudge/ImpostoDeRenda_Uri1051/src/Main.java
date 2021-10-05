import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salarioPessoa = entrada.nextDouble();
        double valorImposto = 0;
        double diferenca;

        if(salarioPessoa >= 0.00 && salarioPessoa < 2000.00)
            System.out.println("Isento");
        else if(salarioPessoa > 4500.00)
        {
            valorImposto = 1000.00 * 0.08 + 1500.00 * 0.18;
            diferenca = salarioPessoa - 4500.00;
            valorImposto += diferenca * 0.28;
        }
        else if(salarioPessoa > 3000.00)
        {
            valorImposto = 1000.00 * 0.08;
            diferenca = salarioPessoa - 3000.00;
            valorImposto += diferenca * 0.18;
        }
        else if(salarioPessoa > 2000.00)
        {
            diferenca = salarioPessoa - 2000.00;
            valorImposto = diferenca * 0.08;
        }
        if(valorImposto > 0.00)
            System.out.printf("R$ %.2f\n",valorImposto);
    }
}
