package loja.dao;

import java.sql.Connection;

public interface Dao <T>{

    Connection getConnection();

    void create(T obj);

    boolean upDate(T obj, int id);

    boolean delete(int id);

    T findById(int id);

    T findAll();
}
