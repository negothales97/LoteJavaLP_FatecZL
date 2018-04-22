/*
Objetivo: Receba a base e a altura de um triângulo e calcule a sua área

Nome do Programador: Thales Serra

Data de Desenvolvimento: 18/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_03{
    public static void main(String args[]){
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A BASE"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A ALTURA"));
        area = (altura * base)/2;
        JOptionPane.showMessageDialog(null, "A AREA É DE: " + area);
    }
}