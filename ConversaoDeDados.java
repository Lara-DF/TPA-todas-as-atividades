/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaodedados;

/**
 *
 * @author larad
 */
   import javax.swing.JOptionPane;
public class ConversaoDeDados {
  public static void main(String[] args) {
        int a, b, c, d, r;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4º número:"));

        r = a + b + c + d;

        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + r);
    }
}