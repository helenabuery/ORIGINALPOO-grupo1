public class Usuario extends Cliente {
    private String login;
    private String senha;

    public Usuario(String nome, String cpf, String telefone, String login, String senha) {
        super(nome, cpf, telefone);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() { return login; }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
