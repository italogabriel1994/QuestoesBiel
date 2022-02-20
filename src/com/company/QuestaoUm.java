package com.company;

import java.util.Scanner;

public class QuestaoUm {

    public void executar() {
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();

        for (int i = 0; i <= entrada; i++) {

            int contadorEspaco = i;
            while (contadorEspaco < entrada) {
                System.out.print(" ");
                ++contadorEspaco;
            }

            int contadorAsterisco = 0;
            while (contadorAsterisco < i) {
                System.out.print("*");
                ++contadorAsterisco;
            }

            System.out.println();
        }
    }
}
