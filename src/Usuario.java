public class Usuario {
    public String nome;
    public int idade;
    public String email;

    public void enviarEmail(String mensagem){
        System.out.println("Enviando email para " + email + ": " + mensagem);
    }
}
