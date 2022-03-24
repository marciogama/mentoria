package loja.fiscal;

import loja.dominio.Empresa;
import loja.fatura.ItensDoPedido;
import loja.fatura.Venda;
import loja.util.FormatUtil;

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

    }

    private List<NotaFiscalItem> map(Venda venda){
        List<ItensDoPedido> itensDoPedidos = venda.getPedido().getItensDoPedidos();

        return itensDoPedidos.stream().map(idp -> new NotaFiscalItem(idp.getProduto(), idp.getQuantidade()))
                .collect(Collectors.toList());
    }

}
