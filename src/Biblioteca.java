import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Livro> livros = new ArrayList<>();
    public ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int ano) {
        Livro livro = new Livro(titulo, autor, ano, true);
        livros.add(livro);

    }

    public void realizarEmprestimo(Usuario usuario, String tituloLivro) {
        Livro livroDisponivel = consultaLivroDisponivel(tituloLivro);
        if (livroDisponivel != null) {
            Emprestimo emprestimo = new Emprestimo(usuario, livroDisponivel, "10/09/2025");
            emprestimos.add(emprestimo);
            livroDisponivel.setDisponivel(false);
            System.out.println("Emprestimo realizado: " + usuario.getNome() + " pegou " + livroDisponivel.getTitulo());
            return;
        }
        System.out.println("Livro não disponivel.");
    }

    private Livro consultaLivroDisponivel(String tituloLivro) {
        return livros.stream()
                .filter(livro -> livro.getTitulo().equals(tituloLivro) && livro.isDisponivel())
                .findFirst()
                .orElse(null);
    }

    public void listarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Usuário: " + emprestimo.getUsuario().getNome() + " - Livro: " + emprestimo.getLivro().getTitulo() + " - Data: " + emprestimo.getData());

        }
    }

}
