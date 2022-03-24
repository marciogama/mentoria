package loja.util;

import loja.dominio.Categoria;
import loja.dominio.Endereco;
import loja.dominio.Produto;
import loja.fiscal.NotaFiscal;
import loja.fiscal.NotaFiscalItem;

import java.util.Arrays;
import java.util.stream.Collectors;

import static loja.util.MockUtil.criarCliente;

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
