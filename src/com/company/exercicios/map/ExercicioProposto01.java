package com.company.exercicios.map;

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Map<String, Integer> populacaoEstados = new HashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(populacaoEstados);
        populacaoEstados.put("RN", 3534165);
        System.out.println(populacaoEstados);
        populacaoEstados.putIfAbsent("PB", 4039277);
        System.out.println("População de PE: "+populacaoEstados.get("PE"));

        System.out.println("\nExibir estados na ordem que foi indormado <LinkedHashMap>");
        Map<String, Integer> populacaoEstados2 = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(populacaoEstados2);
        System.out.println("\nExiba os estados e suas populações em ordem alfabética <TreeMap>");
        Map<String, Integer> populacaoEstadosTree = new TreeMap<>(populacaoEstados2);
        System.out.println(populacaoEstadosTree);
        System.out.println("\nExiba o estado com a menor população e sua quantidade");
        Integer menorPopulacao = Collections.min(populacaoEstados2.values());
        Iterator<Map.Entry<String, Integer>> iterator = populacaoEstados.entrySet().iterator();
        Map.Entry<String, Integer> next;
        while(iterator.hasNext()){
            next = iterator.next();
            if(next.getValue().equals(menorPopulacao))
                System.out.println("Estado "+next.getKey()+" populacao = "+next.getValue());
        }
        System.out.println("\nExiba o estado com a maior população e sua quantidade");
        Integer maiorPopulacao = Collections.max(populacaoEstados2.values());
        Double soma = 0d;
        for (Map.Entry<String, Integer> populacaoEstado : populacaoEstados.entrySet()) {
            if (populacaoEstado.getValue().equals(maiorPopulacao))
                System.out.println("Estado " + populacaoEstado.getKey() + " populacao = " + populacaoEstado.getValue());
            soma += populacaoEstado.getValue();
        }
        System.out.println("\nExiba a soma da população desses estados SOMA= " + soma);
        System.out.println("\nExiba a média da população deste dicionário de estados MEDIA= "+ (soma/populacaoEstados.size()));
        System.out.println("\nRemova os estados com a população menor que 4.000.000");
        Iterator<Map.Entry<String, Integer>> iterator2 = populacaoEstados.entrySet().iterator();
        while(iterator2.hasNext()){
            next = iterator2.next();
            if(next.getValue() < 4000000)
                iterator2.remove();
        }
        System.out.println(populacaoEstados);
        System.out.println(populacaoEstados.get("PE"));
        populacaoEstados.clear();
        System.out.println("\nApague o dicionário Verifique se ele está vazio :"+ populacaoEstados.isEmpty());
    }
}
