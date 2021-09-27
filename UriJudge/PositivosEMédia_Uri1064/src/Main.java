import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int positivos = 0;
        float media = 0;
        float[] valores = new float[6];

        for(int i = 0;i < 6;i++)
        {
            valores[i] = entrada.nextFloat();
            if (valores[i] > 0)
            {
                media += valores[i];
                positivos++;
            }
        }
        media /= positivos;
        System.out.printf("%d valores positivos\n%.1f\n".replace(",","."),positivos,media);
    }
}
