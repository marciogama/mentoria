package estoque;

import java.time.chrono.MinguoDate;
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<Produto,Integer> saldo = new HashMap<>();

    public void cadastrar (Produto produto) {

        saldo.put(produto, 0);
    }

    public int saldoAtual (Produto produto) {
        return saldo.get(produto).intValue();
    }

    public void adicionarSaldo(Produto produto, int quantidade) {
        saldo.put(produto, saldoAtual(produto) + quantidade);
    }

    public void diminuirSaldo(Produto produto, int quantidade) {
        if (saldoAtual(produto)-quantidade<0) {
            throw new RuntimeException("Saldo insuficiente!!");
        }
        saldo.put(produto, saldoAtual(produto) - quantidade);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "saldo=" + saldo +
                '}';
    }
}
