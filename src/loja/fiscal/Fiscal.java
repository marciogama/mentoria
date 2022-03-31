package loja.fiscal;

import loja.dominio.Empresa;
import loja.fatura.ItensDoPedido;
import loja.fatura.Venda;
import loja.util.FormatUtil;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Fiscal extends Empresa {

    public NotaFiscal geraNotaFiscal(Venda venda, String observacao){
        return new NotaFiscal(venda.getCliente(),observacao,map(venda));
    }

    public void imprimirNotaFiscal(NotaFiscal notaFiscal){
        System.out.println("---------------Dados da Empresa--------------");
        System.out.println("Nota Fiscal nº: " + notaFiscal.getId()+"\n");
        System.out.println("Cnpj:" +super.getCnpj() + " - Nome Razão Social:" + super.getRazaoSocial() +"\n");
        System.out.println(FormatUtil.getEnderecoFormatado(super.getEndereco()));

        System.out.println("---------------Dados do Cliente---------------");
        System.out.println("Nome:" +notaFiscal.getCliente().getNome() + " Cnpj:" + notaFiscal.getCliente().getCpf());
        System.out.println(FormatUtil.getEnderecoFormatado(notaFiscal.getCliente().getEndereco()));
        System.out.println("---------------Itens da Nota------------------");
        System.out.println(FormatUtil.getItemsNotaFormatado(notaFiscal));
        System.out.println("---------------Valor Total da Nota------------------");
        System.out.println(valorTotalDaNota(notaFiscal));

    }

    private List<NotaFiscalItem> map(Venda venda){
        List<ItensDoPedido> itensDoPedidos = venda.getPedido().getItensDoPedidos();

        return itensDoPedidos.stream().map(idp -> new NotaFiscalItem(idp.getProduto(), idp.getQuantidade(), idp.getValor()))
                .collect(Collectors.toList());
    }

    private BigDecimal valorTotalDaNota(NotaFiscal notaFiscal) {
        List<NotaFiscalItem> itensDaNota = notaFiscal.getItems();


        double valorTotal = itensDaNota.stream().mapToDouble(idp -> idp.getValor().multiply( new BigDecimal(idp.getQuantidade())).doubleValue()).sum();


        return new BigDecimal(valorTotal);
    }

}
