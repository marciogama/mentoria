package loja.fiscal;

import loja.dominio.Produto;

public class NotaFiscalItem {
    private long id;
    private Produto produto;
    private int quantidade;
    private static long contadorId;

    public NotaFiscalItem(Produto produto, int quantidade) {
        this.id = generateNewId();
        this.produto = produto;
        this.quantidade = quantidade;
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

    @Override
    public String toString() {
        return "NotaFiscalItem{" +
                "id=" + id +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }

    private long generateNewId(){
        return contadorId ++;
    }
}
