import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Entrada de dados
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        float nota4 = entrada.nextFloat();
        float notaExame;

        //media
        float media = ((nota1)*2+(nota2)*3+(nota3)*4+(nota4))/10;
        System.out.printf("Media: %.1f\n",media);

        //casos de teste
        if(media >= 7)
            System.out.println("Aluno aprovado.");
        else if(media < 5)
            System.out.println("Aluno reprovado.");
        else
        {
            System.out.println("Aluno em exame.");
            notaExame = entrada.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",notaExame);
            media = (media+notaExame)/2;
            if(media >=  5)
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f\n",media);
        }
    }
}
