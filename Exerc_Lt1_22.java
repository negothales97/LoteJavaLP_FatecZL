/*
Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente

Nome do Programador: Thales Serra

Data de Desenvolvimento: 22/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_22{
    public static void main(String args[]) {
        int valor1, valor2;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NÚMERO"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NÚMERO"));
        if(valor1 >= valor2){
            JOptionPane.showMessageDialog(null, valor2 + " - " + valor1);
        }
        else{
            JOptionPane.showMessageDialog(null, valor1 + " - " + valor2);
        }
    }
}