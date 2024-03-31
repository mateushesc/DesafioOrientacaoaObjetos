package Exercício06;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    private String nomeContato, userInput, número;
    private int id;

    private static List<Contato> contatos = new ArrayList<Contato>();

    Contato(String name, String number){
        this.nomeContato = name;
        this.número = number;
    }

    Contato(String input){
        userInput = input;
    }

    Contato(int id){
        this.id = id;
    }

    int searchNome(){
        for(int i = 0; i < contatos.size(); i++) {
            if (userInput.equals(contatos.get(i).getNome())){
                System.out.print("Contato encontrado.\n");
                Contato idEncontrado = new Contato(i);
                idEncontrado.mostrarContato();
                return i;
            }
        }
        System.out.print("Contato não encontrado\n");
        return -1;
    }

    void mostrarContato(){
        System.out.print("O contato de id [" + this.id + "] tem o nome [" + contatos.get(this.id).getNome() + "] e o número para contato [" + contatos.get(this.id).getNúmero() + "].\n");
    }

    String getNome(){
        return this.nomeContato;
    }

    String getNúmero(){
        return this.número;
    }

    void addListaContato(){
        Contato addContato = new Contato(this.nomeContato,  this.número);
        contatos.add(addContato);
        System.out.print("Contato adicionado com sucesso\n");
    }

    void removerContato(){
        contatos.remove(contatos.get(this.id));
        System.out.print("Contato removido com sucesso.\n");
    }

    static int getSize(){
        return contatos.size();
    }
    
}
