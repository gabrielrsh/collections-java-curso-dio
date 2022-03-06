package com.company.exercicios.list;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        int qtdMeses = 6;

        do {
            try{
                System.out.println("\nDigite a temperatura: ");
                temperaturas.add(scan.nextDouble());
                qtdMeses--;
            } catch (InputMismatchException e){
                System.out.println("Valor inválido!");
                scan.next();
            }
        }while(qtdMeses>0);

        System.out.println("Temperaturas registradas: "+temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        double soma = 0, next, media;

        media = temperaturas.stream().mapToDouble(Double :: doubleValue).average().orElse(0d);
        System.out.printf("Média de temperatura Semestral: %.2f", media);
        System.out.println("\n");
        while(iterator.hasNext()){
            next = iterator.next();
            if(next > media) {
                switch (qtdMeses) {
                    case 0 -> System.out.println("1 - Janeiro temperatura: "+ next);
                    case 1 -> System.out.println("2 - Fevereiro temperatura: "+ next);
                    case 2 -> System.out.println("3 - Março temperatura: "+ next);
                    case 3 -> System.out.println("4 - Abril temperatura: "+ next);
                    case 4 -> System.out.println("5 - Maio temperatura: "+ next);
                    case 5 -> System.out.println("6 - Junho temperatura: "+ next);
                    default -> System.out.println("Sem Registros");
                }
            }
            qtdMeses++;
        }
    }
}
