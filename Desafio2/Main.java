package Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner leitor =  new Scanner(System.in);
            List<Biblioteca> livros = new ArrayList<Biblioteca>();
            char loop;
            int id = 0;
            do{
                System.out.println("Digite o nome do livro: ");
                String nomeLivro = leitor.nextLine();
                System.out.println("Digite o nome do autor do livro: ");
                String autorLivro = leitor.nextLine();
                System.out.println("Digite o ano em que o livro foi publicado: ");
                int anoLivro = Integer.parseInt(leitor.nextLine());
                Biblioteca novoLivro = new Biblioteca(id, nomeLivro, autorLivro, anoLivro);
                livros.add(novoLivro);
                id++;
                    do{ 
                        System.out.println("\nGoraria de adicionar outro livro? 'y' para sim e 'n' para não");
                        loop = leitor.next().charAt(0);
                        leitor.nextLine();
                    } while(loop != 'y' && loop != 'n');
            } while(loop != 'n');
            for (int i = 0; i < livros.size(); i++){
                livros.get(i).mostrarLivro();
            }
            leitor.close();
        }
}

/*
Imagine uma pequena biblioteca pessoal, uma coleção que você começou a construir com seus livros favoritos. No entanto, com o tempo e o acúmulo de mais e mais livros, você percebe anecessidade de organizar e acessar rapidamente as informações de cada um deles.

Para ajudar nessa organização, você decide criar um sistema simples em Java que permitiráregistrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livroda sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo.

Dica:“Desenvolva a classe Livro com os atributos título, autor e ano. Implemente um construtor para inicializar esses atributos quando um novo livro for instanciado no seu sistema.Adicione um método exibirInfo() para mostrar todos os dados do livro na tela.”
 */