package com.loaine.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);

        Lampada lamp = new Lampada();


        lamp.ligar();

        lamp.estadoLampada();

        lamp.desligar();

        lamp.estadoLampada();

        lamp.ligar();

        lamp.estadoLampada();









        sc.close();
    }

}
