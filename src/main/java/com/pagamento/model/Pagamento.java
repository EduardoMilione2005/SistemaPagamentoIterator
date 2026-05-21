package com.pagamento.model;

public class Pagamento {
    private final String tipo;
    private final double valor;

    public Pagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Pagamento: " + tipo + " | Valor: R$ " + valor;
    }
}