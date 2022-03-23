package fatura;

import loja.Cliente;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private LocalDateTime pedido;
    private Cliente cliente;
    private List<ItensDoPedido> itensDoPedidos = new ArrayList<>();

    public Pedido(long id, LocalDateTime pedido, Cliente cliente, List<ItensDoPedido> itensDoPedidos) {
        this.id = id;
        this.pedido = pedido;
        this.cliente = cliente;
        this.itensDoPedidos = itensDoPedidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getPedido() {
        return pedido;
    }

    public void setPedido(LocalDateTime pedido) {
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensDoPedido> getItensDoPedidos() {
        return itensDoPedidos;
    }

    public void setItensDoPedidos(List<ItensDoPedido> itensDoPedidos) {
        this.itensDoPedidos = itensDoPedidos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", pedido=" + pedido +
                ", cliente=" + cliente +
                ", itensDoPedidos=" + itensDoPedidos +
                '}';
    }
}
