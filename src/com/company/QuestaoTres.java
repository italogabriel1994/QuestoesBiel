package com.company;

import java.util.Scanner;

public class QuestaoTres {

    public void executar() {
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.next();

        encontrarAnagramas(entrada);
    }

    private void encontrarAnagramas(String entrada) {
        for (int i = 1; i <= entrada.length(); i++) {
            System.out.println("===> i = " + entrada.charAt(i));
            for (int j = i; j <= entrada.length() - i ; j++) {
                System.out.println("j = " + entrada.charAt(j));
            }

        }
    }
}