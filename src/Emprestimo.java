public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private String data;

    public Emprestimo() {
    }

    public Emprestimo(Usuario usuario, Livro livro, String data) {
        this.usuario = usuario;
        this.livro = livro;
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
