package semana01.diagnostico;


public class TestePreco {
    public static void main(String[] args){


        double soma = 0;

        Livro[] biblioteca = new Livro[3];
        biblioteca[0] = new Livro("O Hobbit", 310);
        biblioteca[1] = new LivroDigital("Clean Code", 464, 4.2);
        biblioteca[2] = new LivroDigital("Effective Java", 412, 6.7);

        for(Livro b : biblioteca){
            System.out.printf("%s -> R$ %.2f%n", b.getTitulo(), b.calcularPreco());
            soma += b.calcularPreco();
        }

        System.out.printf("TOTAL: R$ %.2f%n", soma);
    }
}
