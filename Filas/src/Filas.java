public class Filas {

    String[] dados;
    short capacidade;
    short ultimo = 0;
    short elementos = 0;

    public Filas(short capacidade)
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
        System.out.println("Digite um nome para adicionar a fila: ");
        this.dados[ultimo] = nome;
        this.ultimo++;
        this.elementos++;
        System.out.println(nome+" entrou na fila!");
    }

    public void remover()
    {
        if(!vazia())
        {
            String pessoaRemovida = dados[0];
            this.dados[0] = null;
            System.out.println(pessoaRemovida+" foi removido(a) da fila");
            elementos--;
            moverFila();
        }
        else
            System.out.println("Não tem fila!");
    }

    public void moverFila()
    {
        if(this.elementos <= this.capacidade-1)
        {
            int i = 0;
            while (i < this.capacidade-1) {
                this.dados[i] = this.dados[i+1];
                i++;
            }
        }
    }
}
