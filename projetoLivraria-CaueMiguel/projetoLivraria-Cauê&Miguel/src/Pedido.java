import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido\n" + cliente + produtos + "\n[Total = " + calcularTotal() + "]";
    }

    public static void main(String[] args) {
        // Criação de alguns produtos
        Livro livro1 = new Livro(1, "Java: Como Programar", "Deitel & Deitel", 200.00, "dura", 1000);
        EBook ebook1 = new EBook(345, "Clean Code", "Robert Cecil", 100.00, "PDF");

        // Criação de um cliente
        Cliente cliente = new Cliente("João Silva", "joao.silva@email.com");

        // Criação de um pedido
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(livro1);
        pedido.adicionarProduto(ebook1);

        // Exibindo os detalhes do pedido
        System.out.println(pedido);
    }
}


