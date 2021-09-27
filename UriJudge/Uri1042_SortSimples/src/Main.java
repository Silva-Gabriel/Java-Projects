import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[3];
        int[] valoresReais = new int[3];

        for(int i = 0; i < 3;i++)
            valoresReais[i] = entrada.nextInt();

        System.arraycopy(valoresReais, 0, valores, 0, 3);

        Arrays.sort(valores);

        for(int i = 0; i < 3;i++)
            System.out.println(valores[i]);

        System.out.println();

        for(int i = 0; i < 3;i++)
            System.out.println(valoresReais[i]);
    }
}
