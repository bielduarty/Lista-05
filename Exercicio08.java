// 8Verificação de Categoria de Idade:
//Escreva um programa que solicite ao usuário sua idade e exiba
//a categoria correspondente (Criança, Adolescente, Adulto, Idoso).
package lista05;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Categoria: criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idade >= 18 && idade <= 49) {
            System.out.println("Categoria: Adulto");
        } else if (idade >= 50 && idade <= 70) {
            System.out.println("Categoria: Idoso");
        } else {
            System.out.println("Matusalém fazendo hora extra");
        }

        sc.close();
    }
}