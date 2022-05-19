package loja.dao;

import loja.usuario.Usuario;

import java.sql.*;

import static loja.util.Constants.*;
import static loja.util.Constants.JDBC_PASSWORD;
import static loja.util.ErrorUtil.printException;
import static loja.util.ErrorUtil.printSQLException;

public class DaoImplUsuario implements Dao<Usuario>{

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
    public void create(Usuario obj) {
        Connection con = getConnection();

        try {
            PreparedStatement stm = con.prepareStatement(INSERT_USUARIO_SQL);
            stm.setString(1, obj.getEmail());
            stm.setString(2, obj.getNome());
            stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean upDate(Usuario obj, int id) {

        Connection con = getConnection();

        try {
            PreparedStatement stm = con.prepareStatement(UPDATE_USUARIOS_SQL);

            stm.setString(1, obj.getEmail());
            stm.setString(2, obj.getNome());
            stm.setInt(3, id);
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
            PreparedStatement stm = con.prepareStatement(DELETE_USUARIOS_SQL);

            stm.setInt(1, id);
            boolean resultado = stm.executeUpdate()>0;
            System.out.println("Usuário deletado: "+resultado);
            return resultado;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuario findById(int id) {

        Connection con = getConnection();

        try {

            PreparedStatement stm = con.prepareStatement(SELECT_USUARIO_BY_ID);

            stm.setInt(1, id);

            ResultSet rst = stm.executeQuery();

            listaUsuarios(rst);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Usuario findAll() {Connection con = getConnection();

        try {
            PreparedStatement stm = con.prepareStatement(SELECT_ALL_USUARIOS);
            stm.execute();
            ResultSet rst = stm.getResultSet();

            listaUsuarios(rst);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private void listaUsuarios(ResultSet rst) {

        try {
            while (rst.next()) {
                Integer id = rst.getInt("USUARIO_ID");
                String email = rst.getString("EMAIL");
                String nome = rst.getString("NOME");
                System.out.printf("%d , %s, %s%n", id, email, nome);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}