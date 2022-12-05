package com.loaine.cursojava.aula27.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        Conta conta = new Conta();

        System.out.print("Vc quer o cheque especial de 150,00 reais ? [ y/n ]: ");

        String resposta = sc.next();


        conta.respostaCheque(resposta);

        conta.temChequeEspecial();

        conta.mostrarSaldo();

        System.out.print("Entre com um deposito: ");
        double valor = sc.nextDouble();

        conta.depositar(valor);

        conta.mostrarSaldo();

        System.out.print("Entre com a quantidade do saque: ");
        valor = sc.nextDouble();

        conta.sacar(valor);

        conta.mostrarSaldo();










        sc.close();
    }
}
