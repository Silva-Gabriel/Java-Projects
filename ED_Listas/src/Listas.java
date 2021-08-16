import java.util.Objects;

public class Listas {
    String[] filmes;
    int capacidade;
    int tamanho;

    //método construtor
    Listas(int c)
    {
        filmes = new String[c];
        capacidade = c;
    }

    public Boolean vazia()
    {
        return tamanho == 0;
    }

    public Boolean cheia()
    {
        return capacidade == tamanho;
    }

    public void opcoes()
    {
        System.out.println("[1] Adicionar filme\n[2] Remover filme\n[3] Atualizar filme\n[4] Ver lista\n[5] Esvaziar lista");
    }

    public void excluir(int indice)
    {
            filmes[indice] = "";
    }

    public void atualizar(int indice, String nfilme)
    {
        if(Objects.equals(filmes[indice],""))
            filmes[indice] = nfilme;
    }

    public void mostraLista()
    {
        for(int i = 0;i < capacidade;i++)
        {
            System.out.printf("| %dº filme: %s |\n", i+1,filmes[i]);
        }
    }

    public void esvaziaLista()
    {
        if(filmes.length == tamanho)
        {
            for(int i = 0; i < capacidade; i++)
                excluir(i);
        }
    }
}