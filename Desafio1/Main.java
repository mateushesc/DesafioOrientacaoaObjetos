package Desafio1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        int op;
        float numero1 = 0, numero2 = 0, resulltado = 0;
        char loop;
        do{
            do{
            System.out.print("Digite 1 para realizar uma adição, 2 para uma subtração, 3 para multiplicação e 4 para divisão: ");
            op = Integer.parseInt(leitor.nextLine());
            } while (op < 1 || op > 4);

            System.out.print("Digite o número 1: ");
            numero1 = Integer.parseInt(leitor.nextLine());
            System.out.print("Digite o número 2: ");
            numero2 = Integer.parseInt(leitor.nextLine());
            Calculadora numeros = new Calculadora(numero1, numero2, resulltado);

            switch (op) {
                case 1:
                numeros.soma();
                break;
                case 2:
                numeros.sub();
                break;
                case 3:
                numeros.mult();
                break;
                case 4:
                numeros.div();
                break;    
            }
        
            do{
                System.out.println("\nGoraria de realizar outra operação? 'y' para sim e 'n' para não");
                loop = leitor.next().charAt(0); 
                leitor.nextLine(); //para evitar erro na linha 15 (erro onde o leitor deixa um enter)
            } while (loop != 'y' && loop != 'n');
            
        } while (loop != 'n');
        leitor.close();
    }
}

/*
EXERCÍCIO 01:

Num mundo repleto de equações e problemas matemáticos, um estudante de programação se depara com o desafio de simplificar suas tarefas diárias. Ele percebe que, ao invés de recorrer sempre à calculadora física ou ao celular, poderia praticar suas habilidades de programação criando uma ferramenta personalizada.

Inspirado por essa necessidade, ele decide desenvolver sua própria calculadora digital em Java. Essa calculadora simplificada deverá realizar as quatro operações matemáticas básicas: adição, subtração, multiplicação e divisão. Além disso, ele quer garantir que a calculadora seja fácil de usar, com métodos claramente definidos para cada operação.



Dica:

“Crie uma classe `Calculadora` que contenha métodos para adicionar, subtrair, multiplicar e dividir, aceitando dois números reais como parâmetros para cada método e retornando o resultado. Estes métodos devem ser estáticos. Logo, não será necessário instanciar um objeto do tipo Calculadora para poder utilizar esses métodos. Certifique-se de que a divisão por zero seja tratada de maneira a evitar erros de execução.”
 */