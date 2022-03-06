package com.company.exercicios.set;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>(Arrays.asList(
                new LinguagemFavorita("Python", 1990, "Pycharm"),
                new LinguagemFavorita("C", 1972, "Code Blocks"),
                new LinguagemFavorita("Java", 1991, "IntelliJ")
        ));
        System.out.println("Ordem de inserção <LinkedHashSet>");
        for (LinguagemFavorita linguagem: linguagensFavoritas) {
            System.out.println(linguagem);
        }

        System.out.println("Ordenada por nome <TreeSet>");
        Set<LinguagemFavorita> linguagensFavoritasTree = new TreeSet<>(linguagensFavoritas);
        System.out.println(linguagensFavoritasTree);
        System.out.println("Ordenada por IDE <TreeSet>");
        Set<LinguagemFavorita> linguagensFavoritasTree2 = new TreeSet<>(new ComparatorIde());
        linguagensFavoritasTree2.addAll(linguagensFavoritas);
        System.out.println(linguagensFavoritasTree2);
        System.out.println("Ordenada por ano e nome <TreeSet>");
        Set<LinguagemFavorita> linguagensFavoritasTree3 = new TreeSet<>(new ComparatorAnoNome());
        linguagensFavoritasTree3.addAll(linguagensFavoritas);
        System.out.println(linguagensFavoritasTree3);
        System.out.println("Ordenada por nome, ano e IDE <TreeSet>");
        Set<LinguagemFavorita> linguagensFavoritasTree4 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagensFavoritasTree4.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem:linguagensFavoritasTree4) {
            System.out.println(linguagem);
        }
    }
}
