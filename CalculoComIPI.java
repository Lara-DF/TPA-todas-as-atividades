/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculocomipi;

/**
 *
 * @author larad
 */
    import java.util.Scanner;
public class CalculoComIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        System.out.print("Código da peça 1: ");
        int cod1 = scanner.nextInt();
        System.out.print("Valor unitário da peça 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade da peça 1: ");
        int quant1 = scanner.nextInt();

        System.out.print("Código da peça 2: ");
        int cod2 = scanner.nextInt();
        System.out.print("Valor unitário da peça 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade da peça 2: ");
        int quant2 = scanner.nextInt();

        double total = (valor1 * quant1 + valor2 * quant2) * (1 + ipi / 100);

        System.out.printf("Valor total a pagar com IPI: R$ %.2f\n", total);
    }
}

