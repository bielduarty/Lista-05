// 7Verificação de Nota e Conceito:
//Escreva um programa que solicite ao usuário uma nota de
//0 a 100 e exiba o conceito correspondente (A, B, C, D, F).
package lista05;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("Conceito: A");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("Conceito: B");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("Conceito: C");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("Conceito: D");
        } else if (nota >= 0 && nota < 60) {
            System.out.println("Conceito: F");
        } else {
            System.out.println("Nota inválida! Digite um número entre 0 e 100.");
        }

        sc.close();
    }
}