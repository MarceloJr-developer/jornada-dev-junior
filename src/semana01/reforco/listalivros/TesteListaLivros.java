package semana01.reforco.listalivros;

import java.util.ArrayList;
import java.util.List;



public class TesteListaLivros {
    public static Livro maisCaro(List<Livro> livros){

        if (livros.isEmpty()){
            throw new IllegalArgumentException("ERRO: LISTA VAZIA");
        }

        Livro livroCaro = livros.get(0);

        for (Livro l : livros){
            if(l.calcularPreco() > livroCaro.calcularPreco()){
                livroCaro = l;
            }
        }
        return livroCaro;
    }
     public static void main(String[] args) {

         List<Livro> biblioteca = new ArrayList<>();
         double somaLivros = 0;



         biblioteca.add(new Livro("O Hobbit", 310));
         biblioteca.add(new LivroDigital("Clean Code", 464, 4.2));
         biblioteca.add(new LivroDigital("Effective Java", 412, 6.7));

         for(Livro l : biblioteca){
             System.out.println(l.resumo());
             somaLivros += l.calcularPreco();
         }

         System.out.printf("TOTAL: R$ %.2f%n", somaLivros);
         System.out.println("MAIS CARO: " + maisCaro(biblioteca).resumo() );


    }
}
