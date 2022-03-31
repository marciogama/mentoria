package loja.fatura;

import loja.dominio.Produto;

import java.math.BigDecimal;

public class ItensDoPedido {

    private long idItemPedido;
    private Produto produto;
    private int quantidade;
    private BigDecimal valor;

    public ItensDoPedido(long idItemPedido, Produto produto, int quantidade, BigDecimal valor) {
        this.idItemPedido = idItemPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public long getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(long idItemPedido) {
        this.idItemPedido = idItemPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ItensDoPedido{" +
                "idItemPedido=" + idItemPedido +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
