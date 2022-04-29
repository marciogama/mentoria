package loja.util;

import loja.dominio.Endereco;
import loja.fiscal.NotaFiscal;

import java.util.stream.Collectors;

public class FormatUtil {

    public static String getEnderecoFormatado(Endereco endereco){
        return "Endereco:" + endereco.getRua() + " nº: "+ endereco.getNumero()
                +" " + endereco.getBairro() + ".\n"
                + endereco.getCidade() + "/" + endereco.getEstado() + " Cep:" + endereco.getCep();
    }
    
    public static String getItemsNotaFormatado(NotaFiscal notaFiscal){
        return notaFiscal.getItems().stream()
                .map(item -> "Qtde:" + item.getQuantidade() + " - " + item.getProduto().getDescricao() + "\n")
                .collect(Collectors.joining());
    }
}
