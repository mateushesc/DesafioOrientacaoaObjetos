package Exercício08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzas {

    private int opção = 0;
    private String sabor, tamanho, descriçãoIngredientes, trocaString;
    private float tamanhoDiametro, preço, trocaFloat;

    private static int sendInt;
    private static String sendString;
    private static List<Pizzas> sabores = new ArrayList<Pizzas>();
    private static List<Pizzas> tamanhos = new ArrayList<Pizzas>();

    Pizzas(String sabor, String descrição,float preço){
        this.sabor = sabor;
        this.descriçãoIngredientes = descrição;
        this.preço = preço;
    }

    Pizzas(String tamanho,  float tamanhoDiametro, float preço){
        this.tamanho = tamanho;
        this.tamanhoDiametro = tamanhoDiametro;
        this.preço = preço;
    }

    Pizzas(String pedido){
        sendString = pedido;
    }

    Pizzas(){
    }

    void menuPizzas(){
            Scanner leitor = new Scanner(System.in);
            do{
                System.out.print("[1] Criar sabor [2] Remover sabor [3] Criar tamanho [4] Remover tamanho [5] Mostrar todos sabores [6] Mostrar todos tamanhos [7] Gerenciar sabor [8] Gerenciar tamanho [0] Menu principal: ");
                opção = Integer.parseInt(leitor.nextLine());
                switch (opção) {
                    case 1:
                        criarSabor();
                        break;
                    case 2:
                        removerSabor();
                        break;
                    case 3:
                        criarTamanho();
                        break;
                    case 4:
                        removerTamanho();
                        break;
                    case 5:
                        for (int i = 0; i < sabores.size(); i++){
                        mostrarSabor(i);
                        }
                        break;
                    case 6:
                        for (int i = 0; i < tamanhos.size(); i++){
                        mostrarTamanho(i);
                        }
                        break;
                    case 7:
                        System.out.print("Qual sabor? ");
                        sendString = leitor.nextLine();
                        sendInt = buscarSabor();
                        if (sendInt == -1){
                            menuPizzas();
                        }
                        System.out.print("[1] Nome [2] Ingredientes [3] Preço: ");
                        opção = Integer.parseInt(leitor.nextLine());
                        switch (opção) {
                            case 1:
                                System.out.print("Qual novo nome? ");
                                trocaString = leitor.nextLine();
                                sabores.get(sendInt).setSabor(trocaString);
                                System.out.print("Nome do sabor alterado com sucesso.\n");
                                break;
                            case 2:
                                System.out.print("Quaais são os novos igredientes? ");
                                trocaString = leitor.nextLine();
                                sabores.get(sendInt).setIngredientes(trocaString);
                                System.out.print("Ingredientes do sabor alterado com sucesso.\n");
                                break;
                            case 3:
                                System.out.print("Qual novo preço? ");
                                trocaFloat = Float.parseFloat(leitor.nextLine());
                                sabores.get(sendInt).setPreço(trocaFloat);
                                System.out.print("Preço do sabor alterado com sucesso.\n");
                                break;
                        
                            default:
                                System.out.print("Entrada inválida\n");
                                break;
                        }
                        break;
                    case 8:
                        System.out.print("Qual tamanho? ");
                        sendString = leitor.nextLine();
                        sendInt = buscarTamanho();
                        if (sendInt == -1){
                            menuPizzas();
                        }
                        System.out.print("[1] Nome [2] Diametro [3] Preço: ");
                        opção = Integer.parseInt(leitor.nextLine());
                        switch (opção) {
                            case 1:
                                System.out.print("Qual novo nome? ");
                                trocaString = leitor.nextLine();
                                tamanhos.get(sendInt).setTamanho(trocaString);
                                System.out.print("Nome do tamanho alterado com sucesso.\n");
                                break;
                            case 2:
                                System.out.print("Qual o novo diametro? ");
                                trocaFloat = Float.parseFloat(leitor.nextLine());
                                tamanhos.get(sendInt).setDiametro(trocaFloat);
                                System.out.print("Diametro do tamanho alterado com sucesso.\n");
                                break;
                            case 3:
                                System.out.print("Qual novo preço? ");
                                trocaFloat = Float.parseFloat(leitor.nextLine());
                                tamanhos.get(sendInt).setPreço(trocaFloat);
                                System.out.print("Preço do tamanho alterado com sucesso.\n");
                                break;
                        
                            default:
                                System.out.print("Entrada inválida\n");
                                break;
                        }
                        break;
                    case 0:
                        return;
                    default:
                        break;
                }
        } while (true);
    }

    int buscarSabor(){
        for (int i = 0; i < sabores.size(); i++){
            if (sendString.equals(sabores.get(i).getSabor())) {
                return i;
            } 
        }
        System.out.print("Sabor não encontrado.\n");
        return -1;
    }

    int buscarTamanho(){
        for (int i = 0; i < tamanhos.size(); i++){
            if (sendString.equals(tamanhos.get(i).getTamanho())) {
                return i;
            } 
        }
        System.out.print("Tamanho não encontrado.\n");
        return -1;
    }

    void criarSabor(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o nome do sabor? ");
        String novoNome = leitor.nextLine();
        System.out.print("Quais os ingredientes? ");
        String novosIngredientes = leitor.nextLine();
        System.out.print("Qual o preço? ");
        float novoPreço = Float.parseFloat(leitor.nextLine());
        Pizzas novoSavor =  new Pizzas(novoNome, novosIngredientes, novoPreço);
        sabores.add(novoSavor);
        System.out.print("Sabor criado!\n");
    }
    
    void removerSabor(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual sabor gostaria de remover? ");
        sendString = leitor.nextLine();
        int id = buscarSabor();
        if (id != -1){
            sabores.remove(id);
            System.out.print("Sabor removido com sucesso.\n");
        }
    }

    void criarTamanho(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o nome do tamanho? ");
        String novoNome = leitor.nextLine();
        System.out.print("Qual o diametro? ");
        float novoDiametro = Float.parseFloat(leitor.nextLine());
        System.out.print("Qual o preço? ");
        float novoPreço = Float.parseFloat(leitor.nextLine());
        Pizzas novoTamanho =  new Pizzas(novoNome, novoDiametro, novoPreço);
        tamanhos.add(novoTamanho);
        System.out.print("Tamanho criado!\n");
    }

    void removerTamanho(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual tamanho gostaria de remover? ");
        sendString = leitor.nextLine();
        int id = buscarTamanho();
        if (id != -1){
            tamanhos.remove(id);
            System.out.print("Tamanho removido com sucesso.\n");
        }
    }

    void mostrarSaboresETamanhos(){
        for (int i = 0; i < sabores.size(); i++){
            mostrarSabor(i);
            }
        for (int i = 0; i < tamanhos.size(); i++){
            mostrarTamanho(i);
            }
    }

    void mostrarSabor(int id){
        System.out.println("[" + id + "] Nome: " + sabores.get(id).getSabor() + " Ingredientes: " + sabores.get(id).getIngredientes() + " Preço: " + sabores.get(id).getPreço());
    }

    void mostrarTamanho(int id){
        System.out.println("[" + id + "] Nome: " + tamanhos.get(id).getTamanho() + " Diametro: " + tamanhos.get(id).getDiamentro() + " Preço: " + tamanhos.get(id).getPreço());
    }

    String getSabor(){
        return this.sabor;
    }

    String getTamanho(){
        return this.tamanho;
    }

    float getDiamentro(){
        return this.tamanhoDiametro;
    }

    float getPreço(){
        return this.preço;
    }

    String getIngredientes(){
        return this.descriçãoIngredientes;
    }

    void setSabor(String troca){
        this.sabor = troca;
    }

    void setIngredientes(String troca){
        this.descriçãoIngredientes = troca;
    }

    void setTamanho(String troca){
        this.tamanho = troca;
    }

    void setDiametro(float troca){
        this.tamanhoDiametro = troca;
    }

    void setPreço(float troca){
        this.preço = troca;
    }

    float preçoPedido(int sabor, int tamanho){
        float resultado = (sabores.get(sabor).getPreço() * tamanhos.get(tamanho).getPreço());
        return resultado;
    }
}
