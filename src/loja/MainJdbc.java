package loja;

import loja.dao.Dao;
import loja.dao.DaoImplUsuario;
import loja.usuario.Usuario;

public class MainJdbc {

    public static void main(String[] args) {

//        Implementação de produtos

//        Dao testeConexao = new DaoImplProduto();
//
//        testeConexao.getConnection();

//        testeConexao.findAll();

//        testeConexao.create(new Produto("KVM", "INFORMATICA", 150.0) );

//        testeConexao.upDate(new Produto("KVM", "INFORMATICA", 200.0), 3 );

//        testeConexao.delete(3);

//        testeConexao.findById(2);
//
//

//        Implementação de Usuários

        Dao testeConexao = new DaoImplUsuario();

        testeConexao.getConnection();

//        testeConexao.create(new Usuario( "marciogama@gmail.com", "Marcio Gama") );
//        testeConexao.create(new Usuario( "rodrigonascimento@gmail.com", "Rodrigo Nascimento") );
//        testeConexao.create(new Usuario( "rafaelmedeiros@gmail.com", "Rafael Medeiros") );

//        testeConexao.upDate(new Usuario("rafaelberçam@gmail.com", "Rafael Berçam"), 3 );

//        testeConexao.delete(4);

//        testeConexao.findById(3);

        testeConexao.findAll();
    }
}
