package loja;

import loja.dao.Dao;
import loja.dao.DaoImpl;

public class MainJdbc {

    public static void main(String[] args) {

        Dao testeConexao = new DaoImpl();

        testeConexao.getConnection();
    }
}
