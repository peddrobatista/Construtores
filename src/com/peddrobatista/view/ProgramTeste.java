package com.peddrobatista.view;

import com.peddrobatista.classes.Teste;

public class ProgramTeste {
    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.setName("João");
        System.out.println("Olá " + teste.getName());
    }
}
