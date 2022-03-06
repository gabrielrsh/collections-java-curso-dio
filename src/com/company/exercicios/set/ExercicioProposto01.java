package com.company.exercicios.set;

/*
Crie um conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores do arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        for (String cor: coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println("O arco iris tem "+coresArcoIris.size()+" cores");

        System.out.println("Cores em ordem alfabética");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        List<String> ordemInversa = new ArrayList<>(coresArcoIris2);
        System.out.println("Ordem recebida: "+ordemInversa);
        Collections.reverse(ordemInversa);
        System.out.println("Ordem inversa: "+ordemInversa);

        Iterator<String> iterator = coresArcoIris.iterator();
        String next;
        while (iterator.hasNext()){
            next = iterator.next();
            if(next.toLowerCase().indexOf('v')==0) // metodo startsWith()
                System.out.println(next);
            else
                iterator.remove();
        }
        System.out.println(coresArcoIris);
        coresArcoIris.clear();
        System.out.println("Conjunto vazio? "+coresArcoIris.isEmpty());
    }
}
