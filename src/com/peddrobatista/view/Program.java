package com.peddrobatista.view;

import com.peddrobatista.classes.Produto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        String name = teclado.nextLine();
        System.out.print("Preço: ");
        double price = teclado.nextDouble();
        System.out.println();

        Produto produto = new Produto(name, price);
        System.out.println("Dados do produto: " + produto);
    }
}
