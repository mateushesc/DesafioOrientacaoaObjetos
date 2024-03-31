package Exercício05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char opção = 0;
        String leitorString;
        int totalCarros = 0;

        Carros envio = new Carros(0);

        do{ 
            System.out.print("[1] para freiar carro atual [2] para acelerar carro atual [m] para mudar de carro [a] para mostrar todos os carros e [x] para fechar o programa. ");
            leitorString = leitor.nextLine();
            opção = leitorString.charAt(0);
            switch (opção) {
                case '1':
                    envio = new Carros(1);
                    envio.acelerar();
                    break;
                case '2':
                    envio = new Carros(0);
                    envio.acelerar();
                    break;
                case 'm':
                    System.out.print("[1] para mudar para carro já criado, [2] para criar novo carro e [qualquer outro caracter] para cancelar. ");
                    leitorString = leitor.nextLine();
                    opção = leitorString.charAt(0);
                    switch (opção) {

                        case '1':
                            envio = new Carros(totalCarros);
                            envio.mudarCarro();
                            break;

                        case '2':
                            Carros criar = new Carros(totalCarros++);
                            criar.criarCarro();
                            break;

                        default:
                            break;
                        }

                    break;

                case 'a':
                        envio = new Carros(totalCarros);
                        envio.mostrarTodosCarros();
                    break;

                case 'x':
                    break;

                default:
                    System.out.println("Entrada inválida.");
                    break;

            }
        } while(opção != 'x');
        leitor.close();
    }
}

/*
Em uma tranquila cidade conhecida por sua paixão por automobilismo, um grupo de entusiastas de carros clássicos decide organizar um evento para exibir seus veículos. Para tornar o evento mais interessante, eles planejam criar um sistema que permita aos participantes registrarem seus carros, incluindo informações detalhadas e a capacidade de controlar algumas funcionalidades dos carros, como a velocidade.

Motivado por esse evento de carros clássicos, o desafio é desenvolver uma classe `Carro` em Java,aplicando os princípios da orientação a objetos. Este sistema deve permitir aos usuários criarem objetos`Carro` com informações como marca, modelo, ano e velocidade atual. Além disso, os carros devem ter métodos que permitam acelerar e frear, ajustando a velocidade atual de acordo com a ação realizada.

Dica:“Desenvolva a classe ‘Carro’ com atributos privados para ‘marca’, ‘modelo’, ‘ano’, ‘placa’ e ‘velocidadeAtual’. Implemente um construtor para inicializar os atributos do carro quando um novo objeto é criado. Adicione métodos públicos para `acelerar()`, que aumenta a velocidade do carro, e `frear()`, que diminui a velocidade. Não esqueça de incluir um método para exibir as informações do carro, refletindo a importância da encapsulação e da interação entre os objetos em um programa orientado a objetos.”

 */
