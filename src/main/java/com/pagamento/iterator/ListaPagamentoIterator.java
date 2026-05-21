package com.pagamento.iterator;

import com.pagamento.model.Pagamento;

public class ListaPagamentoIterator implements PagamentoIterator {
    private final Pagamento[] pagamentos;
    private int posicao = 0;

    public ListaPagamentoIterator(Pagamento[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public boolean hasNext() {
        return posicao < pagamentos.length && pagamentos[posicao] != null;
    }

    @Override
    public Pagamento next() {
        return pagamentos[posicao++];
    }
}