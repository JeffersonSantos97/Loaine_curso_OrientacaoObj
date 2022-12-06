package com.loaine.cursojava.aula27.labs;

public class Conta {

    int numConta = 123456;

    double chequeEspecial = 500.00;

    boolean status;
    double saldo = 0.0; // saldo já começa com limite + o saldo. Mas como o saldo começa como 0, então o saldo primeiramente é o limite

    // boolean status = true;



    // resposta cheque Especial

    void respostaCheque(String resposta) {


        if(resposta.equalsIgnoreCase("y")) {

            status = true;
        } else  {

             status = false;
        }

    }

    void temChequeEspecial() {

        if (status == true) {

            saldo += chequeEspecial;
        } else if(status == false) {

            saldo = 0;
        }
    }
    // sacar

    void sacar(double valor) {

        // se o saldo for maior que o valor pedido de saque, eu efetuo o saque

        if (saldo > valor) {

            saldo -= valor;
        }
        // se for menor eu o valor pedido de saque, eu retorno que tem saldo insuficiente
        else {

            System.out.println("Saldo INSUFICIENTE");
            System.out.println("Entre com um depósito");
        }


    }

    // depositar

    double depositar(double valor) {

        return saldo += valor;
    }


    // consultar saldo

    void mostrarSaldo() {

        System.out.println("Saldo: " + saldo);
    }


}
