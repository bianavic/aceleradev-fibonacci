package br.com.tarefas;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DesafioFibonacci {
    public static void main(String[] args) {
        System.out.println(isFibonacci());
    }

    @NotNull
    public static List<Integer> fibonacci() {

        int posicao = 1;
        int numeroFibonacci = 2;

        List<Integer> lista = new ArrayList<>();

        lista.add(0);
        lista.add(1);

        while (numeroFibonacci < 350) {
            lista.add(lista.get(posicao) + lista.get(posicao - 1));
            numeroFibonacci = lista.get(posicao + 1);
            posicao++;
        }

        return lista;
    }

    public static Boolean isFibonacci() {
        Integer fibonacci = 3;
        return fibonacci().contains(fibonacci);
    }
}