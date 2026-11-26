public class Main {

    public static void main(String[] args) {
        Estoque estoque = new Estoque(5);

        Produto p1 = new Produto("Adauto Guimarães", 10, 8);
        Produto p2 = new Produto("Irmãos Guimarães", 4, 10);
        Produto p3 = new Produto("Marcos Nalli", 5, 6);

        estoque.adicionar(p1);
        estoque.adicionar(p2);
        estoque.adicionar(p3);

        System.out.println("Entrada de -10 no " + p1.getNome() + ": " + p1.entrada(-10));
        System.out.println("Saída de 3 no " + p2.getNome() + ": " + p2.saida(3));
        System.out.println("Saída de 20 no " + p3.getNome() + ": " + p3.saida(20));
        System.out.println("Produtos para repor: " + estoque.contarParaRepor());
        estoque.listar();
        System.out.println("Total de unidades: " + estoque.totalUnidades());
    }
}
