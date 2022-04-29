package loja.usuario;

public class Usuario {

    private int usuarioId;
    private String email;
    private String nome;

    public Usuario(int usuarioId, String email, String nome) {
        this.usuarioId = usuarioId;
        this.email = email;
        this.nome = nome;
    }

    public Usuario(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

