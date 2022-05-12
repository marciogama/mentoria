package loja;

import loja.dao.Dao;
import loja.dao.DaoImpl;
import loja.dominio.Categoria;
import loja.dominio.Produto;

public class MainJdbc {

    public static void main(String[] args) {

        Dao testeConexao = new DaoImpl();

        testeConexao.getConnection();

//         testeConexao.findAll();

//        testeConexao.create(new Produto("KVM", "INFORMATICA", 150.0) );

//      testeConexao.upDate(new Produto("KVM", "INFORMATICA", 200.0), 3 );

//            testeConexao.delete(3);

        testeConexao.findById(2);
    }
}
