package com.loaine.cursojava.aula27.labs;

public class Lampada {

    String cor;
    String marca;
    int voltagem;
    double preco;
    String[] tipos;
    boolean conector = true;

    // Instancie o contrutor Lampada
        public Lampada() {

        }

    // Método para ligar ( colocar o conector como acesso ) o true repesenta ligado
        boolean ligar() {

            return conector = true;
        }

        // Método para desligar ( colocar o conector como desligado ) o false representa desligado
        boolean desligar() {

           return  conector = false;
        }

        // método para mostrar o estado da Lampda
        void estadoLampada() {

            // se conector estiver no true ( vai retornar a frase de que está LIGADA )

            if(conector == true) {

                System.out.println("Ligada");
            }
            // se o conector estiver no false ( vai retornar a frase de que a lampada está DESLIGADA )
            else if(conector == false){

                System.out.println("Desligada");
            }
        }
}
