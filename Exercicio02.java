//2 Classificação de Triângulos:
//Escreva um programa que solicite ao usuário os comprimentos dos
//três lados de um triângulo e classifique-o como equilátero, isósceles ou escaleno.
package lista05;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado C: ");
        double ladoC = scanner.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            // Classificação
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("O triângulo é Equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os comprimentos informados não formam um triângulo válido.");
        }

        scanner.close();
    }
}
