package loja.dominio;

import loja.dominio.Categoria;

public class Produto {

    private long id;
    private String descricao;
    private Categoria categoria;
    private double preco;
    private static long contadorId;

    public Produto() {
    }

    public Produto(String descricao, Categoria categoria, double preco) {
        this.id = generateNewId();
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", categoria=" + categoria +
                ", preco=" + preco +
                '}';
    }

    private long generateNewId(){
        return contadorId ++;
    }
}
