package Desafio2;

public class Biblioteca {
    String nomeLivro, autorLivro;
    int id = 0, anoLivro = 0;
    
    Biblioteca(int i, String nome, String autor, int ano){
        id = i;
        nomeLivro = nome;
        autorLivro = autor;
        anoLivro = ano;
    }
    void mostrarLivro(){
        System.out.print("Nome do livro " + (id + 1) + " é " + nomeLivro + " do autor é " + autorLivro  + " e o ano de publicação é " + anoLivro + ".\n");
    }
}
