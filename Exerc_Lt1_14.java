/*
Objetivo: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo

Nome do Programador: Thales Serra

Data de Desenvolvimento: 19/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_14{
    public static void main(String args[]){
        double ang1, ang2, ang3;
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO 1º ANGULO: "));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO 2º ANGULO: "));
        ang3 = (360 - (ang1 + ang2));
        JOptionPane.showMessageDialog(null, "O ANGULO 3 É DE " + ang3);
    }
}