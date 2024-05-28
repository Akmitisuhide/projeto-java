
public class Livro extends Produto{
    private String capa;
    private int paginas;

    public Livro(int id, String titulo, String autor, Double preco, String capa, int paginas){
        super(id, titulo, autor, preco);
        this.capa = capa;
        this.paginas = paginas;
    }

    public String getCapa(){
        return capa;
    }

    public void setCapa(String capa){
        this.capa = capa;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    @Override
    public String toString(){
        return "Livro [ " + getId() + " | " + getTitulo() + " | " + getAutor() + " | " + getPreco() + " Reais | Capa " + capa + " | " + paginas + " Páginas]";
    }
}
