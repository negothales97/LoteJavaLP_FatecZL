/*
Objetivo: Receba os valores em x e y.
Efetua a troca de seus valores e mostre seus conteúdos

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_06{
    public static void main(String args[]){
        int num1, num2, inversor;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO"));
        inversor = num1;
        num1 = num2;
        num2 = inversor;
        JOptionPane.showMessageDialog(null,"VALORES INVERTIDOS: " + num1 + " - " + num2);
    }
}