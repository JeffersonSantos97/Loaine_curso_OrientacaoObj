package com.loaine.cursojava.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombusivel;


    void exibirAutonomia() { // nome do método começa com verbo

        System.out.println("A autonomia do carro é: " + (capCombustivel * consumoCombusivel) + " KM");
    }
}
