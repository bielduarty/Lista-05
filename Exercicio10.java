// 10Verificação de Divisibilidade:
//Escreva um programa que solicite ao usuário um número e verifique se ele é divisível por 3 e por 5.
package lista05;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro: ");
        float numero = sc.nextFloat();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e por 5.");
        } else {
            System.out.println("O número não é divisível por 3 e por 5.");
        }
        sc.close();
    }
}
