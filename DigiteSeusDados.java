/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digiteseusdados;

/**
 *
 * @author larad
 */
import java.util.Scanner; // Importa a classe Scanner
public class DigiteSeusDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Dados do Usuário ---");

        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine(); // Lê a linha completa (incluindo espaços) para o nome

        System.out.print("Digite sua Data de Nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine(); // Lê a data de nascimento como string

        System.out.print("Digite seu Curso: ");
        String curso = scanner.nextLine(); // Lê o curso

        System.out.print("Digite sua Série: ");
        String serie = scanner.nextLine(); // Lê a série

        System.out.print("Digite sua Altura (em metros, ex: 1.75): ");
        double altura = scanner.nextDouble(); // Lê a altura como double

        System.out.print("Digite seu Peso (em kg, ex: 70.5): ");
        double peso = scanner.nextDouble(); // Lê o peso como double

        // Consumir a linha restante após nextDouble() para evitar problemas com nextLine() posterior
        scanner.nextLine(); 

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.printf("Altura: %.2f m%n", altura); // Formata altura com 2 casas decimais
        System.out.printf("Peso: %.1f kg%n", peso); // Formata peso com 1 casa decimal

        scanner.close();
    }
}