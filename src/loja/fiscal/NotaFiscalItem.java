package loja.fiscal;

import loja.dominio.Produto;

import java.math.BigDecimal;

public class NotaFiscalItem {
    private long id;
    private Produto produto;
    private int quantidade;
    private static long contadorId =1;
    private BigDecimal valor;

    public NotaFiscalItem(Produto produto, int quantidade, BigDecimal valor) {
        this.id = generateNewId();
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "NotaFiscalItem{" +
                "id=" + id +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", valor" + valor +
                '}';
    }

    private long generateNewId(){
        return contadorId ++;
    }
}
