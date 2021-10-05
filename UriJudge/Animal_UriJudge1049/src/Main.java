import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       String definicao1 = entrada.next().toLowerCase(Locale.ROOT);
       String definicao2 = entrada.next().toLowerCase(Locale.ROOT);
       String definicao3 = entrada.next().toLowerCase(Locale.ROOT);

       if(definicao1.equals("vertebrado"))
       {
           if(definicao2.equals("ave"))
           {
               if(definicao3.equals("carnivoro"))
                   System.out.println("aguia");
               else if(definicao3.equals("onivoro"))
                   System.out.println("pomba");
           }
           else if(definicao2.equals("mamifero"))
           {
               if(definicao3.equals("onivoro"))
                   System.out.println("homem");
               else if(definicao3.equals("herbivoro"))
                   System.out.println("vaca");
           }
       }
       else if(definicao1.equals("invertebrado"))
       {
           if(definicao2.equals("inseto"))
           {
               if(definicao3.equals("hematofago"))
                   System.out.println("pulga");
               else if(definicao3.equals("herbivoro"))
               System.out.println("lagarta");
           }
           else if(definicao2.equals("anelideo"))
           {
               if(definicao3.equals("hematofago"))
                   System.out.println("sanguessuga");
               else if(definicao3.equals("onivoro"))
               System.out.println("minhoca");
           }
       }
    }
}
