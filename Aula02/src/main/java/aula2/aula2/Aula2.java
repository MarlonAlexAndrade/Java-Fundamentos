/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aula2.aula2;

import javax.swing.JOptionPane;

public class Aula2 {

    public static double nota01, nota02, nota03, nota04, nota05, nota06, nota07, nota08, nota09, nota10, nota11, nota12;
    public static double media01, media02, media03, media04;
    public static String nome01, nome02, nome03, nome04;
    public static int nAluno;

    public static void main(String[] args) {

        nome01 = JOptionPane.showInputDialog("Digite o nome do aluno: ");

        nota01 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota02 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        nota03 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        nome02 = JOptionPane.showInputDialog("Digite o nome do aluno: ");

        nota04 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota05 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        nota06 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        nome03 = JOptionPane.showInputDialog("Digite o nome do aluno: ");

        nota07 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota08 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        nota09 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        nome04 = JOptionPane.showInputDialog("Digite o nome do aluno: ");

        nota10 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota11 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        nota12 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        media01 = (nota01 + nota02 + nota03) / 3;
        media02 = (nota04 + nota05 + nota06) / 3;
        media03 = (nota07 + nota08 + nota09) / 3;
        media04 = (nota10 + nota11 + nota12) / 3;

        if (media01 >= 7) {
            JOptionPane.showMessageDialog(null, "Parabens"+ nome01+"voce foi aprovado");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media01);
        } else if (media01 >= 5) {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome01+" em recuperacao");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media01);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome01+" em Reprovou");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media01);
        }

        if (media02 >= 7) {
            JOptionPane.showMessageDialog(null, "Parabens"+ nome02+" voce foi aprovado");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media02);
        } else if (media02 >= 5) {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome01+" em recuperacao");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media02);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome02+" em Reprovou");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media02);
        }

        if (media03 >= 7) {
            JOptionPane.showMessageDialog(null, "Parabens"+ nome03+" voce foi aprovado");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media03);
        } else if (media03 >= 5) {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome03+" em recuperacao");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media03);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome03+" em Reprovou");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media03);
        }

        if (media04 >= 7) {
            JOptionPane.showMessageDialog(null, "Parabens"+ nome04+" voce foi aprovado");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media04);
        } else if (media04 >= 5) {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome04+" em recuperacao");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media04);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno"+ nome04+" em Reprovou");
            JOptionPane.showMessageDialog(null, "Sua nota foi: " + media04);
        }

    }
}
