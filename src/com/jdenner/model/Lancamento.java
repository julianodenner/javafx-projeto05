package com.jdenner.model;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author Juliano
 */
public class Lancamento {
    
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void setValor(String valor) throws ParseException{
        NumberFormat nf = NumberFormat.getNumberInstance();
        setValor(nf.parse(valor).floatValue());
    }
}
