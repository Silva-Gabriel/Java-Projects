import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();
        int[] armazenaLeds = new int[valor];

        for(int casos = 0;casos < valor;casos++)
        {
            String numero = entrada.next();
            for(int i = 0; i < numero.length();i++)
                armazenaLeds[casos] += retornaQntLeds(numero.charAt(i));
        }

        for(int i = 0; i < valor;i++)
            System.out.println(armazenaLeds[i]+" leds");
    }
    public static int retornaQntLeds(char caracter)
    {
        int leds;
        if(caracter == '1')
            leds = 2;
        else if(caracter == '2' || caracter == '3' || caracter == '5')
            leds = 5;
        else if(caracter == '4')
            leds = 4;
        else if(caracter == '6' || caracter == '9' || caracter == '0')
            leds = 6;
        else if(caracter == '7')
            leds = 3;
        else
            leds = 7;
        return leds;
    }
}
