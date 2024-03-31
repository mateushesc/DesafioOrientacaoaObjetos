package Exercício03;

import java.util.Scanner;

public class Banco {
    private float saldoConta, addSaldo, subSaldo;
    private int idConta;
    private String nomeConta;

    Banco(float saldo, int id, String nome){
        saldoConta = saldo;
        idConta =  id;
        nomeConta = nome;
    }
    void adicionarSaldo(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quanto de saldo deseja adicionar na conta de " + nomeConta + "? ");
        addSaldo = Float.parseFloat(leitor.nextLine());
        saldoConta += addSaldo;
        System.out.print("O saldo atualizado da conta " + idConta + " é: " + saldoConta + ".\n");
    }
    void subtrairSaldo(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quanto de saldo deseja subtrair na conta de " + nomeConta + "? ");
        subSaldo = Float.parseFloat(leitor.nextLine());
        saldoConta -= subSaldo;
        System.out.print("O saldo atualizado da conta [" + idConta + "] é: " + saldoConta + ".\n");
    }
    void verificarSaldo(){
        System.out.print("O saldo da conta do(a) " + nomeConta + " é: " + saldoConta + ".\n");
    }
    void adicionarConta(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("-- Criacao de nova conta -- \n Digite o nome que deseja para a conta de numero [" + idConta + "]: ");
        nomeConta = leitor.nextLine();
        Banco criarConta = new Banco(0, idConta, nomeConta);
    }
}
