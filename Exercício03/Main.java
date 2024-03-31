package Exercício03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opção = 0, idContas = 0, acessoConta;
        List<Banco> contas = new ArrayList<Banco>();
        do {    
        System.out.print("Digite qual operação deseja realizar: [0] para mostrar saldo atual, [1] para adção de saldo, [2] para subtração de saldo e [3] para adicionar nova conta e [4] para fechar o programa: ");
        opção = Integer.parseInt(leitor.nextLine());
        switch (opção){
            case 0:
            System.out.print("Digite o id da conta que quer acessar: ");
            acessoConta = Integer.parseInt(leitor.nextLine());
            contas.get(acessoConta).verificarSaldo();
            break;
            case 1:
            System.out.print("Digite o id da conta que quer acessar: ");
            acessoConta = Integer.parseInt(leitor.nextLine());
            contas.get(acessoConta).adicionarSaldo();
            break;
            case 2:
            System.out.print("Digite o id da conta que quer acessar: ");
            acessoConta = Integer.parseInt(leitor.nextLine());
            contas.get(acessoConta).subtrairSaldo();
            break;
            case 3:
            Banco criarConta = new Banco(0, idContas, null);
            contas.add(criarConta);
            contas.get(idContas).adicionarConta();
            idContas++;
            break;
        }
        } while (opção != 4);
        leitor.close();
    }
}

/*
Em uma pequena cidade, um desenvolvedor entusiasta decide criar um sistema para ajudar agerenciar as contas bancárias dos cidadãos locais. Com o crescimento da comunidade, ficouevidente a necessidade de um método mais eficiente e seguro para o manejo de transações bancárias, que até então eram feitas manualmente e levavam muito tempo.

Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancário simples em Java, focando na orientação a objetos. Este sistema permitirá a criação de contasbancárias, cada uma capaz de realizar operações básicas como depósitos, saques e consultas desaldo. O desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo osprincípios da programação orientada a objetos

.Dica:“Projete uma classe `ContaBancaria` que encapsule os atributos de uma conta, como `numeroConta`,`nomeTitular` e `saldo`. Utilize modificadores de acesso para garantir o encapsulamento e a segurança dos dados. Implemente métodos para `depositar(valor)`, `sacar(valor)` e um método que retorne o `saldo` atual daconta. Lembre-se de que cada operação deve ajustar o saldo da conta de acordo com a transação realizada.”
 */