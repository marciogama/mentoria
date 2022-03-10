package loja;

public class Main {

    public static void main(String[] args) {

        Cliente teste = criarCliente();

        System.out.println(teste);
    }

    private static Cliente criarCliente() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua do Ouvidor");
        endereco.setNumero(130);
        endereco.setEstado("RJ");
        endereco.setCidade("Rio de Janeiro");
        endereco.setBairro("Centro");
        endereco.setCep("20040030");

        Telefone telefone = new Telefone("2122234050");

        return new Cliente("Joaquim da Silva", "98765432100", endereco, telefone);
    }
}
