package loja.dao;

import loja.dominio.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static loja.util.Constants.*;
import static loja.util.ErrorUtil.printException;
import static loja.util.ErrorUtil.printSQLException;

public class DaoImpl implements Dao <Produto>{
    @Override
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(COM_MYSQL_JDBC_DRIVER);
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            printException(e);
        }
        return connection;
    }

    @Override
    public void create(Produto obj) {

    }

    @Override
    public boolean upDate(Produto obj, int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Produto findById(int id) {
        return null;
    }

    @Override
    public Produto findAll() {
        return null;
    }
}
