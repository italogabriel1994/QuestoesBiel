package com.company;

import java.util.Scanner;

public class QuestaoUm {

    public void executar() {
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();

        for (int i = 1; i <= entrada; i++) {

            int contadorEspaco = i;
            //vai escrever (tamanho da entrada - i) espacos em branco
            while (contadorEspaco < entrada) {
                System.out.print(" ");
                ++contadorEspaco;
            }

            int contadorAsterisco = 0;
            //vai escrever (i) asteriscos
            while (contadorAsterisco < i) {
                System.out.print("*");
                ++contadorAsterisco;
            }

            //pulando uma linha para proxima iteracao
            System.out.println();
        }
    }
}
