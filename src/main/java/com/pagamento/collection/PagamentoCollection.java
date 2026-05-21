package com.pagamento.collection;

import com.pagamento.iterator.PagamentoIterator;

public interface PagamentoCollection {
    PagamentoIterator createIterator();
}