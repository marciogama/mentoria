package loja.fatura;

import loja.dominio.Cliente;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private LocalDateTime dataDoPedido;
    private Cliente cliente;
    private List<ItensDoPedido> itensDoPedidos = new ArrayList<>();
    private static long contadorId =1;

    public Pedido( LocalDateTime dataDoPedido, Cliente cliente, List<ItensDoPedido> itensDoPedidos) {
        this.id = generateNextId();
        this.dataDoPedido = dataDoPedido;
        this.cliente = cliente;
        this.itensDoPedidos = itensDoPedidos;
    }

    private long generateNextId() {
        return contadorId ++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(LocalDateTime dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
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
                ", pedido=" + dataDoPedido +
                ", cliente=" + cliente +
                ", itensDoPedidos=" + itensDoPedidos +
                '}';
    }
}
