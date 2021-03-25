package com.ovnny._15controledefluxo_while_dowhile;

public class ControleFluxoWhileDoWhile {

    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10) {
            System.out.println(++contador);
            // 1 2 3 4 5 6 7 8 9 10
            // não imprime o "0" pois o operador ++ vem antes da
            // primeira condição ser executada (pré-fixado)
        }

        int contador2 = 0;
        while (contador2 < 10) {
            System.out.println(contador2++);
            // 0 1 2 3 4 5 6 7 8 9 10
            // imprime o "0" pois o operador ++ é pós fixado
        }

        do {
            System.out.println(contador--);
        } while (contador > 0);
    }
}
