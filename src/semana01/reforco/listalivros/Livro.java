package semana01.reforco.listalivros;

public class Livro implements Vendavel{
    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }


    public String resumo(){
        return "Livro: " + getTitulo() +  ", " + getPaginas() + " paginas";
    }

    @Override
    public double calcularPreco() {
        return getPaginas() * 0.5;
    }
}
