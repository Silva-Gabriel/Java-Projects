import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 0;i < n;i++)
        {
            int valor = input.nextInt();
            if(valor % 2 == 0 && valor < 0)
                System.out.println("EVEN NEGATIVE");
            else if(valor % 2 != 0 && valor < 0)
                System.out.println("ODD NEGATIVE");
            else if(valor % 2 == 0 && valor > 0)
                System.out.println("EVEN POSITIVE");
            else if(valor > 0)
                System.out.println("ODD POSITIVE");
            else{
                System.out.println("NULL");
            }
        }
    }
}
