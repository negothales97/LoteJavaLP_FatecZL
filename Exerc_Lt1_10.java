/*
Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_10{
    public static void main(String args[]){
        double num1, num2, diferenca;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO: ")); 
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO: "));
        diferenca = num1 - num2; //Colocar um IF
        JOptionPane.showMessageDialog(null, "O A DIFERENCA DOS VALORES É DE " + diferenca);
    }
}