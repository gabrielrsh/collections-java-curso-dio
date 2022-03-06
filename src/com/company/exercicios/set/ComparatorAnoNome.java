package com.company.exercicios.set;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCricao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoCricao != 0) return anoCricao;
        return l1.getNome().compareTo(l2.getNome());
    }
}
