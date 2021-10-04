//REVISAR DESAFIO
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int maior = Math.max(x,y);
        int menor = Math.min(x,y);
        ArrayList<Integer> valoresArmazenados = new ArrayList<>();

        for(int i = menor;i < maior;i++)
        {
            if(i % 5 == 2 || i % 5 == 3)
                valoresArmazenados.add(i);
        }
        int[] valores = new int[valoresArmazenados.size()];
        for(int i = 0; i < valoresArmazenados.size();i++)
            valores[i] = valoresArmazenados.get(i);
        Arrays.sort(valores);
        for (int valor : valores) System.out.println(valor);
    }
}
