// 3Cálculo de IMC:
//Escreva um programa que solicite ao usuário seu peso e altura, calcule o
//Índice de Massa Corporal (IMC) e classifique-o de acordo com a tabela de IMC.
package lista05;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc < 39.9) {
            System.out.println("Classificação: Obesidade grau 2");
        } else {
            System.out.println("Classificação: Obesidade grau 3");
        }

        sc.close();
    }
}