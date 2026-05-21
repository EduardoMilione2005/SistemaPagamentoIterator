package com.pagamento;

import com.pagamento.collection.ListaPagamentos;
import com.pagamento.iterator.PagamentoIterator;
import com.pagamento.model.Pagamento;

public class ListaPagamentosTest {

    public static void main(String[] args) {

        ListaPagamentos lista = new ListaPagamentos(3);

        lista.adicionarPagamento(new Pagamento("Pix", 100.0));
        lista.adicionarPagamento(new Pagamento("Boleto", 200.0));

        PagamentoIterator iterator = lista.createIterator();

        // Teste 1
        if (!iterator.hasNext()) {
            System.out.println("Erro: deveria ter elementos");
            return;
        }

        // Teste 2
        Pagamento p1 = iterator.next();
        if (!p1.getTipo().equals("Pix") || p1.getValor() != 100.0) {
            System.out.println("Erro no primeiro pagamento");
            return;
        }

        // Teste 3
        Pagamento p2 = iterator.next();
        if (!p2.getTipo().equals("Boleto") || p2.getValor() != 200.0) {
            System.out.println("Erro no segundo pagamento");
            return;
        }

        // Teste 4
        if (iterator.hasNext()) {
            System.out.println("Erro: não deveria ter mais elementos");
            return;
        }

        System.out.println("Todos os testes passaram com sucesso!");
    }
}