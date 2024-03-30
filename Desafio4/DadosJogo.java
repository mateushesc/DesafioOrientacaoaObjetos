package Desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosJogo {
    private int levelPersonagem, idPersonagem, pontuaçãoPersonagem;
    private String nomePersonagem;

    private static List<DadosJogo> personagens = new ArrayList<DadosJogo>();
    
    //Armazenar Status
    DadosJogo(int id, int lv, int pontos, String nome){
        idPersonagem = id;
        this.levelPersonagem = lv;
        this.pontuaçãoPersonagem = pontos;
        this.nomePersonagem = nome;
    }

    //Receber id
    DadosJogo(int id){
    idPersonagem = id;
    }

    void verificarStatus(){
            System.out.print("\n-----------------------------\nStatus do personagem de id [" + idPersonagem + "]\nNome: " + personagens.get(idPersonagem).mostrarNome() + "\nLevel: " + personagens.get(idPersonagem).mostrarLevel() + "\nPontuação: " + personagens.get(idPersonagem).mostrarPontuação() + "\n-----------------------------\n");
    }

    void criarPersonagem(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do personagem o qual deseja criar: ");
        nomePersonagem = leitor.nextLine();
        DadosJogo criarPersonagem = new DadosJogo(idPersonagem, 0, 0, nomePersonagem);
        personagens.add(criarPersonagem);
        System.out.print("Personagem de id [" + idPersonagem + "] e nome [" + personagens.get(idPersonagem).mostrarNome() + "] foi criado com sucesso\n");
    }

    void aumentarLevel(){
        Scanner leitor = new Scanner(System.in);
        verificarStatus();
        System.out.print("Em quanto gostaria de aumentar o nivel do personagem? ");
        int levelSoma = Integer.parseInt(leitor.nextLine());
        int levelAtualPersonagem  = personagens.get(idPersonagem).mostrarLevel();
        int resultado = levelSoma + levelAtualPersonagem;
        personagens.get(idPersonagem).setLevel(resultado);
        System.out.print("Pontuação atualizada: " + personagens.get(idPersonagem).mostrarLevel() + "\n");
    }

    int setLevel(int alteração){
        this.levelPersonagem = alteração;
        return 0;
    }

    void aumentarPontuação(){
        Scanner leitor = new Scanner(System.in);
        verificarStatus();
        System.out.print("Em quanto gostaria de aumentar a pontuação do personagem? ");
        int pontuaçãoSoma = Integer.parseInt(leitor.nextLine());
        int pontuaçãoAtualPersonagem  = personagens.get(idPersonagem).mostrarPontuação();
        int resultado = pontuaçãoSoma + pontuaçãoAtualPersonagem;
        personagens.get(idPersonagem).setPontuação(resultado);
        System.out.print("Pontuação atualizada: " + personagens.get(idPersonagem).mostrarPontuação() + "\n");
    }

    int setPontuação(int alteração){
        this.pontuaçãoPersonagem = alteração;
        return 0;
    }

    int mostrarLevel(){
        return this.levelPersonagem;
    }
    
    int mostrarPontuação(){
        return this.pontuaçãoPersonagem;
    }

    String mostrarNome(){
        return this.nomePersonagem;
    }

}


