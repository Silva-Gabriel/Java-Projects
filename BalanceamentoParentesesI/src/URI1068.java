import java.util.Scanner;

public class URI1068 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String expressao;

        while (entrada.hasNext()) {
            boolean correto = true;
            Pilha pilha1 = new Pilha();
            expressao = entrada.nextLine();

            for (int i = 0; i < expressao.length() && correto; i++) {
                if (expressao.charAt(i) == '(')
                    pilha1.empilhar(expressao.charAt(i));
                else if (expressao.charAt(i) == ')') {
                    if (pilha1.vazia())
                        correto = false;
                    else
                        pilha1.desempilhar();
                }
            }
            if (pilha1.vazia() && correto)
                System.out.println("correct");
            else
                System.out.println("incorrect");
        }
    }

    public static class Pilha {
        private int topo;
        private char[] elementos;

        public Pilha()
        {
            this.topo = -1;
            elementos = new char[1000];
        }

        public boolean vazia()
        {
            return topo == -1;
        }

        public void empilhar(char e)
        {
            topo++;
            elementos[topo] = e;
        }

        public char desempilhar()
        {
            char ele = elementos[topo];
            topo--;
            return ele;
        }
    }
}