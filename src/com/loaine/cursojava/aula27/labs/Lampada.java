package com.loaine.cursojava.aula27.labs;

public class Lampada {

    String cor;
    String marca;
    int voltagem;
    double preco;
    String[] tipos;
    boolean conector;


    // Método para ligar ( colocar o conector como acesso ) o true repesenta ligado
        void ligar() {

            conector = true;
        }

        // Método para desligar ( colocar o conector como desligado ) o false representa desligado
        void desligar() {

            conector = false;
        }

        // método para mostrar o estado da Lampda
        void estadoLampada() {

            // se conector estiver no true ( vai retornar a frase de que está LIGADA )

            if(conector) {

                System.out.println("Ligada");
            }
            // se o conector estiver no false ( vai retornar a frase de que a lampada está DESLIGADA )
            else{

                System.out.println("Desligada");
            }
        }
    // Mudar o estado da Lampada
        void mudarEstado() {
                // Se a lampada estiver ligada, ela passa a ficar desligada quando acionar esse metodo
            if(conector) {

                desligar();
            }
            // se a lampada estiver desligada, ela passsa a fica ligada quando acionar essse metodo
            else {

                ligar();
            }
        }
}
