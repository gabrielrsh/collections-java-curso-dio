package com.company.exercicios.set;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome!=0) return nome;
        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoCriacao!=0) return anoCriacao;
        return l1.getIde().compareTo(l2.getIde());
    }
}
