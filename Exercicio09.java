// 9Verificação de Sinal de Número:
//Escreva um programa que solicite ao usuário um número e verifique se ele é positivo, negativo ou zero.
package lista05;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro: ");
        float numero = sc.nextFloat();

        if (numero >= 0) {
            System.out.printf("O número é positivo");
        } else if (numero <= 0) {
            System.out.printf("O número é negativo");
        } else {
            System.out.printf("O número é zero");
        }

        sc.close();
    }
}
