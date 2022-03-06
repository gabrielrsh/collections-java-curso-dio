package com.company.exercicios.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
 */
public class ExercicioProposto02 {
    public static void main(String[] args) {
        int qtdLancamentos = 100;
        Map<Integer, Integer> lancamentos = new LinkedHashMap<>(){{
            put(1,0);
            put(2,0);
            put(3,0);
            put(4,0);
            put(5,0);
            put(6,0);
        }};
        Random lancarDados = new Random();
        Integer numeroSorteado;
        for(int i = 0; i < qtdLancamentos; i++){
            numeroSorteado = lancarDados.nextInt(6) + 1;
            lancamentos.put(numeroSorteado, lancamentos.get(numeroSorteado)+1);
        }
        Set<Map.Entry<Integer, Integer>> entries = lancamentos.entrySet();
        for (Map.Entry<Integer, Integer> entry: entries) {
            System.out.println("Nº "+entry.getKey()+" "+entry.getValue()+" vezes");
        }
    }
}
