package listas01;

import javax.swing.JOptionPane;

public class MediaLista {

    public static void main(String[] args) {

        String[] aluno = new String[4];
        double[] media = new double[4];
        String txt = "Reprovando", resultado = "";

        for (int i = 0; i < aluno.length; i++) {
            aluno[i] = JOptionPane.showInputDialog("Digite o nome do aluno: " + (i + 1));
            aluno[i] += " " + txt;
            for (int j = 0; j < 3; j++) {
                media[i] += Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j + 1)));
            }
            if (media[i] >= 7) {
                txt = "Aprovado";
            } else if ((media[i] / 3) >= 5) {
                txt = "Recuperacao";
            }
            resultado += aluno[i] + "Tem media: " + ((media[i] / 3) + txt);
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
