package Exercício07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {

    private String nomeProduto, códigoProduto, solicitaçãoString;
    private float preçoProduto;
    private int estoqueProduto, solicitaçãoInt;

    private static int idProdutoAtual;
    private static String códigoNovoProduto;

    private static List <Produto> produtos = new ArrayList<Produto>();

    Produto(String nome, String código, float preço, int estoque){
        this.nomeProduto = nome;
        this.códigoProduto = código;
        this.preçoProduto = preço;
        this.estoqueProduto = estoque;
    }

    Produto(int soliInt){
        this.solicitaçãoInt = soliInt;
    }
    Produto(String soliString){
        this.solicitaçãoString = soliString;
    }

    void criarProduto(){
        Scanner leitor = new Scanner(System.in);
        int retorno;
        System.out.print("------------- Criação de Produto -------------\nNome do produto: ");
        String nomeNovoProduto = leitor.nextLine();
        do{
            System.out.print("Código produto: ");
            códigoNovoProduto = leitor.nextLine();
        } while (verificarCódigo());
        System.out.print("Preço produto: ");
        float preçoNovoProduto = Float.parseFloat(leitor.nextLine());
        System.out.print("Quantidade produto: ");
        int quantidadeNovoProduto = Integer.parseInt(leitor.nextLine());
        Produto novoProduto = new Produto(nomeNovoProduto, códigoNovoProduto, preçoNovoProduto, quantidadeNovoProduto);
        produtos.add(novoProduto);
        System.out.print("Produto adicionado com sucesso.\n");
    }

    void removerProduto(){
        produtos.remove(idProdutoAtual);
        System.out.print("----------------------------------------------\nProduto removido com sucesso.\n");
    }

    int buscarProdutoNome(){
        for (int i = 0; i < produtos.size(); i++){
            if (this.solicitaçãoString.equals(produtos.get(i).getNome())) {
                System.out.print("Produto encontrado.\n");
                idProdutoAtual = i;
                mostrarProduto();
                return i;
            } 
        }
        System.out.print("Produto não encontrado.\n");
        return -1;
    }

    int buscarProdutoCódigo(){
        for (int i = 0; i < produtos.size(); i++){
            if (this.solicitaçãoString.equals(produtos.get(i).getCódigo())) {
                System.out.print("Produto encontrado.\n");
                idProdutoAtual = i;
                mostrarProduto();
                return i;
            } 
        }
        System.out.print("Produto não encontrado.\n");
        return -1;
    }

    float mostrarProduto(){
        System.out.println("----------------------------------------------\nInformações produto de código: [" + produtos.get(idProdutoAtual).getCódigo() + "]\n----------------------------------------------\nNome: " + produtos.get(idProdutoAtual).getNome() + "\nPreço: " + produtos.get(idProdutoAtual).getPreço() + "\nQuantidade no estoque: " + produtos.get(idProdutoAtual).getEstoque() + "\nPreço atual do estoque do produto: " + preçoTotalProduto());
        return preçoTotalProduto();
    }

    void alterarNome(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("----------------------------------------------\nDigite novo nome para o produto de código [" + produtos.get(idProdutoAtual).getCódigo() + "]\n----------------------------------------------");
        String novoNome = leitor.nextLine();
        produtos.get(idProdutoAtual).setNome(novoNome);
        System.out.print("----------------------------------------------\nNome alterado com sucesso.\n");
    }

    void alterarCódigo(){
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println("----------------------------------------------\nDigite novo código para o produto de código [" + produtos.get(idProdutoAtual).getCódigo() + "]\n----------------------------------------------");
            códigoNovoProduto = leitor.nextLine();
        } while (verificarCódigo());
        produtos.get(idProdutoAtual).setCódigo(códigoNovoProduto);
        System.out.print("----------------------------------------------\nCódigo alterado com sucesso.\n");
    }

    void alterarPreço(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("----------------------------------------------\nDigite novo preço para o produto de código [" + produtos.get(idProdutoAtual).getCódigo() + "]\n----------------------------------------------");
        float novoPreço = Float.parseFloat(leitor.nextLine());
        produtos.get(idProdutoAtual).setPreço(novoPreço);
        System.out.print("----------------------------------------------\nPreço alterado com sucesso.\n");
    }

    void alterarQuantidade(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("----------------------------------------------\nDigite a alteração no estoque do produto de código [" + produtos.get(idProdutoAtual).getCódigo() + "]\n----------------------------------------------");
        int alteraçãoEstoque = Integer.parseInt(leitor.nextLine());
        produtos.get(idProdutoAtual).setQuantidade(alteraçãoEstoque);
        System.out.print("----------------------------------------------\nQuantidade atualizada com sucesso.\n");
    }

    float preçoTotalProduto(){
        float resultado = (produtos.get(idProdutoAtual).getPreço() * produtos.get(idProdutoAtual).getEstoque());
        return resultado;
    }

    void mostrarEstoque(){
        float allEstoque = 0;
        for (int i = 0; i < produtos.size(); i++){
            idProdutoAtual = i;
            allEstoque += mostrarProduto();
        }
        System.out.println("----------------------------------------------\nPreço total do estoque: " + allEstoque);
    }

    boolean verificarCódigo(){
        for (int i = 0; i < produtos.size(); i++){
            if (códigoNovoProduto.equals(produtos.get(i).getCódigo())) {
                System.out.print("Código já utilizado!\n");
                return true;
            }
        }
        return false;
    }

    String getNome(){
        return this.nomeProduto;
    }

    String getCódigo(){
        return this.códigoProduto;
    }

    float getPreço(){
        return this.preçoProduto;
    }

    int getEstoque(){
        return this.estoqueProduto;
    }
    void setNome(String alteração){
        this.nomeProduto = alteração;
    }

    void setCódigo(String alteração){
        this.códigoProduto = alteração;
    }

    void setPreço(float alteração){
        this.preçoProduto = alteração;
    }

    void setQuantidade(int alteração){
        this.estoqueProduto += alteração;
    }
}
