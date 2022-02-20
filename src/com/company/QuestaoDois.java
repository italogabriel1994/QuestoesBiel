package com.company;

import java.util.Scanner;

public class QuestaoDois {

    public void executar() {
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.next();

        int erros = 0;
        int errosQuantidadeMinima = 0;

        erros = faltaDigito(entrada) + faltaMaiuscula(entrada) + faltaMinuscula(entrada) + faltaEspecial(entrada);
        errosQuantidadeMinima = faltaQuantidadeMinima(entrada);

        System.out.println(Math.max(erros, errosQuantidadeMinima));
    }

    private int faltaQuantidadeMinima(String entrada) {
        int erros = 0;

        if (entrada.length() <= 6) {
            erros = 6 - entrada.length();
        }

        return erros;
    }

    private int faltaDigito(String entrada) {
        int erros = 1;
        String digitos = "0123456789";

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (Character.isDigit(c)) {
                erros = 0;
                break;
            }
        }

        return erros;
    }

    private int faltaMaiuscula(String entrada) {
        int erros = 1;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                erros = 0;
                break;
            }
        }

        return erros;
    }

    private int faltaMinuscula(String entrada) {
        int erros = 1;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c >= 'a' && c <= 'z') {
                erros = 0;
                break;
            }
        }

        return erros;
    }

    private int faltaEspecial(String entrada) {
        int erros = 1;
        String especiais = "!@#$%^&*()-+";

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (especiais.indexOf(c) != -1) {
                erros = 0;
                break;
            }
        }

        return erros;
    }
}
