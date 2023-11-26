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
public class Exercicio02 {

    public static double nota01, nota02, nota03, media;
    public static String nome;

    public static void main(String[] args) {

        nome = JOptionPane.showInputDialog("Escreva seu nome:");

        nota01 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota02 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        nota03 = Double.parseDouble(JOptionPane.showInputDialog("Digite e terceira nota:"));

        media = (nota01 + nota02 + nota03) / 3;

//        JOptionPane.showMessageDialog(null, "Seu nome e: " + nome + "\n" +"Sua media e: " + media);
//        JOptionPane.showMessageDialog(null,media);
//        if(media > 0 ){
//            JOptionPane.showMessageDialog(null, "Media maior que zero");
//        }else{
//            JOptionPane.showMessageDialog(null, "Media  menor ou igual a zero");
//        }
        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Parabens voce foi aprovado");
        } else if (media >= 5) {
            JOptionPane.showMessageDialog(null, "Aluno em recuperacao");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno reprovou");
        }
    }
}
