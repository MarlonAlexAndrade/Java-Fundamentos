package aula2.exercicios;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] numeros = new int[2];
        
       numeros[0] = 1;
       numeros[1] = 2;
        
       JOptionPane.showMessageDialog(null, numeros[0]+numeros[1]);
    }
}
