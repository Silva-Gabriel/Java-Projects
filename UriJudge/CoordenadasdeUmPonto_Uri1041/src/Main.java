import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float coordenadaX = entrada.nextFloat();
        float coordenadaY = entrada.nextFloat();

        if(coordenadaX > 0 && coordenadaY > 0)
            System.out.println("Q1");
        else if(coordenadaX < 0 && coordenadaY < 0)
            System.out.println("Q3");
        else if(coordenadaX < 0 && coordenadaY > 0)
            System.out.println("Q2");
        else if(coordenadaX > 0 && coordenadaY < 0)
            System.out.println("Q4");
        else if(coordenadaX == 0.0 && coordenadaY == 0.0)
            System.out.println("Origem");
        else if(coordenadaX == 0.0 && coordenadaY != 0.0)
            System.out.println("Eixo Y");
        else if(coordenadaX != 0.0 && coordenadaY == 0.0)
            System.out.println("Eixo X");
    }
}
