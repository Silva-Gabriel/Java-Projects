import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> stringsCultivadas = new ArrayList<>();
        ArrayList<Integer> numSequencia = new ArrayList<>();
        String atual;
        String anterior;
        int verificador = 0;
        int opcaoUsuario = entrada.nextInt();
        entrada.nextLine();

        while(true)
        {
            if(opcaoUsuario == 0)
                break;

            for(int i = 0; i < opcaoUsuario;i++)
            {
                String strings = entrada.nextLine();
                stringsCultivadas.add(strings);
                atual = stringsCultivadas.get(i);
                if(i > 0)
                {
                    anterior = stringsCultivadas.get(i-1);
                    if(atual.contains(anterior))
                        verificador++;
                }
            }
            numSequencia.add(verificador);
            opcaoUsuario = entrada.nextInt();
            entrada.nextLine();
            verificador = 0;
        }
        for(int i = 0;i < numSequencia.size();i++)
            System.out.println(numSequencia.get(i));
    }
}
