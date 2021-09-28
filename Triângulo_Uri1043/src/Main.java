import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float perimetro;
        float area;

        float lado1 = entrada.nextFloat();
        float lado2 = entrada.nextFloat();
        float lado3 = entrada.nextFloat();

        boolean triangulo = lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2;
        if(triangulo)
        {
            perimetro = lado1+lado2+lado3;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }
        else
        {
            area = ((lado1+lado2)*lado3)/2;
            System.out.printf("Area = %.1f\n",area);
        }
    }
}
