/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author 72782
 */
public class Aula01 {
    
    public static  int n1,n2,soma;
    public static String nome,sobrenome;

    public static void main(String[] args) {
//       n1= 1;
//      n2= 2;
       
       nome= JOptionPane.showInputDialog("Digite seu nome: ");
       sobrenome= JOptionPane.showInputDialog("Digite seu sobrenome");
       
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
       
       soma= n1+n2;
       
        System.out.println(soma);
        
        //System.out.println(n1-n2);
        
        //System.out.println(nome);
        
        JOptionPane.showMessageDialog(null, "Seu nome e: " + nome + " " +sobrenome );     
        
        JOptionPane.showMessageDialog(null, soma );   
       
    }
}
