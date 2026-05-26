package semana01.diagnostico;

public class TesteHeranca {
    public static void main(String[] args){

        Livro livro1 = new Livro("O Hobbit", 310);
        Livro livro2 = new LivroDigital("Clean Code", 464, 4.2);

        System.out.println(livro1.resumo());
        System.out.println(livro2.resumo());



    }
}