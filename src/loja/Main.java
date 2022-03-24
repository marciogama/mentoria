package loja;

import loja.dominio.Cliente;
import loja.fatura.Venda;
import loja.fiscal.Fiscal;
import loja.fiscal.NotaFiscal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static loja.util.MockUtil.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = criarCliente2();

        Venda venda1 = new Venda( LocalDateTime.parse("2022-03-19 10:35:10",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                cliente, criaPedido1(cliente) );

        Venda venda2 = new Venda( LocalDateTime.parse("2022-03-20 15:50:22",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                cliente, criaPedido2(cliente) );

        Fiscal fiscal = new Fiscal();
        NotaFiscal notaFiscal = fiscal.geraNotaFiscal(venda1, "teste geracao nota fiscal");
        fiscal.imprimirNotaFiscal(notaFiscal);

        NotaFiscal notaFiscal2 = fiscal.geraNotaFiscal(venda2, "teste geracao nota fiscal");
        fiscal.imprimirNotaFiscal(notaFiscal2);

    }


}
