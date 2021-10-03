import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalLinhas = entrada.nextInt();
        entrada.nextLine();
        String[] textoAlternativo = new String[totalLinhas];
        int ascii;
        char antigo;
        char novo;

        for (int linha = 0; linha < totalLinhas; linha++) {
            textoAlternativo[linha] = entrada.nextLine();
            for (int index = 0; index < textoAlternativo[linha].length(); index++) {
                //Adicionando 3 pontos ao valor inteiro ASCII correspondente ao caractér
                if (Character.isLetter(textoAlternativo[linha].charAt(index)))
                {
                    antigo = textoAlternativo[linha].charAt(index);
                    ascii = antigo + 3;
                    novo = (char) ascii;
                    textoAlternativo[linha] = modificaChar(textoAlternativo[linha],index,novo);
                }
            }

            //Invertendo as Strings
            textoAlternativo[linha] = retornaFraseInvertida(textoAlternativo[linha]);

            //Subtraindo 1 ponto ao valor inteiro ASCII correspondente ao caractér
            if(textoAlternativo[linha].length() % 2 == 0)
            {
                for (int index = textoAlternativo[linha].length()/2; index < textoAlternativo[linha].length(); index++)
                {
                    antigo = textoAlternativo[linha].charAt(index);
                    ascii = antigo-1;
                    novo = (char) ascii;
                    textoAlternativo[linha] = modificaChar(textoAlternativo[linha],index,novo);
                }
            }
            else
            {
                for (int index = textoAlternativo[linha].length()/2; index < textoAlternativo[linha].length(); index++)
                {
                    antigo = textoAlternativo[linha].charAt(index);
                    ascii = antigo-1;
                    novo = (char) ascii;
                    textoAlternativo[linha] = modificaChar(textoAlternativo[linha],index,novo);
                }
            }
            System.out.println(textoAlternativo[linha]);
        }
    }

    public static String retornaFraseInvertida(String frase)
    {
        return new StringBuilder(frase).reverse().toString();
    }

    public static String modificaChar(String frase, int index, char caracter)
    {
        StringBuilder fraseModificada = new StringBuilder(frase);
        fraseModificada.setCharAt(index,caracter);
        return fraseModificada.toString();
    }
}
