import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorX = input.nextInt();
        int valorY = input.nextInt();

        System.out.print(verificaValores(valorX,valorY));
    }

    public static String verificaValores(int valor1, int valor2)
    {
        StringBuilder view = new StringBuilder();
        int maior = Math.max(valor1,valor2);
        ArrayList<Integer> resultado = new ArrayList<>();

        for(int menor = Math.min(valor1,valor2);menor < maior;menor++)
        {
            if(menor % 5 == 2 || menor % 5 == 3 )
                resultado.add(menor);
        }
        for(int i = 0;i < resultado.size();i++)
        {
            view.append(resultado.get(i));
            if(i < resultado.size()-1)
                view.append("\n");
        }
        return view.toString();
    }
}