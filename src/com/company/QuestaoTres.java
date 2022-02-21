package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoTres {

    public void executar() {
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.next();

        int anagramas = encontrarAnagramas(entrada);
        System.out.println(anagramas);
    }

    //esta funcao ira fazer a busca de anagramas por pares de substring na string de entrada
    private int encontrarAnagramas(String entrada) {
        int anagramas = 0;

        /*
        * A variavel i representa o tamanho das substrings a cada iteracao
        * A variavel j representa a posicao de inicio da primeira substring
        * A variavel k representa a posicao de inicio da segunda substring
        **/
        for (int i = 1; i <= entrada.length(); i++) {
            for (int j = 0; j <= entrada.length() - i ; j++) {
                String palavra1 = entrada.substring(j, j+i);
                for (int k = j; k <= entrada.length() - i; k++) {
                    String palavra2 = entrada.substring(k, k+i);

                    //evitando a comparacao da das mesmas substrings iniciais
                    if (k != j && mesmasLetras(palavra1, palavra2)) {
                        ++anagramas;
                    }
                }
            }
        }

        return anagramas;
    }

    //verifica se duas substrings contem as mesmas letras
    private boolean mesmasLetras(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }
}
