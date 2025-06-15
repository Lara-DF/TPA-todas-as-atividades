/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadanumerica;

/**
 *
 * @author larad
 */
 import java.util.Scanner; // Importa a classe Scanner
public class TabuadaNumerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Gerador de Tabuada Numérica ---");

        System.out.print("Digite um número inteiro para ver a tabuada: ");
        int numero = scanner.nextInt(); // Lê um número inteiro

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) { // Loop de 1 a 10
            System.out.println(numero + " x " + i + " = " + (numero * i)); // Exibe o resultado da multiplicação
        }

        scanner.close();
    }
}
