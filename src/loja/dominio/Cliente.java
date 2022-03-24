package loja.dominio;

public class Cliente extends Pessoa {

    private Endereco endereco;
    private Telefone telefone;

    public Cliente(String nome, String cpf){
        super(nome, cpf);
    }

    public Cliente(String nome, String cpf, Endereco endereco, Telefone telefone) {
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "endereco=" + endereco +
                ", telefone=" + telefone +
                '}';
    }
}
