public class Estoque {
    private Produto[] produtos;
    private int total;

    public Estoque(int capacidade) {
        Produto[] produtos = new Produto[capacidade];
        total = 0;
        this.produtos = produtos;
    }

    public boolean adicionar(Produto p) {
        if (p == null || total == produtos.length) {
            return false;
        }

        produtos[total] = p;
        total++;

        return true;
    }

    public int totalUnidades() {
        int soma = 0;
        for (Produto p : produtos) {
            if (p == null) {
                continue;
            }
            soma += p.getQuantidade();
        }

        return soma;
    }

    public int contarParaRepor() {
        int contador = 0;
        for (Produto p : produtos) {
            if (p == null) {
                continue;
            }
            if (p.precisaRepor()) {
                contador++;
            }
        }

        return contador;
    }

    public void listar() {
        for (Produto p : produtos) {
            if (p == null) {
                continue;
            }
            System.out.println(p);
            if (p.precisaRepor()) {
                System.out.println(" | *ABAIXO DO ESTOQUE MÍNIMO");
            }
        }
    }
}
