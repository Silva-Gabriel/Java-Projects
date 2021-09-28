public class GerenciadorLista
{
    No inicio;
    int Qelementos;
    public No ultimo;
    public No penultimo;

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

    public No ultimo()
    {
        No ultimo=inicio;
        for(No aux=inicio;aux!=null;aux = aux.proximo)
            ultimo = aux;
        return ultimo;
    }

    public void adicionaFim(int valor)
    {
        if(vazia())
        {
            adicionar(valor);
        }
        else
        {
            ultimo = ultimo();
            ultimo.proximo = new No(valor);
            Qelementos++;
        }
    }

    public No penultimo()
    {
        penultimo=inicio;
        for(int i = 1;i != Qelementos-1;i++) {
            penultimo = penultimo.proximo;
        }
        return penultimo;
    }

    public void removeFim()
    {
        if(!vazia())
        {
            if(Qelementos == 1)
            {
                remover();
            }
            else
            {
                if(vazia())
                {
                    System.out.println("Lista vazia");
                }
                else {
                    penultimo = penultimo();
                    penultimo.proximo = null;
                }
                Qelementos--;
            }
        }
        else
        {
            System.out.println("Lista vazia!");
        }
    }
}