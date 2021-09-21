public class GerenciadorLista
{
    No inicio;
    int Qelementos;

    public GerenciadorLista()
    {
        Qelementos = 0;
        inicio = null;
    }

    public boolean vazia()
    {
        return Qelementos == 0;
    }

    public void adicionar(int v)
    {
        No novo = new No(v);
        novo.proximo = inicio;
        inicio = novo;
        Qelementos++;
    }

    public No remover()
    {
        No aux = inicio;
        if(vazia())
        {
            System.out.println("Lista vazia");
        }
        else
        {
            inicio = inicio.proximo;
            Qelementos--;
        }
        return aux;
    }

    public void visualizarLista()
    {
        if(!vazia())
        {
            int i = 0;
            for (No aux=inicio; aux!=null; aux = aux.proximo)
            {
                System.out.print(i+"º: " + aux.dado + " → ");
                i++;
            }
        }
        else
            System.out.print("Lista Vazia!");
    }

    public boolean Consultar(int dadoProcurado)
    {
        for(No aux=inicio; aux!=null; aux = aux.proximo)
        {
            if(dadoProcurado == aux.dado)
                System.out.println("\nValor está contido na lista!");
            return true;
        }
        System.out.println("\nValor não está contido na lista!");
        return false;
    }
}