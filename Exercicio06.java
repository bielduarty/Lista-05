// 6Verificação de Paridade e Positividade:
//Escreva um programa que solicite ao usuário um número
//inteiro e verifique se ele é par ou ímpar, e se é positivo, negativo ou zero.
package lista05;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        sc.close();
    }
}