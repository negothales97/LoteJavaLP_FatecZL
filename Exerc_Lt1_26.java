/*
Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor

Nome do Programador: Thales Serra

Data de Desenvolvimento: 24/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_26{
    public static void main(String args[]) {
        int num1, num2, multiplo;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO: "));
        if(num1 >= num2){
            multiplo = num1%num2;
            if(multiplo == 0){
                JOptionPane.showMessageDialog(null, "O NUMERO " + num1 + " É MÚLTIPLO DE " + num2);
            }
            else{
                JOptionPane.showMessageDialog(null, "O NUMERO " + num1 + " NÃO É MÚLTIPLO DE " + num2);
            }
        }
        else{
            multiplo = num2%num1;
            if(multiplo == 0){
                JOptionPane.showMessageDialog(null, "O NUMERO " + num2 + " É MÚLTIPLO DE " + num1);
            }
            else{
                JOptionPane.showMessageDialog(null, "O NUMERO " + num2 + " NÃO É MÚLTIPLO DE " + num1);
            }
        }
    }
}