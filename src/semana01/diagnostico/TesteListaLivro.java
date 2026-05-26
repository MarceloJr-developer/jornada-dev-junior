package semana01.diagnostico;

import java.util.ArrayList;
import java.util.List;

public class TesteListaLivro {

    public static void main(String[] args) {
        // 1. Lista de livros (já feito pra você)
        List<Livro> biblioteca = new ArrayList<>();
        biblioteca.add(new Livro("O Hobbit", 310));
        biblioteca.add(new LivroDigital("Clean Code", 464, 4.2));
        biblioteca.add(new LivroDigital("Effective Java", 412, 6.7));

        // 2. Imprime cada livro + total (reaproveitando lógica do nível 6)
        double soma = 0;
        for (Livro b : biblioteca) {
            System.out.printf("%s -> R$ %.2f%n", b.getTitulo(), b.calcularPreco());
            soma += b.calcularPreco();
        }
        System.out.printf("TOTAL: R$ %.2f%n", soma);

        // 3. SEU TRABALHO: chamar maisCaro e imprimir o resumo do livro mais caro
        // Use a chamada: maisCaro(biblioteca)
        // E em seguida, .resumo() no resultado
        // Imprima no formato: "MAIS CARO: <resumo>"
        // Escreva 1 linha de código aqui abaixo:


    }

    // SEU TRABALHO: implementar este método static
    // Recebe a lista de livros e retorna o livro com MAIOR calcularPreco()
    // Algoritmo: começa assumindo o primeiro é o maior;
    //            percorre os outros; se achar maior, atualiza;
    //            retorna o maior no final.
    //public static Livro maisCaro(List<Livro> livros) {
        //for(Livro l : livros) {
            //if(l.calcularPreco() > )
       // }


    }
