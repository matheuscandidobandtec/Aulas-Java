package com.example.lista1;


import java.util.Scanner;

public class Exercicio2 {

    public static void main (String [] args){
    Double n1,n2;
    String nome;


    Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");

        n1= leitor.nextDouble();

        System.out.println("Digite outro número:");

        n2= leitor.nextDouble();

        System.out.println("A soma dos números é: " + (n1+n2));
        System.out.println("A subtração dos números é: " + (n1-n2));
        System.out.println("A multiplicação dos números é: " + (n1*n2));

        System.out.println("O resto da divisão é: " + (n1/n2));

    //exercicio1 completo


}
}
