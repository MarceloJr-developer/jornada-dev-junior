package semana01.reforco.listalivros;


public class LivroDigital extends Livro {
    private double tamanhoMb;

    public LivroDigital(String titulo, int paginas, double tamanhoMb){
        super(titulo, paginas);
        this.tamanhoMb = tamanhoMb;
    }

    public double getTamanhoMb(){
        return tamanhoMb;
    }

    @Override
    public String resumo(){
        return "Livro digital: " + getTitulo() + ", " + getPaginas() + " paginas, " + getTamanhoMb() + " MB";
    }

    @Override
    public double calcularPreco() {
        return getPaginas() * 0.3 + getTamanhoMb() * 0.1;
    }
}
