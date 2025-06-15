/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idedesemdias;

/**
 *
 * @author larad
 */

    import java.util.Scanner;
public class IdedesEmDias {
Scanner scanner = new Scanner(System.in);
        
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite os anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite os meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite os dias: ");
     
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade em dias: " + totalDias);
    }
}
