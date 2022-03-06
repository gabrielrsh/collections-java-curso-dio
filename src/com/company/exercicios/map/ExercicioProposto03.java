package com.company.exercicios.map;

import java.util.*;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ExercicioProposto03 {
    public static void main(String[] args) {
        Map<Integer, Contato> contatos = new HashMap<>(){{
            put(2, new Contato("Simba", 1111));
            put(3, new Contato("Cami", 5555));
            put(1, new Contato("Jon", 2222));
        }};
        imprimir(contatos.entrySet());
        System.out.println("Ordem de inserção");
        Map<Integer, Contato> contatos2 = new LinkedHashMap<>(){{
            put(2, new Contato("Simba", 1111));
            put(3, new Contato("Cami", 5555));
            put(1, new Contato("Jon", 2222));
        }};
        imprimir(contatos2.entrySet());
        System.out.println("\nOrdem número telefone: <Set>Map.Entry  TreeSet");
        Set<Map.Entry<Integer,Contato>> contatosTree = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        contatosTree.addAll(contatos2.entrySet());
        imprimir(contatosTree);
        System.out.println("\nOrdem nome contato: <Set>Map.Entry  TreeSet");

        Set<Map.Entry<Integer, Contato>> contatosTree2 = new TreeSet<>(Comparator.comparing(
                cont->cont.getValue().getNome()));
        contatosTree2.addAll(contatos2.entrySet());
        imprimir(contatosTree2);
    }


    public static void imprimir(Set<Map.Entry<Integer,Contato>> contatos){
        for (Map.Entry<Integer,Contato> entry: contatos) {
            System.out.println("ID: "+entry.getKey()+" Numero: "+ entry.getValue().getNumero()+
                    " Nome: "+entry.getValue().getNome());
        }
    }
}

