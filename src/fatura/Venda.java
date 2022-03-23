package fatura;

import loja.Cliente;

import java.time.LocalDateTime;

public class Venda {
    private long id;
    private LocalDateTime dataVenda;
    Cliente cliente;
    Pedido pedido;

    public Venda(long id, LocalDateTime dataVenda, Cliente cliente, Pedido pedido) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", dataVenda=" + dataVenda +
                ", cliente=" + cliente +
                ", pedido=" + pedido +
                '}';
    }
}
