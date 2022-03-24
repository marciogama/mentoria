package loja.fatura;

import loja.dominio.Produto;

public class ItensDoPedido {

    private long idItemPedido;
    private Produto produto;
    private int quantidade;

    public ItensDoPedido(long idItemPedido, Produto produto, int quantidade) {
        this.idItemPedido = idItemPedido;
        this.produto = produto;
        this.quantidade = quantidade;
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

    @Override
    public String toString() {
        return "ItensDoPedido{" +
                "idItemPedido=" + idItemPedido +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
