package com.loaine.cursojava.aula26;


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


    }
}