/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantidadedesalariosminimos;

/**
 *
 * @author larad
 */
import java.util.Scanner;
public class QuantidadedeSalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Digite o salário do usuário: R$ ");
        double salarioUsuario = scanner.nextDouble();

        double quantidade = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha %.2f salários mínimos.\n", quantidade);
    }
}


