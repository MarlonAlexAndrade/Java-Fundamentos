/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author 72782
 */
public class Exercicio04 {

    public static String produto01, produto02, resultado, menu;
    public static double precoProduto01, precoProduto02, valor, soma, troco;

    public static void main(String[] args) {

        produto01 = JOptionPane.showInputDialog("Digiteo o nome do produto: ");
        precoProduto01 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de produto: "));

        produto02 = JOptionPane.showInputDialog("Digiteo o nome do produto: ");
        precoProduto02 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de produto: "));

        soma = precoProduto01 + precoProduto02;

        soma = 0;

        for (int i = 0; i < 10; i++) {

            menu = JOptionPane.showInputDialog(null, "Digite: \n 1: " + produto01 + " : " + precoProduto01 + "\n"
                    + "2: " + produto02 + " : " + precoProduto02);
        }
         if (menu.equalsIgnoreCase("1")) {
                soma = soma + precoProduto01;
                
            } else if (menu.equalsIgnoreCase("2")) {
                
                soma = soma+precoProduto02;
        }

        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que sera pago: "));

        troco = valor - soma;

        resultado = String.format("%.2f", troco);

        if (troco >= 0) {

            JOptionPane.showMessageDialog(null, "Seu troco e de: " + resultado);

        } else {
            JOptionPane.showMessageDialog(null, "O valor pago e insuficiente.");
        }

    }
}
