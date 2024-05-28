public class EBook extends Produto {
    private String formato;

    public EBook(int id, String titulo, String autor, Double preco, String formato) {
        super(id, titulo, autor, preco);
        this.formato = formato;
    }

    public String getFormato(){
        return formato;
    }

    public void getFormato(String formato){
        this.formato = formato;
    }
    @Override
    public String toString(){
        return "\nEbook [ "+ getId() + " | "+ getTitulo() +" | "+ getAutor() +" | "+ getPreco() +" Reais | "+ formato + "]";
    }
}
