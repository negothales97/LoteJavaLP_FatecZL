/*
Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados 

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_09{
    public static void main(String args[]){
        int num1, num2, soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO: ")); 
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO: "));
        soma = (num1 * num1) + (num2 * num2);
        JOptionPane.showMessageDialog(null,"A SOMA DOS QUADRADOS É " + soma);
    }
}