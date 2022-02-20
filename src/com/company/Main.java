package com.company;

public class Main {

    //Metodo principal que invoca a implementacao das 3 questoes sequencialmente
    public static void main(String[] args) {
        System.out.println("QUESTÃO 1");
        QuestaoUm questaoUm = new QuestaoUm();
        questaoUm.executar();

        System.out.println("QUESTÃO 2");
        QuestaoDois questaoDois = new QuestaoDois();
        questaoDois.executar();

        System.out.println("QUESTÃO 3");
        QuestaoTres questaoTres = new QuestaoTres();
        questaoTres.executar();
    }


}
