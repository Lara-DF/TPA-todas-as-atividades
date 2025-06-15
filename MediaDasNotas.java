/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediadasnotas;

/**
 *
 * @author larad
 */
 import java.util.Scanner; // Importa a classe Scanner para entrada de dados
public class MediaDasNotas {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.println("--- Calculadora de Média de 4 Notas ---");

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble(); // Lê a primeira nota como um número decimal

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble(); // Lê a segunda nota

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble(); // Lê a terceira nota

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble(); // Lê a quarta nota

        double media = (nota1 + nota2 + nota3 + nota4) / 4; // Calcula a média

        System.out.printf("A média das notas é: %.2f%n", media); // Exibe a média formatada com 2 casas decimais

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }
}
