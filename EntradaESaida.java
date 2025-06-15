/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradaesaida;

/**
 *
 * @author larad
 */
    import javax.swing.JOptionPane;
public class EntradaESaida {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número:");

        JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero);
    }
}


