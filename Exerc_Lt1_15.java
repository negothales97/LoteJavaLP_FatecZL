/*
Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa

Nome do Programador: Thales Serra

Data de Desenvolvimento: 19/02/2018

 */
import javax.swing.JOptionPane;
public class Exerc_Lt1_15{
    public static void main(String args[]){
        double cateto1, cateto2, hipotenusa;
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO CATETO: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO OUTRO CATETO: "));
        hipotenusa = ((cateto1 * cateto1) + (cateto2 * cateto2));
        JOptionPane.showMessageDialog(null, "A HIPOTENUSA É DE " + hipotenusa);
    }
}