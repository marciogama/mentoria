package loja.util;

public class Constants {

    public static final String COM_MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/dbteste?useSSL=false";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "1234";

    public static final String INSERT_USUARIO_SQL = "insert into usuario" + "  (nome, email) VALUES  (?,?);";

    public static final String SELECT_USUARIO_BY_ID = "select * from usuario where usuario_id =?";
    public static final String SELECT_ALL_USUARIOS = "select * from usuario";
    public static final String DELETE_USUARIOS_SQL = "delete from usuario where usuario_id = ?;";
    public static final String UPDATE_USUARIOS_SQL = "update usuario set nome = ?, email = ? where ususario_id = ?;";

}
