package Exercício06;

import java.util.Scanner;

public class Agenda {

    private int envio;

    Agenda(int env){
        envio = env;
    }

    void addContato(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do contato: ");
        String novoNome = leitor.nextLine();
        System.out.print("Digite o número do contato: ");
        String novoNúmero = leitor.nextLine();
        Contato novoContato = new Contato(novoNome, novoNúmero);
        novoContato.addListaContato();
    }

    void buscarContato(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do contato: ");
        String userInput = leitor.nextLine();
        Contato input = new Contato(userInput);
        input.searchNome();
        return;
    }

    void removerContato(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do contato que gostaria de excluir: ");
        String userInput = leitor.nextLine();
        Contato input = new Contato(userInput);
        int resultadoBusca = input.searchNome();
        if (resultadoBusca != -1) {
            Contato idRemove = new Contato(resultadoBusca);
            idRemove.removerContato();
        }
        return;
    }

    void mostrarTodosContatos(){
        Contato shwoAll = new Contato(0);
        for (int i = 0; i < Contato.getSize(); i++){
            shwoAll = new Contato(i);
            shwoAll.mostrarContato(); 
        }
    }
}
