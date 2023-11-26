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
public class Exercicio03 {

    public static String produto01, produto02, resultado, menu;
    public static double precoProduto01, precoProduto02, valor, soma, troco;

    public static void main(String[] args) {

        produto01 = JOptionPane.showInputDialog("Digiteo o nome do produto: ");
        precoProduto01 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de produto: "));

        produto02 = JOptionPane.showInputDialog("Digiteo o nome do produto: ");
        precoProduto02 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de produto: "));

        soma = precoProduto01 + precoProduto02;
        
        int contador = 0;
        boolean loop = true;
        soma= 0;

        while (loop) {
            
            menu = JOptionPane.showInputDialog(null, "Digite: \n 1: " + produto01 + " : " + precoProduto01 + "\n"
                    + "2: " + produto02 + " : " + precoProduto02);
            
            if(contador >=4){
                loop=false;
               }
            }
            if (menu.equalsIgnoreCase("sair")) {
                loop = false;

            } else if (menu.equalsIgnoreCase("1")) {
                soma = soma + precoProduto01;
                contador = contador+1;

            } else if (menu.equalsIgnoreCase("2")) {
                soma = soma+precoProduto02;
                contador = contador+1;
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
