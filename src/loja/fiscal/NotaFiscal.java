package loja.fiscal;

import loja.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private long id;
    private Cliente cliente;
    private String observacao;
    private List<NotaFiscalItem> items = new ArrayList<>();
    private static long contadorId;

    public NotaFiscal(Cliente cliente, String observacao, List<NotaFiscalItem> items) {
        this.id = generateNewId();
        this.cliente = cliente;
        this.observacao = observacao;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<NotaFiscalItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", observacao='" + observacao + '\'' +
                ", items=" + items +
                '}';
    }

    private long generateNewId(){
        return contadorId ++;
    }
}
