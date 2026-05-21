package com.pagamento.collection;

import com.pagamento.iterator.ListaPagamentoIterator;
import com.pagamento.iterator.PagamentoIterator;
import com.pagamento.model.Pagamento;

public class ListaPagamentos implements PagamentoCollection {
    private final Pagamento[] pagamentos;
    private int quantidade = 0;

    public ListaPagamentos(int tamanho) {
        pagamentos = new Pagamento[tamanho];
    }

    public void adicionarPagamento(Pagamento pagamento) {
        if (quantidade < pagamentos.length) {
            pagamentos[quantidade++] = pagamento;
        }
    }

    @Override
    public PagamentoIterator createIterator() {
        return new ListaPagamentoIterator(pagamentos);
    }
}