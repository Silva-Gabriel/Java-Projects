import java.util.Arrays;
public class Filas {

    String[] dados;
    int capacidade;
    int ultimo;
    int elementos;

    public Filas(int capacidade)
    {
        this.dados = new String[capacidade];
        this.capacidade = capacidade;
    }

    public Boolean cheia()
    {
        return this.elementos == this.capacidade;
    }

    public Boolean vazia()
    {
        return this.elementos == 0;
    }

    public void adicionar(String nome)
    {
        if(cheia())
            System.out.println("Fila cheia!");
        else
        {
            this.dados[ultimo] = nome;
            this.ultimo++;
            this.elementos++;
            System.out.println("\n"+nome+" entrou na fila!");
        }
    }

    public void remover()
    {
        if(vazia())
        {
            System.out.println("\nNão tem fila!");
        }
        else
        {
            String pessoaRemovida = dados[0];
            this.dados[0] = "";
            System.out.println("\n"+pessoaRemovida+" foi removido(a) da fila");
            ultimo--;
            elementos--;
            moverFila();
        }
    }

    public void moverFila()
    {
        if(this.elementos <= this.capacidade-1)
        {
            for(int i = 0;i < this.capacidade-1;i++)
            {
                this.dados[i] = this.dados[i+1];
            }
            this.dados[ultimo] = null;
        }
    }

    @Override
    public String toString() {
        return "Fila: (dados → " + Arrays.toString(dados)+")";
    }

    public void dadosOrdenados()
    {
        System.out.print("Dados ordenados: ");
        for(int i = 0; i < elementos; i++)
            System.out.print(dados[i]+" ");
    }
}
