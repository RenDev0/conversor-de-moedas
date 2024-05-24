package com.conversordemoedas.calculos;

import com.conversordemoedas.modelos.ConverterTipoMoeda;

public class CalcularConversao {
    public double calcularConversao(double valor, ConverterTipoMoeda converterTipoMoeda) {
        double taxaCambio = converterTipoMoeda.getTaxaCambio();
        return valor * taxaCambio;
    }
}
