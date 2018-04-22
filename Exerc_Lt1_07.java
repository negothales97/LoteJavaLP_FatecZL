/*
Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_07{
    public static void main(String args[]){
        double comprimento, largura, altura, volume;
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O COMPRIMENTO:"));
        largura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A LARGURA:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A ALTURA:"));
        volume = (comprimento * altura * largura);
        JOptionPane.showMessageDialog(null,"O VOLUME É DE: " + volume);
    }
}