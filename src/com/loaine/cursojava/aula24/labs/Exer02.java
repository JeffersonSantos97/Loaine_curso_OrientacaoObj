package com.loaine.cursojava.aula24.labs;

public class Exer02 {

    public static void main(String[] args) {

        LivroDeLivraria livro = new LivroDeLivraria();

        livro.autor = "Jefferson";
        livro.nomeLivro = "O careca de tranca";
        livro.editora = "EU Mermo";
        livro.estoque = true;
        livro.qtdPaginas = 1997;
        String[] sessoes = new String[10];

        sessoes[0] = "Terror";
        sessoes[1] = "Comédia";
        sessoes[2] = "Acao";
        sessoes[3] = "Infantil";
        sessoes[4] = "Suspense";

        System.out.println("Autor: " + livro.autor);
        System.out.println("Quantidade de Páginas: " + livro.qtdPaginas);
        System.out.println("Nome do livro: " + livro.nomeLivro);

    }
    }
