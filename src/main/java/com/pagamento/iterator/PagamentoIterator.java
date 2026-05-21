package com.pagamento.iterator;

import com.pagamento.model.Pagamento;

public interface PagamentoIterator {
    boolean hasNext();
    Pagamento next();
}