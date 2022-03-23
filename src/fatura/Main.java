package fatura;

import estoque.Categoria;
import estoque.Produto;
import loja.Cliente;
import loja.Endereco;
import loja.Telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = criarCliente();

        Produto p1 = new Produto(1L, "TV Samsung", Categoria.ELETRODOMESTICOS, 1500.0);
        Produto p2 = new Produto(2L, "Notebook Dell", Categoria.INFORMATICA, 7500.0);
        Produto p3 = new Produto(3L, "Luminária", Categoria.ELETRODOMESTICOS, 150.0);
        Produto p4 = new Produto(4L, "Escrivaninha", Categoria.MOVEIS, 700.0);

        ItensDoPedido it1 = new ItensDoPedido(1L, p1,10);
        ItensDoPedido it2 = new ItensDoPedido(1L, p2, 15);

        ItensDoPedido it3 = new ItensDoPedido(2L, p3, 7);
        ItensDoPedido it4 = new ItensDoPedido(2L, p4,7);

        List<ItensDoPedido> itensDoPedido1 = new ArrayList<>();
        itensDoPedido1.add(it1);
        itensDoPedido1.add(it2);

        List<ItensDoPedido> itensDoPedido2 = new ArrayList<>();
        itensDoPedido2.add(it3);
        itensDoPedido2.add(it4);

        Pedido ped1 = new Pedido(1L, LocalDateTime.parse("2022-03-19 10:35:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), cliente,itensDoPedido1);
        Pedido ped2 = new Pedido(2L, LocalDateTime.parse("2022-03-20 15:50:22", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), cliente,itensDoPedido2);

        Venda venda1 = new Venda(1L, LocalDateTime.parse("2022-03-19 10:35:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), cliente, ped1 );
        Venda venda2 = new Venda(2L, LocalDateTime.parse("2022-03-20 15:50:22", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), cliente, ped2 );

        System.out.println(venda1.toString());
        System.out.println(venda2.toString());

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
