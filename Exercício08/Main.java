package Exercício08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opção = 0;
        do{
            System.out.print("[1] Gerenciar pedidos [2] Gerenciar pizzas [0] Encerrar programa: ");
            opção = Integer.parseInt(leitor.nextLine());
            switch (opção) {
                case 1:
                    Pedidos envioPedidos = new Pedidos();
                    envioPedidos.menuPedidos();
                    break;
                case 2:
                    Pizzas envioPizzas = new Pizzas();
                    envioPizzas.menuPizzas();
                    break;
                default:
                    break;
            }
        } while (opção != 0);
        leitor.close();
    } 
}
/*
Uma pizzaria local busca modernizar seu processo de registro de pedidos, optando por desenvolver um sistema em Java que ofereça praticidade e eficiência aos seus clientes e funcionários. O objetivo é criar uma solução simples e acessível, capaz de armazenar detalhes fundamentais de cada pedido, como o tipo de pizza escolhida, o tamanho desejado, o valor a ser pago e o endereço de entrega. Para atender a essa demanda, a empresa pretende implementar uma classe Pedido, responsável por todas as operações relacionadas aos pedidos.

Dentro da classe Pedido, os funcionários poderão adicionar novos pedidos ao sistema, fornecer detalhes específicos sobre cada pedido, como sabor da pizza e endereço de entrega, além de ter a capacidade de cancelar pedidos, se necessário. Além disso, o sistema será capaz de gerar um relatório completo de todos os pedidos registrados, oferecendo insights valiosos, como o número total de pedidos realizados e a média de preço dos pedidos. Essa abordagem integrada visa simplificar e otimizar o processo de registro e gerenciamento de pedidos,contribuindo para uma experiência mais eficiente e satisfatória tanto para a pizzaria quanto para seus clientes.

Além disso, faça com que o sistema já tenha algumas pizzas cadastradas com nome para serem escolhidas em um menu antes de adicionadas ao pedido. Desta forma, além da classe Pedido responsável por gerenciar os pedidos realizados na pizzaria, cria uma classe Pizza que contenha o nome, valor e ingredientes de cada pizza a ser escolhida em um pedido.

Obs. os objetos “pizzas” da classe pizza podem ser criados e adicionados manualmente em uma lista pelo código na main. Mas caso queira, é possível também fazer um menu para adicionar novos sabores além dos existentes.
 */