package com.loaine.cursojava.aula24.labs;

public class Exer01 {

    public static void main(String[] args) {

        Lampada lamp = new Lampada();

        lamp.marca = "Philiphs";
        lamp.cor = "branca";
        lamp.preco = 4.5;
        lamp.voltagem = 110;
        String[] tipos = new String[5];

        tipos[0] = "Lampião";
        tipos[1] = "Abajur";
        tipos[2] = "Lanterna";

        System.out.println("Marca: " + lamp.marca);
        System.out.println("Cor: " + lamp.cor);
        System.out.println("Preco: " + lamp.preco);
        System.out.println("Voltagem: " + lamp.voltagem);
        System.out.println("Tipo: " + tipos[1]);
    }
}
