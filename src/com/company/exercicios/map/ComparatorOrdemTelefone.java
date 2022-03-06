package com.company.exercicios.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdemTelefone implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return c1.getValue().getNumero().compareTo(c2.getValue().getNumero());
    }
}
