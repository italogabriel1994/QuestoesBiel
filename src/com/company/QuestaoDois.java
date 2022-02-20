package com.company;

import java.util.Scanner;

public class QuestaoDois {

    public void executar() {
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.next();

        int erros = 0;
        int errosQuantidadeMinima = 0;

        //indica a quantidade de erros caso falte um digito, uma letra maiuscula, uma letra minuscula e/ou um caractere especial
        erros = faltaDigito(entrada) + faltaMaiuscula(entrada) + faltaMinuscula(entrada) + faltaEspecial(entrada);

        //indica a quantidade de caracteres que falta para alcancar a quantidade minima => 6
        errosQuantidadeMinima = faltaQuantidadeMinima(entrada);

        //imprime no console qual das duas variaveis contem um numero maior de erros
        System.out.println(Math.max(erros, errosQuantidadeMinima));
    }

    //retorna o numero de caracteres que faltam para que o numero minimo de caracteres seja atingido
    private int faltaQuantidadeMinima(String entrada) {
        int erros = 0;

        if (entrada.length() <= 6) {
            erros = 6 - entrada.length();
        }

        return erros;
    }

    //retorna 1 se a senha nao contenha pelo menos um digito e 0 caso seja encontrado um digito
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

    //retorna 1 se a senha nao contenha pelo menos uma letra maiuscula e 0 caso seja encontrada uma letra maiuscula
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

    //retorna 1 se a senha nao contenha pelo menos uma letra minuscula e 0 caso seja encontrada uma letra minuscula
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

    //retorna 1 se a senha nao contenha pelo menos um caractere especial e 0 caso seja encontrado um caractere especial
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
