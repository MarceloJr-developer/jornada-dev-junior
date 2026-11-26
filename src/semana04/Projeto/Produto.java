public class Produto {
    private final String nome;
    private int quantidade;
    private final int minimo;

    public Produto(String nome, int quantidade, int minimo) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (quantidade < 0 || minimo < 0) {
            throw new IllegalArgumentException("quantidade e/ou minimo inválido");
        }

        this.nome = nome;
        this.quantidade = quantidade;
        this.minimo = minimo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean entrada(int qtd) {
        if (qtd > 0) {
            quantidade = quantidade + qtd;
            return true;
        }

        return false;
    }

    public boolean saida(int qtd) {
        if (qtd <= 0 || qtd > quantidade) {
            return false;
        }

        quantidade = quantidade - qtd;
        return true;
    }

    public boolean precisaRepor() {
        return quantidade < minimo;
    }

    @Override
    public String toString() {
        return "Café " + nome + ": " + quantidade + " un (mín. " + minimo + ")";
    }
}
