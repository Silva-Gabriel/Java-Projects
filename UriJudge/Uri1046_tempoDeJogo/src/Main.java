import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horaInicio = entrada.nextInt();
        int horaFim = entrada.nextInt();
        int horaDuracao = 0;

        if(horaInicio == horaFim)
        {
            horaDuracao = 24;
            System.out.println("O JOGO DUROU "+horaDuracao+" HORA(S)");
            System.exit(0);
        }

        if(horaInicio > horaFim)
        {
            while(horaInicio != horaFim)
            {
                horaDuracao++;
                horaInicio++;
                if (horaInicio == 24)
                    horaInicio = 0;
            }
        }
        else {
            while(horaFim != horaInicio)
            {
                horaDuracao++;
                horaInicio++;
            }
        }

        System.out.println("O JOGO DUROU "+horaDuracao+" HORA(S)");
    }
}
