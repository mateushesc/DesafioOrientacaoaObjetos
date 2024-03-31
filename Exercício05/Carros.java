package Exercício05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carros {
    private int ano, velocidadeAtual, idCarro;
    private String cor, marca, modelo, placa;
    private static int idCarroAtual;

    private static List<Carros> carrosLista = new ArrayList<Carros>();

    Carros(int envio){
        idCarro = envio;
    }

    Carros(String cor, String marca, String modelo, String placa, int velocidadeAtual, int ano){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
        this.ano = ano;
    }

    void StatusCarroAtual(){
        System.out.print("O Carro de id [" + idCarro + "] tem a cor [" + carrosLista.get(idCarro).getCor() + "] a sua marca é [" + carrosLista.get(idCarro).getMarca() + "] é do modelo [" + carrosLista.get(idCarro).getModelo() + "] sua placa é [" + carrosLista.get(idCarro).getPlaca() + "] seu ano de fabricação é [" + carrosLista.get(idCarro).getAno() + "] e sua velocidade é [" + carrosLista.get(idCarro).getVelocidadeAtual() + "]\n");
    }

    void acelerar(){
        carrosLista.get(idCarroAtual).setVelocidade(idCarro);
    }

    void mudarCarro(){
        Scanner leitor = new Scanner(System.in);
        Carros showAll = new Carros(idCarro);
        showAll.mostrarTodosCarros();
        System.out.print("Digite o número do carro o qual gostaria de selecionar: ");
        idCarroAtual = Integer.parseInt(leitor.nextLine());
        System.out.print("Carro atual alterado com sucesso.\n");
    }

    int criarCarro(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a cor do carro: ");
        cor = leitor.nextLine();
        System.out.print("Digite a marca do carro: ");
        marca = leitor.nextLine();
        System.out.print("Digite o modelo do carro: ");
        modelo = leitor.nextLine();
        System.out.print("Digite a placa do carro: ");
        placa = leitor.nextLine();
        System.out.print("Digite o ano do carro: ");
        ano = Integer.parseInt(leitor.nextLine());
        Carros novoCarro = new Carros(cor, marca, modelo, placa, 0, ano);
        carrosLista.add(novoCarro);
        System.out.print("Carro adicionado com sucesso. \n");
        int idCarroNovo = (carrosLista.size() - 1);
        idCarroAtual = idCarroNovo;
        Carros id = new Carros(idCarroNovo);
        id.StatusCarroAtual();
        return idCarroNovo;
    }
    
    String getCor(){
        return this.cor;
    }

    String getMarca(){
        return this.marca;
    }

    String getModelo(){
        return this.modelo;
    }

    String getPlaca(){
        return this.placa;
    }

    int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    int getAno(){
        return this.ano;
    }

    int setVelocidade(int condição){
        if (condição <= 0) {
            this.velocidadeAtual += 5;
        }
        else{
            if (this.velocidadeAtual > 4){
                this.velocidadeAtual -= 5;
            }
        }
        System.out.print("Velocidade atual do carro atual é: " + carrosLista.get(idCarroAtual).getVelocidadeAtual() + " IdCarro atual [" + idCarroAtual +"]\n");
        return condição;
    }

    
    void mostrarTodosCarros(){
        int totalCarros  = this.idCarro;
        System.out.print("\n- Mostrando todos os carros - \n");
        for (int i = 0; i < totalCarros; i++){
            Carros showAll = new Carros(i);
            showAll.StatusCarroAtual();
        }
        System.out.print("---------------------------- \n\n");
    }

}
