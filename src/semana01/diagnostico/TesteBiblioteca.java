package semana01.diagnostico;


public class TesteBiblioteca {
    public static void main(String[] args){

        Livro[] biblioteca = new Livro[3];
        biblioteca[0] = new Livro("O Hobbit", 310);
        biblioteca[1] = new LivroDigital("Clean Code", 464, 4.2);
        biblioteca[2] = new LivroDigital("Effective Java", 412, 6.7);

        for(Livro b : biblioteca){
            System.out.println(b.resumo());
        }

    }
}

