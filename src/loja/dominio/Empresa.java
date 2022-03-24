package loja.dominio;

import static loja.util.MockUtil.criaEndereco2;
import static loja.util.MockUtil.criaTelefone2;

public class Empresa {

    private final String razaoSocial = "Mentoria SA";
    private final String cnpj = "69.635.438/0001-42";
    private final Endereco endereco = criaEndereco2();
    private final Telefone telefone = criaTelefone2();

    public Empresa() {
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                '}';
    }
}
