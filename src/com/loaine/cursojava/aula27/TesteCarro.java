package com.loaine.cursojava.aula27;

public class TesteCarro {

    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombusivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);


        van.exibirAutonomia();

        van.obterAutonomia();

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel20 = van.calcularCombustivel(20);
        double qtdCombustivel30 = van.calcularCombustivel(30);

        System.out.println("QtdCombustivel10: " + qtdCombustivel10);
        System.out.println("QtdCombustivel20: " + qtdCombustivel20);
        System.out.println("QtdCombustivel30: " + qtdCombustivel30);




    }
}
