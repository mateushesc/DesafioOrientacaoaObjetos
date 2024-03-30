package Desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opção, idPersonagem = 0, idReader;
        do {
            System.out.print("Digite qual operação deseja realizar: [0] para mostrar status atual, [1] para aumentar level, [2] aumentar pontuação e [3] para adicionar novo personagem, [4] para mostrar o status de todos os personagens e [5] para fechar o programa: ");
            opção = Integer.parseInt(leitor.nextLine());
            switch (opção){
                case 0:
                    System.out.print("Digite o numero de id o qual gostaria de verificar: ");
                    idReader = Integer.parseInt(leitor.nextLine());
                    DadosJogo idStatus = new DadosJogo(idReader);
                    idStatus.verificarStatus();
                break;
                case 1:
                    System.out.print("Digite o numero de id o qual gostaria de aumentar o nivel: ");
                    idReader = Integer.parseInt(leitor.nextLine());
                    DadosJogo idLevel = new DadosJogo(idReader);
                    idLevel.aumentarLevel();
                break;
                case 2:
                    System.out.print("Digite o numero de id o qual gostaria de aumentar a pontuação: ");
                    idReader = Integer.parseInt(leitor.nextLine());
                    DadosJogo idPontuação = new DadosJogo(idReader);
                    idPontuação.aumentarPontuação();
                break;
                case 3:
                    DadosJogo idCriarPersonagem = new DadosJogo(idPersonagem);
                    idCriarPersonagem.criarPersonagem();
                    idPersonagem++;
                break;
                case 4:

                break;
            }
        } while (opção != 5);
        leitor.close();
    }
}
/*
Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebeuma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criarum sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizadae automatizada.

Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. Osistema deve permitir a criação de perfis de jogadores, armazenando informações como nome, pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no sistema.

Dica:“Crie a classe `Jogador`, que deverá conter atributos privados para o `nome`, `pontuacao` e `nivel`do jogador. Inclua um construtor para inicializar esses atributos e métodos públicos para permitira manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação, subir de nível e exibir as informações do jogador.
 */