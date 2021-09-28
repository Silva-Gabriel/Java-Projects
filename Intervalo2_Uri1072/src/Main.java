import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int inIntervalo = 0;
        int outIntervalo = 0;

        int quantValoresLidos = entrada.nextInt();
        for(int valores = 0;valores < quantValoresLidos;valores++)
        {
            valor = entrada.nextInt();
            if(valor >= 10 && valor <= 20)
                inIntervalo++;
            else
                outIntervalo++;
        }
        System.out.printf("%d in\n%d out\n",inIntervalo,outIntervalo);
    }
}
