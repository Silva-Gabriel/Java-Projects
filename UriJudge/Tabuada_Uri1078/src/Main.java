import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();
        for(int contador = 1;contador <= 10;contador++)
        {
            System.out.println(contador+" x "+ valor + " = " + valor*contador );
        }
    }
}
