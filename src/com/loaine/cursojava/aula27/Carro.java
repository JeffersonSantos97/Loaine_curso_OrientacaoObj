package com.loaine.cursojava.aula27;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombusivel;


    void exibirAutonomia() { // nome do método começa com verbo

        System.out.println("A autonomia do carro é: " + obterAutonomia() + " KM");
    }


    // Método de retorno simples ( sem parametros )
    double obterAutonomia() {

        System.out.println("O metodo foi instanciado");
        return capCombustivel * consumoCombusivel;

    }



    // Metodo de retorno simples ( com parametro )

    double calcularCombustivel( double km ) {

        double qtdCombustimvel = km/consumoCombusivel;

        return qtdCombustimvel;
        }
    }

