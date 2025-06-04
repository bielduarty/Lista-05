// 4Verificação de Ano Bissexto:
//Escreva um programa que solicite ao usuário um ano e verifique se ele é bissexto.
package lista05;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        sc.close();
    }
}