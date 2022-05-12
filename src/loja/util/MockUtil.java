package loja.util;

import loja.dominio.*;
import loja.fatura.ItensDoPedido;
import loja.fatura.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockUtil {

    public static Cliente criarCliente() {

        return new Cliente("Joaquim da Silva", "98765432100", criaEndereco2(), criaTelefone());
    }

    public static Cliente criarCliente2() {

        return new Cliente("Joaquim da Silva", "98765432100", criaEndereco1(), criaTelefone2());
    }

    public static List<Produto> criaListaProduto() {
        return Arrays.asList(criaProduto1(), criaProduto2(), criaProduto3(),criaProduto4());
    }

    public static Produto criaProduto1() {
        return new Produto("TV Samsung", "ELETRODOMESTICOS", 1500.0);
    }

    public static Produto criaProduto2() {
        return new Produto("Notebook Dell", "INFORMATICA", 7500.0);
    }
    public static Produto criaProduto3() {
        return new Produto("Luminária", "ELETRODOMESTICOS", 150.0);
    }

    public static Produto criaProduto4() {
        return new Produto("Escrivaninha", "MOVEIS", 700.0);
    }

    public static Endereco criaEndereco1() {
        Endereco e = new Endereco();
        e.setBairro("Vila Gomes");
        e.setCidade("Sao Paulo");
        e.setNumero(126);
        e.setRua("Rua Cel Camisao");
        e.setEstado("SP");
        e.setCep("05590120");
        return e;
    }

    public static Endereco criaEndereco2(){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua do Ouvidor");
        endereco.setNumero(130);
        endereco.setEstado("RJ");
        endereco.setCidade("Rio de Janeiro");
        endereco.setBairro("Centro");
        endereco.setCep("20040030");
        return endereco;
    }

    public static Telefone criaTelefone(){
        return new Telefone("2122234050");
    }

    public static Telefone criaTelefone2(){
       return new Telefone("999999999999");
    }

    public static Pedido criaPedido1(Cliente cliente){

        ItensDoPedido it1 = new ItensDoPedido(1L, criaProduto1(),10, new BigDecimal("1000.0"));
        ItensDoPedido it2 = new ItensDoPedido(1L, criaProduto2(), 15, new BigDecimal("2000.0"));

        List<ItensDoPedido> itensDoPedido1 = new ArrayList<>();
        itensDoPedido1.add(it1);
        itensDoPedido1.add(it2);
        return new Pedido(LocalDateTime.parse("2022-03-19 10:35:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), cliente,itensDoPedido1);

    }

    public static Pedido criaPedido2(Cliente cliente){
        ItensDoPedido it3 = new ItensDoPedido(2L, criaProduto3(), 7, new BigDecimal("1500.0"));
        ItensDoPedido it4 = new ItensDoPedido(2L, criaProduto4(),7, new BigDecimal("2500.0"));
        List<ItensDoPedido> itensDoPedido2 = new ArrayList<>();
        itensDoPedido2.add(it3);
        itensDoPedido2.add(it4);
        return new Pedido(  LocalDateTime.parse("2022-03-20 15:50:22", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), cliente,itensDoPedido2);
    }
}
