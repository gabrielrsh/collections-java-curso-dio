package com.company.exercicios.set;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}
