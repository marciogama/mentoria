package loja.dao;

import loja.dominio.Categoria;
import loja.dominio.Produto;

import java.sql.*;

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

        Connection con = getConnection();


        try {
            PreparedStatement stm = con.prepareStatement(INSERT_PRODUTO_SQL);
            stm.setString(1, obj.getDescricao());
            stm.setString(2, obj.getCategoria());
            stm.setDouble(3, obj.getPreco());
            stm.executeUpdate();

//            while (rst.next()) {
//                Integer id = rst.getInt("ID");
//                String descricao = rst.getString("DESCRICAO");
//                String categoria = rst.getString("CATEGORIA");
//                Double preco = rst.getDouble("PRECO");
//                System.out.printf("%d , %s, %s, %.2f%n",id, descricao, categoria, preco);
//            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean upDate(Produto obj, int id) {

        Connection con = getConnection();

        try {
            PreparedStatement stm = con.prepareStatement(UPDATE_PRODUTOS_SQL);

            stm.setString(1, obj.getDescricao());
            stm.setString(2, obj.getCategoria());
            stm.setDouble(3, obj.getPreco());
            stm.setInt(4, id);
            boolean resultado = stm.executeUpdate()>0;
            return resultado;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(int id) {

        Connection con = getConnection();

        try {
            PreparedStatement stm = con.prepareStatement(DELETE_PRODUTOS_SQL);

            stm.setInt(1, id);
            boolean resultado = stm.executeUpdate()>0;
            System.out.println("Produto deletado: "+resultado);
            return resultado;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Produto findById(int id) {



        Connection con = getConnection();

        try {

            PreparedStatement stm = con.prepareStatement(SELECT_PRODUTO_BY_ID);

            stm.setInt(1, id);

            ResultSet rst = stm.executeQuery();


            while (rst.next()) {
                Integer ident = rst.getInt("ID");
                String descricao = rst.getString("DESCRICAO");
                String categoria = rst.getString("CATEGORIA");
                Double preco = rst.getDouble("PRECO");
                System.out.printf("%d , %s, %s, %.2f%n",id, descricao, categoria, preco);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Produto findAll() {

        Connection con = getConnection();

        try {
            Statement stm = con.createStatement();
            stm.execute(SELECT_ALL_PRODUTOS);
            ResultSet rst = stm.getResultSet();

            while (rst.next()) {
                Integer id = rst.getInt("ID");
                String descricao = rst.getString("DESCRICAO");
                String categoria = rst.getString("CATEGORIA");
                Double preco = rst.getDouble("PRECO");
                System.out.printf("%d , %s, %s, %.2f%n",id, descricao, categoria, preco);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
