package Exercício08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedidos {

    private int opção = 0, idPedido;
    private float preço;
    private String endereço, sabor, tamanho;
    private boolean entregue;

    private static int sendInt, counterPedido;
    private static List<Pedidos> pedidos = new ArrayList<Pedidos>();

    Pedidos(){

    }

    Pedidos(int id, String sabor, String tamanho, float preço, String endereço, boolean entregue){
        this.idPedido = id;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preço = preço;
        this.endereço = endereço;
        this.entregue = entregue;
    }

    void menuPedidos(){
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.print("[1] Gerar Pedido [2] Gerenciar Pedido [3] Mostrar pedidos não entregues [0] Menu principal: ");
            opção = Integer.parseInt(leitor.nextLine());
            switch (opção) {
                case 1:
                    gerarPedido();
                    break;
                case 2:
                    gerenciarPedido();
                    break;
                case 3:
                    mostrarPedidosPendentes();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        } while (true);
    }

    void mostrarPedido(){
        System.out.print("ID pedido [" + pedidos.get(sendInt).getId() + "] Sabor: [" + pedidos.get(sendInt).getSabor() + "] Tamanho: [" + pedidos.get(sendInt).getTamanho() + "] Preço: [" + pedidos.get(sendInt).getPreço() + "] Endereço: [" + pedidos.get(sendInt).getEndereço() + "]");
        if (pedidos.get(sendInt).getEntregue()){
            System.out.println(" [Entrega realizada]"); 
        }
        else{
            System.out.println(" [Entrega não realizada]"); 
        }
    }

    void gerarPedido(){
        Scanner leitor = new Scanner(System.in);
        Pizzas getSaboresTamanhos = new Pizzas();
        String novoSabor, novoTamanho;
        int retornoSabor, retornoTamanho;
        getSaboresTamanhos.mostrarSaboresETamanhos();
        int counter = 0;
        do{
            System.out.print("Qual sabor? ");
            novoSabor = leitor.nextLine();
            Pizzas mostrar = new Pizzas(novoSabor);
            retornoSabor = mostrar.buscarSabor();
            counter++;
            if (counter >= 3){
                System.out.print("Voltando ao menu.\n");
                return;
            }
        } while(retornoSabor < 0);
        counter = 0;
        do{
            System.out.print("Qual tamanho? ");
            novoTamanho = leitor.nextLine();
            Pizzas mostrar = new Pizzas(novoTamanho);
            retornoTamanho = mostrar.buscarTamanho();
            counter++;
            if (counter >= 3){
                System.out.print("Voltando ao menu.\n");
                return;
            }
        } while(retornoTamanho < 0);
        System.out.print("Qual o endereço de entrega? ");
        String endereçoPedido = leitor.nextLine();
        int novoId = counterPedido;
        Pedidos novoPedido = new Pedidos(novoId, novoSabor, novoTamanho, getPreçoPedido(retornoSabor, retornoTamanho), endereçoPedido, false);
        counterPedido++;
        pedidos.add(novoPedido);
        System.out.print("Pedido criado com sucesso.\n");
    }

    void gerenciarPedido(){
        Scanner leitor = new Scanner(System.in);
        int retorno, counterTry = 0;
        do{
            System.out.print("Qual o ID do pedido? ");
            int idGerenciar = Integer.parseInt(leitor.nextLine());
            retorno = buscarId(idGerenciar);
            sendInt = retorno;
            counterTry++;
            if (counterTry >+ 3){
                System.out.print("Voltando ao menu.\n");
                return;
            }
        } while (retorno < 0);
        mostrarPedido();
        do{
            System.out.print("[1] Alterar status de entrega [2] Alterar endereço [3] Remover pedido [0] Voltar ");
            opção = Integer.parseInt(leitor.nextLine());
            switch (opção) {
                case 1:
                    pedidos.get(sendInt).setEntrega();
                    System.out.print("Status alterado com sucesso!\n");
                    break;
                case 2:
                    System.out.print("Qual novo endereço de entrega? ");
                    String novoEndereço = leitor.nextLine();
                    pedidos.get(sendInt).setEndereço(novoEndereço);
                    System.out.print("Endereço alterado com sucesso! ");
                    break;
                case 3:
                    pedidos.remove(sendInt);
                    System.out.print("Pedido removido com sucesso!\n");
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        } while(true);
    }

    int buscarId(int receiveId){
        for(int i = 0; i < pedidos.size(); i++){
            if (receiveId == pedidos.get(i).getId()){
                return i;
            }
        }
        System.out.print("Id não encontrado.\n");
        return -1;
    }

    void mostrarPedidosPendentes(){
        for(int i = 0; i < pedidos.size(); i++){
            if (pedidos.get(i).getEntregue()){
            }
            else {
                sendInt = i;
                mostrarPedido();
            }

        }
    }

    float getPreçoPedido(int idSabor, int idTamanho){
        Pizzas envio = new Pizzas();
        float preçoPedido = envio.preçoPedido(idSabor, idTamanho);
        return preçoPedido;
    }

    int getId(){
        return this.idPedido;
    }

    String getSabor(){
        return this.sabor;
    }

    String getTamanho(){
        return this.tamanho;
    }

    float getPreço(){
        return this.preço;
    }

    String getEndereço(){
        return this.endereço;
    }

    boolean getEntregue(){
        return this.entregue;
    }

    void setEndereço(String alteração){
        this.endereço = alteração;
    }

    void setEntrega(){
        if (this.entregue == false){
            this.entregue = true;
            return;
        }
        else{
            this.entregue = false;
            return;
        }
    }
}
