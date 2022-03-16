package estoque;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto( 1L, "TV Samsung", Categoria.ELETRODOMESTICOS, 1500.0);
        Produto p2 = new Produto( 1L, "Notebook Dell", Categoria.INFORMATICA, 7500.0);

        Estoque estoque = new Estoque();

        estoque.cadastrar(p1);
        estoque.cadastrar(p2);

        System.out.println("p1 - estoque: "+estoque.saldoAtual(p1));
        System.out.println("p2 - estoque: "+estoque.saldoAtual(p2));

        estoque.adicionarSaldo(p1, 1000);
        System.out.println("p1 - estoque: "+estoque.saldoAtual(p1));

        estoque.diminuirSaldo(p1, 500);
        System.out.println("p1 - estoque: "+estoque.saldoAtual(p1));

        estoque.diminuirSaldo(p1, 600);
        System.out.println("p1 - estoque: "+estoque.saldoAtual(p1));
    }
}
