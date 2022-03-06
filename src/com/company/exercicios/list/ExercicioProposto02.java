package com.company.exercicios.list;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        int culpometro = 0;

        System.out.println("Telefonou para a vítima? [s/n]");
        respostas.add(scan.next());
        System.out.println("Esteve no local do crime? [s/n]");
        respostas.add(scan.next());
        System.out.println("Mora perto da vítima? [s/n]");
        respostas.add(scan.next());
        System.out.println("Devia para a vítima? [s/n]");
        respostas.add(scan.next());
        System.out.println("Já trabalhou com a vítima? [s/n]");
        respostas.add(scan.next());

        for (String resposta: respostas) {
            if(resposta.toLowerCase().contains("s")){
                culpometro++;
            }
        }

        switch (culpometro){
            case 0:
            case 1:  System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Culpado!");
                break;
            default:
                System.out.println("Indefinido");
        }
    
    }
}
