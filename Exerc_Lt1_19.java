/*
Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles

Nome do Programador: Thales Serra

Data de Desenvolvimento: 22/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_19{
    public static void main(String args[]) {
        double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM NUMERO: "));   
        num2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO: "));   
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "O " + num1 + " É O MAIOR NÚMERO");
        }
        else{
            if(num1 == num2){
                JOptionPane.showMessageDialog(null, "O NÚMERO " + num1 + " E O NUMERO " + num2  + " SÃO IGUAIS");
            }
            else{
                JOptionPane.showMessageDialog(null, "O NÚMERO " + num1 + " É O MAIOR NÚMERO");
            }
        }
    }
}