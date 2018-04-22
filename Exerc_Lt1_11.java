/*
Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência 

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_11{
    public static void main(String args[]){
        double raio, comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O RAIO DA CIRCUNFERÊNCIA:"));
        comprimento = 2 * 3.14 * raio;
        JOptionPane.showMessageDialog(null, "O COMPRIMENTO DA CIRCUNFERÊCNIA É DE " + comprimento);
    }
}