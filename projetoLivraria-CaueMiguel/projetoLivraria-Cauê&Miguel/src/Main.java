import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        int op;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Adicionar um livro");
            System.out.println("2. Ver livros");
            System.out.println("3. Excluir um livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    novoLivro.adicionarLivro(scanner, livros);
                    break;
                case 2:
                    verLivros.exibirLivros(livros);
                    break;
                case 3:
                    excluirLivro.removerLivro(scanner, livros);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println(); // linha em branco para melhor leitura
        } while (op != 4);

        scanner.close();
    }

    public static class novoLivro {
        public static void adicionarLivro(Scanner scanner, List<Livro> livros) {
            System.out.print("ID do Livro: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Título do Livro: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor do Livro: ");
            String autor = scanner.nextLine();
            System.out.print("Preço do Livro: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Tipo de capa do Livro: ");
            String capa = scanner.nextLine();
            System.out.print("Número de páginas do Livro: ");
            int paginas = scanner.nextInt();


            scanner.nextLine(); // Consumir a nova linha

            Livro livro = new Livro(id, titulo, autor, preco, capa, paginas);
            livros.add(livro);
            System.out.println("Livro adicionado com sucesso!");
        }
    }

    public static class verLivros {
        public static void exibirLivros(List<Livro> livros) {
            if (livros.isEmpty()) {
                System.out.println("Nenhum livro disponível.");
            } else {
                System.out.println("Livros disponíveis:");
                for (Livro livro : livros) {
                    System.out.println(livro);
                }
            }
        }
    }

    public static class excluirLivro {
        public static void removerLivro(Scanner scanner, List<Livro> livros) {
            System.out.print("ID do Livro a ser removido: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            Iterator<Livro> iterator = livros.iterator();
            boolean livroRemovido = false;
            while (iterator.hasNext()) {
                Livro livro = iterator.next();
                if (livro.getId() == id) {
                    iterator.remove();
                    livroRemovido = true;
                    System.out.println("Livro removido com sucesso!");
                    break;
                }
            }
            if (!livroRemovido) {
                System.out.println("Livro não encontrado.");
            }
        }
    }
}
