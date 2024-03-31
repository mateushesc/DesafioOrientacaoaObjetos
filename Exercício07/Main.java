package Exercício07;

import java.util.Scanner;

public class Main {
    static int opção = 0, retorno = 0;
    static Produto envioInt = new Produto(0);
    static Produto envioString = new Produto(null);
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("-------------------- Menu -------------------- \n[1] Para adicionar produto\n[2] Para verificar e atualizar inventário\n[3] Relatório de estoque\n[0] Para encerrar programa.\n----------------------------------------------");
            opção = Integer.parseInt(leitor.nextLine());
            switch (opção) {
                case 1:
                    envioInt.criarProduto();
                    break;
                case 2:
                    do{
                        System.out.print("----------------------------------------------\n[1] Para procurar por nome do produto\n[2] Para procurar por código de produto\n[0] Voltar\n----------------------------------------------\n");
                        opção = Integer.parseInt(leitor.nextLine());
                        switch (opção) {
                            case 1:
                                System.out.print("----------------------------------------------\nDigite o nome do produto: ");
                                String nomeProduto = leitor.nextLine();
                                envioString = new Produto(nomeProduto);
                                retorno = envioString.buscarProdutoNome();
                                if (retorno != -1){
                                    do{
                                        System.out.print("----------------------------------------------\n[1] Remover produto\n[2] Alterar nome do produto\n[3] Alterar código do produto\n[4] Alterar preço do produto\n[5] Alterar quantidade no estoque do produto\n[0] Voltar\n----------------------------------------------\n");
                                        opção = Integer.parseInt(leitor.nextLine());
                                        switch (opção) {
                                            case 1:
                                                envioInt.removerProduto();
                                                opção = 0;
                                                break;
                                            case 2:
                                                envioInt.alterarNome();
                                                break;
                                            case 3:
                                                envioInt.alterarCódigo();
                                                break;
                                            case 4:
                                                envioInt.alterarPreço();
                                                break;
                                            case 5:
                                                envioInt.alterarQuantidade();
                                                break;
                                            default:
                                                break;
                                        }
                                    } while (opção != 0);
                                }
                                break;
                            case 2:
                                System.out.print("----------------------------------------------\nDigite o nome do código: ");
                                String códigoProduto = leitor.nextLine();
                                envioString = new Produto(códigoProduto);
                                retorno = envioString.buscarProdutoCódigo();
                                if (retorno != 1){
                                    do{
                                        System.out.print("----------------------------------------------\n[1] Remover produto\n[2] Alterar nome do produto\n[3] Alterar código do produto\n[4] Alterar preço do produto\n[5] Alterar quantidade no estoque do produto\n[0] Voltar\n----------------------------------------------\n");
                                        opção = Integer.parseInt(leitor.nextLine());
                                        switch (opção) {
                                            case 1:
                                                envioInt.removerProduto();
                                                opção = 0;
                                                break;
                                            case 2:
                                                envioInt.alterarNome();
                                                break;
                                            case 3:
                                                envioInt.alterarCódigo();
                                                break;
                                            case 4:
                                                envioInt.alterarPreço();
                                                break;
                                            case 5:
                                                envioInt.alterarQuantidade();
                                                break;
                                            default:
                                                break;
                                        }
                                    } while (opção != 0);
                                }
                                break;
                        
                            default:
                                break;
                        }
                    } while (opção != 0);
                    opção = -1;
                    break;
                case 3:
                    envioInt.mostrarEstoque();
                    break;
                default:
                    break;
            }
        } while (opção != 0);
        leitor.close();
    }
}

/*
Um empreendedor que gerencia um mercado local percebe a necessidade de um sistema para gerenciaro estoque de produtos em sua loja. Ele deseja desenvolver um programa em Java que seja capaz de registrar informações sobre os produtos disponíveis, controlar as quantidades em estoque e fornecer funcionalidades básicas de gerenciamento de estoque. O sistema proposto deve permitir que cada produto seja identificado por seu nome, um código único, um preço e a quantidade em estoque.

Os funcionários do mercado devem ser capazes de adicionar novos produtos ao estoque, atualizar as informações de um produto existente e remover produtos do estoque quando necessário. Para facilitar o gerenciamento do mercado, o sistema também deve ser capaz de gerar relatórios sobre o estoque atual, incluindo informações como os produtos disponíveis, a quantidade em estoque e o valor total em estoque.

Dica:“Como já deve ter entendido com os últimos exercícios, aqui você pode criar uma classe Produto que contém as informações sobre cada item do mercado, entre nome, código do produto, quantidade em estoque e preço. Neste caso, não é necessário criar uma classe Mercado para gerenciar o estoque individual de cadas mercado e pode-se utilizar a própria Main que faz o programa funcionar para isso.”
 */