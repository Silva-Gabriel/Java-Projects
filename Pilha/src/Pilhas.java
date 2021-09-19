import java.util.Arrays;

public class Pilhas
{
    int[] pilha;
    int posicaoPilha = -1;
    int capacidadePilha;
    int item;

    Pilhas(int p)
    {
        pilha = new int[p];
        capacidadePilha = p;
    }

    public Boolean pilhaVazia()
    {
        return posicaoPilha == -1;
    }

    public Boolean pilhaCheia()
    {
        return (posicaoPilha == capacidadePilha-1);
    }

    public void empilha(int e)
    {
        if (pilhaCheia())
        {
            System.out.println("Pilha Cheia! Erro!");
        }
        else
        {
            posicaoPilha++;
            pilha[posicaoPilha] = e;
        }
    }

    public void desempilha()
    {
        item = -1;
        if(pilhaVazia())
            System.out.println("Pilha vazia!");
        else {
            item = pilha[posicaoPilha];
            pilha[posicaoPilha--] = 0;
        }
    }

    @Override
    public String toString()
    {
        return "[dados="+Arrays.toString(pilha)+"]";
    }

    public void dadosOrdenados()
    {
        System.out.println();
        System.out.println("Dados ordenados: ");
        for(int i = 0; i <= posicaoPilha;i++)
            System.out.print(pilha[i]+" ");
    }
}