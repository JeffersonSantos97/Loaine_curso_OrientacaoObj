package com.loaine.cursojava.aula27.labs;

public class Conta {

    int numConta;

    double chequeEspecial = 150.00;

    boolean status;
    double saldo = 0; // saldo já começa com limite + o saldo. Mas como o saldo começa como 0, então o saldo primeiramente é o limite

    // boolean status = true;


    public Conta() {


    }


    // verifica cheque especial

    // resposta cheque Especial

    boolean respostaCheque(String resposta) {


        if(resposta.equalsIgnoreCase("y")) {

            return status = true;
        } else  {

            return status = false;
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
