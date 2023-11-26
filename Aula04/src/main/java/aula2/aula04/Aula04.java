/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aula2.aula04;

import javax.swing.JOptionPane;

/**
 *
 * @author 72782
 */
public class Aula04 {

    public static int numero01, numero02, numero03, media;

    public static void main(String[] args) {

        numero01 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro numero: "));

        numero02 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo numero: "));

        numero03 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o terceiro numero: "));

        media = (numero01 + numero02 + numero03) / 3;

        if (media > 20) {
            JOptionPane.showMessageDialog(null, "Media maior que 20: ");
        } else if (media < 15) {
            JOptionPane.showMessageDialog(null, "Media menor que 15: ");
        }
    }
}
