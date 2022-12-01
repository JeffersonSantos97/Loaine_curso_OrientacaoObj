package com.loaine.cursojava.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombusivel;


    void exibirAutonomia() { // nome do método começa com verbo

        System.out.println("A autonomia do carro é: " + obterAutonomia() + " KM");
    }


    // Método de retorno simples
    double obterAutonomia() {

        System.out.println("O metodo foi instanciado");
        return capCombustivel * consumoCombusivel;
    }
}
