//1 Verificação de Número Primo:
//Escreva um programa que solicite ao usuário um número inteiro e verifique se ele é um número primo.
package lista05;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contadorDivisores = 0;
        int i = 1;

        // Conta quantos divisores o número tem
        while (i <= numero) {
            if (numero % i == 0) {
                contadorDivisores = contadorDivisores + 1;
            }
            i = i + 1;
        }

        // Um número primo tem apenas dois divisores: 1 e ele mesmo
        if (contadorDivisores == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
