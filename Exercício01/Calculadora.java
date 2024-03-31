package Exercício01;

import java.util.Scanner;

public class Calculadora {
    Scanner leitor = new Scanner(System.in);

    float numero1 = 0, numero2 = 0, resultado = 0;
    
    Calculadora(float n1, float n2, float resu){
        numero1 = n1;
        numero2 = n2;
        resultado = resu;
    }

    void soma(){
        resultado = numero1 + numero2;
        System.out.print("O resultado da soma do número " + numero1 + " e o número " + numero2 + " é: " + resultado);
    }
    void sub(){
        resultado = numero1 - numero2;
        System.out.print("O resultado da subtração do número " + numero1 + " pelo número " + numero2 + " é: " + resultado);
    }
    void mult(){
        resultado = numero1 * numero2;
        System.out.print("O resultado da divisão do número " + numero1 + " pelo número " + numero2 + " é: " + resultado);
    }
    void div(){
        resultado = numero1 / numero2;
        System.out.print("O resultado da multiplicação do número " + numero1 + " e o número " + numero2 + " é: " + resultado);
    }
}
