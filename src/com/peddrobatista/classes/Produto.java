package com.peddrobatista.classes;

public class Produto {
    public String name;
    public double price;
    public int quantity;

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double totalValorInStock() {
        return price * quantity;
    }
    public String toString() {
        return name + ", R$ " + price + ", " + quantity + " units \n"
                + "Valor total em estoque: R$ " + totalValorInStock();
    }
}
