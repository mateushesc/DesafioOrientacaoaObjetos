package Exercício06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        int opção = 0;

        Agenda envio = new Agenda(1);

        do{
            System.out.print("[1] para adicionar contato [2] para buscar contato [3] para remover contato [4] para mostrar todos contatos [outro número para fechar o programa] ");
            opção = Integer.parseInt(leitor.nextLine());
            switch (opção) {
                case 1:
                    envio.addContato();
                    break;

                case 2:
                    envio.buscarContato();
                    break;

                case 3:
                    envio.removerContato();
                    break;
                case 4:
                    envio.mostrarTodosContatos();
                    break;

                default:
                    break;
            }
        } while(opção > 0 && opção < 5);
        leitor.close();
    }
}

/*
Inspirado pela organização de um grande evento de networking, onde os participantes trocam contatos e informações profissionais, um desenvolvedor decide criar um sistema para gerenciaruma agenda de contatos. Este sistema ajudará os usuários a manter suas conexões organizadas, permitindo-lhes adicionar, remover e buscar contatos facilmente.

Dica:“Crie as classes Agenda e Contato em Java. A classe Contato deve armazenar informações como nome e telefone, enquanto a classe Agenda deve gerenciar uma lista de contatos, com métodos para adicionar novos contatos e buscar contatos por nome.”
 */